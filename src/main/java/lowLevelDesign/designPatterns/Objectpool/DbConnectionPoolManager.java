package lowLevelDesign.designPatterns.Objectpool;

import java.util.ArrayList;
import java.util.List;

public class DbConnectionPoolManager {

    private List<DbConnection> freeConnectionPool;
    private List<DbConnection> inUseConnectionPool;
    private Integer INITIAL_SIZE;
    private Integer MAX_SIZE;

    private static volatile DbConnectionPoolManager instance;

    private DbConnectionPoolManager() {
        freeConnectionPool = new ArrayList<>();
        inUseConnectionPool = new ArrayList<>();
        INITIAL_SIZE = 3;
        MAX_SIZE = 6;
        for (int i = 0; i < INITIAL_SIZE; i++) {
            freeConnectionPool.add(new DbConnection());
        }
    }

    public static DbConnectionPoolManager getInstance() {
        if (instance == null) {

            synchronized (DbConnectionPoolManager.class) {
                if (instance == null) {
                    instance = new DbConnectionPoolManager();

                }
            }
        }
        return instance;
    }

    public synchronized DbConnection getConnection() {

        if (inUseConnectionPool.size() == MAX_SIZE && freeConnectionPool.isEmpty()) {
            System.out.println("No connections left !");
            return null;
        } else if (inUseConnectionPool.size() < MAX_SIZE && freeConnectionPool.isEmpty()) {
            System.out.println("Added one available connection !");
            freeConnectionPool.add(new DbConnection());
        }

        DbConnection connection = freeConnectionPool.remove(freeConnectionPool.size() - 1);
        inUseConnectionPool.add(connection);
        return connection;
    }

    public synchronized void releaseConnection(DbConnection connection) {
        inUseConnectionPool.remove(connection);
        freeConnectionPool.add(connection);
    }


}

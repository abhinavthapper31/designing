package lowLevelDesign.designPatterns.Objectpool;

public class DbConnection {
    Integer connectionId;
    String name;

    public void open() {
        System.out.println("Connection opened");
    }

    public void close() {
        System.out.println("Connection closed");

    }


}

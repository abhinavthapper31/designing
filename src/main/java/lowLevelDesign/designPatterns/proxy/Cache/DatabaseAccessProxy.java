package lowLevelDesign.designPatterns.proxy.Cache;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DatabaseAccessProxy implements IDatabaseAccess {

    List<Employee> storage;
    private DatabaseAccess access;


    DatabaseAccessProxy() {
        this.access = new DatabaseAccess();
        storage = new ArrayList<>();
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {

        Employee employeeFromCache = storage.stream().filter(employee -> Objects.equals(employee.getId(), employeeId)).findFirst().orElse(null);
        if (employeeFromCache != null) {
            return employeeFromCache;
        }
        Employee emp = access.getEmployeeById(employeeId);
        this.storage.add(emp);
        return emp;
    }
}

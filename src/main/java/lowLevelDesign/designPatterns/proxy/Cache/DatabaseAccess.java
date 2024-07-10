package lowLevelDesign.designPatterns.proxy.Cache;

import java.util.List;

public class DatabaseAccess implements IDatabaseAccess {

    // DB connectors fields

    public Employee getEmployeeById(Integer employeeId) {

        // employee from db
        return new Employee("Jake", "mathews");
    }
}

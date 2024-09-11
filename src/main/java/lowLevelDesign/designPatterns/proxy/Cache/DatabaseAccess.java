package lowLevelDesign.designPatterns.proxy.Cache;


public class DatabaseAccess implements IDatabaseAccess {

    // DB connectors fields
    public Employee getEmployeeById(Integer employeeId) {

        // employee from db
        return new Employee("Jake", "mathews");
    }
}

package lowLevelDesign.designPatterns.proxy.Cache;

public class App {

    public static void main(String[] args) {
        IDatabaseAccess dbProxy = new DatabaseAccessProxy();

        // Accessing employee data
        Employee employee = dbProxy.getEmployeeById(1);
        if (employee != null) {
            System.out.println("Employee Found: " + employee.getFirstName() + " " + employee.getLastName());
        } else {
            System.out.println("Employee Not Found");
        }
    }
}

package lowLevelDesign.designPatterns.proxy.Cache;

public class App {

    /*
    * When we want to provide controlled access of a functionality to someone else
    *
    *
    *
    * */
    public static void main(String[] args) {
        IDatabaseAccess access = new DatabaseAccessProxy();

        // Accessing employee data
        Employee employee = access.getEmployeeById(1);
        if (employee != null) {
            System.out.println("Employee Found: " + employee.getFirstName() + " " + employee.getLastName());
        } else {
            System.out.println("Employee Not Found");
        }
    }
}

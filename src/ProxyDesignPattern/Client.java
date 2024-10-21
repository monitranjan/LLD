package ProxyDesignPattern;

public class Client {
    public static void main(String[] args) {
        try {
            EmployeeDAO employeeDAO = new EmployeeDaoProxy();
            employeeDAO.create("ADMIN", new Employee());
            System.out.println("operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

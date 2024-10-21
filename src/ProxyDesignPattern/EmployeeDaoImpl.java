package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDAO{

    @Override
    public void create(String client, Employee emp) throws Exception {
        System.out.println("created new row in employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("deleted data for empId: "+employeeId);
    }

    @Override
    public Employee getSalary(String client, int employeeId) throws Exception {
        System.out.println("fetching data from db");
        return new Employee();
    }
}

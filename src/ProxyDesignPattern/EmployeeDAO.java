package ProxyDesignPattern;

public interface EmployeeDAO {
    public void create(String client, Employee emp) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public Employee getSalary(String client, int employeeId) throws Exception;
}

package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDAO{
    EmployeeDAO employeeDAO;
    EmployeeDaoProxy(){
        employeeDAO = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee emp) throws Exception {
        if(client.equals("ADMIN")){
            employeeDAO.create(client,emp);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDAO.delete(client,employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee getSalary(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDAO.getSalary(client,employeeId);
        }
        throw new Exception("Access Denied");
    }
}

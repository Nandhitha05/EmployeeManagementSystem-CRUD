package employee;

public interface EmployeeDao {
    public void createEmployee();
    public void showAllEmployee();
    public void showEmployeeOnId(int id);
    public void updateEmployee(int id, String name);
    public void deleteEmployee(int id);
}

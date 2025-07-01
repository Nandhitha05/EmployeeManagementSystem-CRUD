package employee;
import java.sql.*;
import java.util.Scanner;
public class EmployeeImpl implements EmployeeDao {
    Connection con;
    @Override
    public void createEmployee() {
        con = DBConnection.createDBConnection();
        try {
            String query = "INSERT INTO employee(id, name, salary, age) VALUES(?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(query);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee Id: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();
            pstm.setInt(1, id);
            pstm.setString(2, name);
            pstm.setDouble(3, salary);
            pstm.setInt(4, age);
            int rowAffected = pstm.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Employee Added Successfully!");
            } else {
                System.out.println("Employee Addition Failed");
            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        }
    }

    @Override
    public void showAllEmployee() {
        con = DBConnection.createDBConnection();
        if (con == null) {
            System.out.println("Failed to establish a database connection.");
            return; 
        }
        try {
            String query = "SELECT * FROM employee";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                int age = rs.getInt("age");
                System.out.println(new Employee(id, name, salary, age));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void showEmployeeOnId(int id) {
        con = DBConnection.createDBConnection();
        try {
            String query = "SELECT * FROM employee WHERE id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id); 
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                int age = rs.getInt("age");
                System.out.println(new Employee(id, name, salary, age));
            } else {
                System.out.println("Employee Not Found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateEmployee(int id, String name) {
        con = DBConnection.createDBConnection();
        try {
            String query = "UPDATE employee SET name = ? WHERE id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, name);
            pstm.setInt(2, id);
            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        }
    }

    @Override
    public void deleteEmployee(int id) {
        con = DBConnection.createDBConnection();
        try {
            String query = "DELETE FROM employee WHERE id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Deletion Failed");
            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        }
    }
}

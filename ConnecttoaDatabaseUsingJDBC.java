import java.sql.*;

public class SimpleJDBC {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/mydatabase";  // Database URL
        String username = "root";  // Database username
        String password = "password";  // Database password
        
        // Try to connect to the database
        try {
            // 1. Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            
            // 2. Create a statement
            Statement statement = connection.createStatement();
            
            // 3. Execute a query (SELECT query to get data)
            String query = "SELECT * FROM users";  // Assume 'users' is a table in the database
            ResultSet resultSet = statement.executeQuery(query);
            
            // 4. Process the result (loop through the data)
            while (resultSet.next()) {
                // Get data from each row
                int id = resultSet.getInt("id");  // Get the 'id' column value
                String name = resultSet.getString("name");  // Get the 'name' column value
                
                // Display the result
                System.out.println("ID: " + id + ", Name: " + name);
            }
            
            // 5. Close the connection (done automatically in this example)
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();  // Print any error that occurs
        }
    }
}

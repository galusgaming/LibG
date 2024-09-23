package pl.galusgaming.bibliotekagraficzna.login;

import javafx.scene.control.TextField;

import java.sql.*;

public class Login {
    private TextField login;
    private TextField password;

    public void onLogin() {
        String url = "jdbc:mariadb://localhost:3306/yourDatabase";
        String user = "root";
        String passwd = "";
        String query = "SELECT * FROM workers WHERE login = ? AND password = ?";
        try (Connection conn = DriverManager.getConnection(url, user, passwd);
             PreparedStatement preparedStmt = conn.prepareStatement(query)) {
            preparedStmt.setString(1, login.getText());
            preparedStmt.setString(2, password.getText());
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

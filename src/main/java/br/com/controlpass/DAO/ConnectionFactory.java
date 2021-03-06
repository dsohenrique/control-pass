package br.com.controlpass.DAO;

import java.sql.Connection;
// conexão SQL para Java 
import java.sql.DriverManager;
// driver de conexão SQL para Java 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
// classe para tratamento de exceções 

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
          //  return DriverManager.getConnection("jdbc:mysql://localhost:3306/control_pass?useTimezone=true&serverTimezone=UTC", "root", "123456");
          //  return DriverManager.getConnection("jdbc:mysql://localhost:3306/control_pass?useTimezone=true&serverTimezone=UTC", "root", "");
          //  return DriverManager.getConnection("jdbc:mysql://172.16.48.10:3306/control_pass?useTimezone=true&serverTimezone=UTC", "ctrlpass", "ctrlpass");
            return DriverManager.getConnection("jdbc:mysql://200.168.206.197:3306/control_pass?useTimezone=true&serverTimezone=UTC", "ctrlpass", "ctrlpass");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}

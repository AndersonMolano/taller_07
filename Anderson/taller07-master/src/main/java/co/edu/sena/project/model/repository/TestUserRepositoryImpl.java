package co.edu.sena.project.model.repository;

import co.edu.sena.project.model.User;

import java.sql.*;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();
            System.out.println("==========Save obj Insert==========");
            User userInsert = new User();
            userInsert.setUser_firstname("Anderson");
            userInsert.setUser_lastmane("Molano");
            userInsert.setUser_email("hola@gmail.com");
            userInsert.setUser_pasword("hola123mosam");
            repository.SaveObj(userInsert);
            userInsert.setUser_firstname("Mateo");
            userInsert.setUser_lastmane("Juan");
            userInsert.setUser_email("gonzalo@gmail.com");
            userInsert.setUser_pasword("hola123");
            repository.SaveObj(userInsert);

            System.out.println("=========listAllObj============");
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("==========SaveObj(Update)===========");
            User userUpdate= new User();
            userUpdate.setUser_id(2);
            userUpdate.setUser_firstname("Juan");
            userUpdate.setUser_lastmane("Tovar");
            userUpdate.setUser_email("juan@gmail.com");
            userUpdate.setUser_pasword("hola123ssss");
            repository.SaveObj(userUpdate);
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("=========deleteObj=========");
            repository.deleteObj(2);
            repository.listAllObj().forEach(System.out::println);
    }
}

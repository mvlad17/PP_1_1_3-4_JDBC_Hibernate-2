package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
//        userService.removeUserById(3);
//        userService.createUsersTable();
//        userService.saveUser("Ivan", "Ivanov", (byte) 18);
//        userService.saveUser("Petr", "Petrov", (byte) 24);
        userService.saveUser("Alex", "Aleksandrov", (byte) 30);
//        userService.saveUser("Denis", "Denisov", (byte) 36);
//
//        List<User> users = userService.getAllUsers();
//        for(User user: users) {
//            System.out.println(user);
//        }

//        new UserServiceImpl().cleanUsersTable();
//
//        new UserServiceImpl().dropUsersTable();

    }
}

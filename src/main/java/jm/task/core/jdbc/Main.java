package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Johnny", "Depp", (byte) 60);
        userService.saveUser("Jim", "Carry", (byte) 63);
        userService.saveUser("Brad", "Pit", (byte) 59);
        userService.saveUser("Tom", "Hanks", (byte) 62);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

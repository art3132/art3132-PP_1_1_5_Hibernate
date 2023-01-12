package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserServiceImpl userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Ivan", "Smirnov", (byte) 21);
        userService.saveUser("Aleksey", "Dimirov", (byte) 40);
        userService.saveUser("Petr", "Sergeyev", (byte) 35);
        userService.saveUser("Konstantin", "Igorev", (byte) 28);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

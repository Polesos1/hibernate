package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Антон", "Картон", (byte) 33);
        userService.saveUser("Богдан", "Фонтан", (byte) 29);
        userService.saveUser("Кирилл", "Курилл", (byte) 17);
        userService.saveUser("Наташа", "Три_Рубля_И_Наша", (byte) 22);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

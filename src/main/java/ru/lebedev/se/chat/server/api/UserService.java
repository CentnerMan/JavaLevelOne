package ru.lebedev.se.chat.server.api;

import ru.lebedev.se.chat.server.model.User;

import java.util.List;

public interface UserService {

    boolean register(String login, String password);

    List<String> getListLogin();

    User getUser(String login);

    void createUser(String login, String password);

    int getCountUser();

    void removeAll();

    boolean isLoginExists(String login);

    void removeUser(String login);
}

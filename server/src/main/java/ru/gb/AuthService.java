package ru.gb;

public interface AuthService {
    String getNicknameByLoginAndPassword(String login, String password);
}

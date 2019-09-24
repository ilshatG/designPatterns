package ru.job4j.Observer;

public interface Subject {
    void registerPlayer(Observer observer);
    void removePlayer(Observer observer);
}

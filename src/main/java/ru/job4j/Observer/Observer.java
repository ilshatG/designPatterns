package ru.job4j.Observer;

public interface Observer {
    void update(Integer value);
    void registerWin(Observer observer);
}

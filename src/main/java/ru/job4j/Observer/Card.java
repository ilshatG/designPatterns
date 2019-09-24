package ru.job4j.Observer;

public interface Card {
    Card generate();
    void checkValue(Integer value);
    boolean checkWin();
}

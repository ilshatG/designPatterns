package ru.job4j.Factory;

public interface MusicBank {
    void add(Music music);
    void remove(Music music);
    Music find(String name);
}

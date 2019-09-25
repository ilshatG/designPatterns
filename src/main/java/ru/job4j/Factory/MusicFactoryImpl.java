package ru.job4j.Factory;

public class MusicFactoryImpl implements MusicFactory{
    private MusicBank bank;

    MusicFactoryImpl(MusicBank bank) {
        this.bank = bank;
    }
    public Music of(String name) {
        return bank.find(name);
    }
}

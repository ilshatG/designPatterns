package ru.job4j.Factory;

public class MusicImpl implements Music {
    String name;

    public MusicImpl(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Play " + name);
    }

    public void pause() {
        System.out.println("Pausing " + name);
    }

    public void stop() {
        System.out.println("Stop " + name);
    }

    public String getName() {
        return name;
    }

}

package ru.job4j.Factory;

public class Player {
    public static void main(String[] args) {

        MusicBank bank = new MusicBankImpl();
        bank.add(new MusicImpl("tili tili trali vali"));
        bank.add(new MusicImpl("po muromskoy dorojke"));
        bank.add(new MusicImpl("murka"));

        MusicFactory factory = new MusicFactoryImpl(bank);

        Music music = factory.of("murka");
        music.play();
        music.pause();
        music.stop();
    }
}

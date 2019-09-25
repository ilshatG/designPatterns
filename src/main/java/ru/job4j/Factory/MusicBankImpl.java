package ru.job4j.Factory;

import java.util.HashMap;
import java.util.Map;

public class MusicBankImpl implements MusicBank{
    private Map<String, Music> musics = new HashMap<String, Music>();

    public void add(Music music) {
        musics.put(music.getName(), music);
    }

    public void remove(Music music) {
        musics.remove(music.getName());
    }

    public Music find(String name) {
        return musics.get(name);
    }
}

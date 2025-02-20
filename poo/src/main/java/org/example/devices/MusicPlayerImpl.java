package org.example.devices;

import org.example.interfaces.MusicPlayer;

public class MusicPlayerImpl implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing Music!");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Music!");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selectin music " + music);
    }
}

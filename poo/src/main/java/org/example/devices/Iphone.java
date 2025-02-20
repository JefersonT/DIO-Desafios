package org.example.devices;

import org.example.interfaces.Browser;
import org.example.interfaces.MusicPlayer;
import org.example.interfaces.Telephone;

public class Iphone implements Browser, Telephone, MusicPlayer {

    @Override
    public void displayPage(String url) {
        System.out.println("displaying Page " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Opening a new Tab");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating Page");
    }

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

    @Override
    public void call(String number) {
        System.out.println("Calling to number " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting a Voicemail");
    }
}

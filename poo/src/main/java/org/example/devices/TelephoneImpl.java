package org.example.devices;

import org.example.interfaces.Telephone;

public class TelephoneImpl implements Telephone {
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

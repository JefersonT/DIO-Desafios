package org.example.devices;

import org.example.interfaces.Browser;

public class BrowserImpl implements Browser {
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
}

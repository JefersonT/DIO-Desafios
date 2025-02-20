package org.example;

import org.example.devices.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Open page");
            System.out.println("2 - Open new tab");
            System.out.println("3 - Refresh page");
            System.out.println("4 - Play music");
            System.out.println("5 - Pause music");
            System.out.println("6 - Select music");
            System.out.println("7 - Make a call");
            System.out.println("8 - Answer a call");
            System.out.println("9 - Start voicemail");
            System.out.println("0 - Exit");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    iphone.displayPage(url);
                    break;
                case 2:
                    iphone.addNewTab();
                    break;
                case 3:
                    iphone.updatePage();
                    break;
                case 4:
                    iphone.play();
                    break;
                case 5:
                    iphone.pause();
                    break;
                case 6:
                    System.out.print("Enter the name of the song: ");
                    String music = scanner.nextLine();
                    iphone.selectMusic(music);
                    break;
                case 7:
                    System.out.print("Enter the number to call: ");
                    String number = scanner.nextLine();
                    iphone.call(number);
                    break;
                case 8:
                    iphone.answer();
                    break;
                case 9:
                    iphone.startVoicemail();
                    break;
                case 0:
                    System.out.println("Closing...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }

    }
}
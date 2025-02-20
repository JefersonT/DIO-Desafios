package org.example;

import org.example.domain.Account;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Por favor, digite o número da Agência !");
        account.setAgencia(scanner.next());
        System.out.println("Por favor, digite o número da Conta !");
        account.setNumeroConta(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente !");
        account.setNomeCliente(scanner.nextLine());
        System.out.println("Por favor, digite o Saldo !");
        account.setSaldo(scanner.nextDouble());


        System.out.println("Olá " + account.getNomeCliente() + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+ account.getAgencia() +"," +
                " conta "+ account.getNumeroConta() +" e seu saldo "+ account.getSaldo() +" já está disponível para saque.");
    }
}
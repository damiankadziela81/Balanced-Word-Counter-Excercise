package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BalancedWordCounter balancedWordCounter = new BalancedWordCounter();
        System.out.println("Enter word:");
        Scanner scanner = new Scanner(System.in);
        int count = balancedWordCounter.count(scanner.next());
        System.out.println("Your word has " + count + " balanced subwords");
    }
}
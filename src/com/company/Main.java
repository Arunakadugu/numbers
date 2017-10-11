package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("enter a number:");
        Scanner keyboard = new Scanner(System.in);
        int userNumber = keyboard.nextInt();
        int counter = 0;
        while (counter <= userNumber) {
            if (counter == userNumber) {
                System.out.print(counter);

            } else
                System.out.print(counter + ",");
            counter++;
        }
    }
}

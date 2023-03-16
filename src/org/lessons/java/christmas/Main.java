package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> wishList = new ArrayList<>();

        boolean stop = false;

        System.out.print("Nome? ");
        String name = scan.nextLine();

        System.out.print("Indirizzo? ");
        String address = scan.nextLine();

        while (!stop) {
            try {
                System.out.print("Inserisci un desiderio: ");
                String newWish = scan.nextLine();
                wishList.add(newWish);
                Collections.sort(wishList);

                System.out.println(wishList);


            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            System.out.print("Vuoi uscire? (y/n): ");
            stop = scan.nextLine().equalsIgnoreCase("y");
        }

        System.out.println("Arrivederci! ");

        ChristmasLetter newWishList = new ChristmasLetter(name, address, wishList);

        try {
            newWishList.send();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}

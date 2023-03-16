package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Collection list per inserire la lista dei desideri
        List<String> wishList = new ArrayList<>();

        boolean stop = false;

        //chiedo all'utente di inserire un desiderio fin quando decide di uscire
        while (!stop) {
            System.out.print("Inserisci un desiderio: ");
            String newWish = scan.nextLine();
            wishList.add(newWish);

            System.out.println(wishList);
            System.out.print("Vuoi uscire? (y/n): ");
            stop = scan.nextLine().equalsIgnoreCase("y");
        }

        System.out.println("Arrivederci! ");

    }
}

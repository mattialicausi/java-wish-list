package org.lessons.java.christ_2;

import java.util.*;

public class Main {

    //funzione per contare i desideri
    public static Map<String, Integer> contaDesideri(List<String> desideri) {

        Map<String, Integer> conteggi = new HashMap<>();

        for (String desiderio : desideri) {

            if (conteggi.containsKey(desiderio)) {
                int count = conteggi.get(desiderio);
                conteggi.put(desiderio, count + 1);
            } else {
                conteggi.put(desiderio, 1);
            }
        }

        return conteggi;
    }

    // funzione per rimuovere i duplicati dalla lista
    public static Set<String> desideriUnici(List<String> desideri) {
        Set<String> setDesideriUnici = new HashSet<>(desideri);
        return setDesideriUnici;
    }

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

        System.out.println("Desiderio, numero di volte richiesto " + contaDesideri(wishList));

        System.out.println("Rimuovi duplicati: " + desideriUnici(wishList));

        try {
            newWishList.send();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}

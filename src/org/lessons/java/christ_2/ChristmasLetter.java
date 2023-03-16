package org.lessons.java.christ_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {
    private String name;
    private String address;

    List <String> wishList = new ArrayList<>();

    public ChristmasLetter(String name, String address, List<String> wishList) {
        this.name = name;
        this.address = address;
        this.wishList = wishList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    //metodi
    public List<String> send() throws Exception {
        if (wishList.size() > 5) {
            throw new Exception("Spiacente, puoi mandare massimo 5 desideri");
        }

        Random rand = new Random();
        double num = rand.nextInt(2);

        if (num == 0) {
            throw new Exception("Spiacente sei stato cattivo, non puoi mandare la lista");
        } else {
            System.out.println("Ciao: " + getName() + " la tua lista dei desideri: " + wishList  + " è stata spedita qui " + getAddress());
        }

        return wishList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChristmasLetter that = (ChristmasLetter) o;

        if (!getName().equals(that.getName())) return false;
        if (!getAddress().equals(that.getAddress())) return false;
        return getWishList().equals(that.getWishList());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getWishList().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ChristmasLetter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", wishList=" + wishList +
                '}';
    }
}

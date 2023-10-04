package ait.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainInput {
    public static void main(String[] args) throws FileNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("book.dat"))) {
            Product p1 = (Product) is.readObject();
            System.out.println(p1);


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


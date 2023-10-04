package ait.homework;

import java.io.*;

public class MainOutput {

    public static void main(String[] args) throws IOException {

        Product p1 = new Product("Tapki", 15.35, 100, 10);
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("book.dat"))) {
            os.writeObject(p1);
            System.out.println(p1);
        }
    }


}

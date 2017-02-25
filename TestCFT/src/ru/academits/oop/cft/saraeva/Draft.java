package ru.academits.oop.cft.saraeva;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Евгения on 18.02.2017.
 */
public class Draft {
    public  static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter("Result");
        Scanner scanner = new Scanner(new FileInputStream("ArrayOfNumbers"))) {
            while (scanner.hasNextInt()){
                int ArrayOfNumbers = scanner.nextInt();
                writer.println(scanner.nextInt());
            }

        }
    }

    }
















       /* String country1="812";
        String country2="820";

       System.out.println(country1.compareTo(country2)>0);*/



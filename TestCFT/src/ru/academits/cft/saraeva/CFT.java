package ru.academits.cft.saraeva;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Евгения on 05.03.2017.
 */
public class CFT {
    public static void main(String[] args) {
        /*for (int i = 0; i < args.length; ++i) {
            System.out.println(args[i]);
        }*/
        ArrayList<String> data = new ArrayList<>(0);
        try (Scanner scanner = new Scanner(new FileInputStream(args[0]))) {
            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            //TODO
            e.printStackTrace();
        }
    }
}



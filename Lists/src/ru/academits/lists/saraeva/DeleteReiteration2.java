package ru.academits.lists.saraeva;

import java.util.ArrayList;

/**
 * Created by Евгения on 25.02.2017.
 */
public class DeleteReiteration2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(7);
        arrayList.add(16);
        arrayList.add(7);
        ArrayList<Integer> resultArray = new ArrayList<>();

        for (int i = 0; i < arrayList.size() - 1; ++i) {
            if (resultArray.contains(arrayList.get(i))) {
                continue;
            }
            resultArray.add(arrayList.get(i));
        }
        System.out.println(resultArray);
    }
}


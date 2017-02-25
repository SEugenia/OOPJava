package ru.academits.lists.saraeva;

import java.util.ArrayList;

/**
 * Created by Евгения on 25.02.2017.
 */
public class DeleteReiteration2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(7);
        arrayList.add(16);
        arrayList.add(7);
        ArrayList<Integer> resultArray = new ArrayList<>();

        for (Integer anArrayList : arrayList) {
            if (resultArray.contains(anArrayList)) {
                continue;
            }
            resultArray.add(anArrayList);
        }
        System.out.println(resultArray);
    }
}


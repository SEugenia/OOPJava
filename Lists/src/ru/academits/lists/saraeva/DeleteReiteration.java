package ru.academits.lists.saraeva;

import java.util.ArrayList;

/**
 * Created by Евгения on 24.02.2017.
 */
public class DeleteReiteration {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        /*arrayList.add(11);
        arrayList.add(11);
        arrayList.add(7);
        arrayList.add(16);
        arrayList.add(7);*/
        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.add(arrayList.get(0));

        for (int i = 0; i < arrayList.size() - 1; ++i) {
            int k = i;
            int j = i + 1;
            while (k > 0 && arrayList.get(j) != arrayList.get(k)) {
                --k;
            }
            if (k == 0 && arrayList.get(j) != arrayList.get(k)) {
                resultArray.add(arrayList.get(j));
            }
        }
        System.out.println(resultArray);
    }
}





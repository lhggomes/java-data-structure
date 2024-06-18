package org.example.algorithms.shorta;

public class InsertShort {

    public static void shortArray(int[] intArray){

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){

            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i - 1];

            }

            intArray[i] = newElement;
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}

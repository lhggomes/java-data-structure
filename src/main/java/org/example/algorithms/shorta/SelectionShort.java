package org.example.algorithms.shorta;

public class SelectionShort {

    public static void shortArray(int[] intArray ){

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for (int i  = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }


    public static void swap(int[] array, int i, int j){

        if (i == j){
            return;
        }

        int temp  = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

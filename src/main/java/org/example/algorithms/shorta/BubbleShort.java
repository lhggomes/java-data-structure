package org.example.algorithms.shorta;

public class BubbleShort {

    public static void shortArray(int[] intArray){

        for (int lastUnSortedIndex = intArray.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--){
            for (int i = 0; i < lastUnSortedIndex; i++){
                if (intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i+1);
                }
            }
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

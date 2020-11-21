package com.zipcodewilmington.assessment2.part2;
import java.util.Arrays;
import java.io.*;
public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] storeAltered= new Integer[array1.length+array2.length];
//        for (int i = 0; i < array1.length; i++) {
//            storeAltered[i]=array1[i];
//        }
//        int j=0;
//        for (int i = array1.length; i < storeAltered.length; i++) {
//            storeAltered[i]=array2[j];
//            j++;
//        }

      System.arraycopy(array1,0,storeAltered,0,array1.length);
      System.arraycopy(array2,0,storeAltered, array1.length, array2.length);
      return storeAltered;

    }

    public Integer[] rotate(Integer[] array, Integer index) {
     Integer[] storeAltered = new Integer[array.length];
     Integer[] storetheFirstIndex= new Integer[index];
        for (int i = 0; i < index; i++) {
            storetheFirstIndex[i]=array[i];
        }
        int k=0;
        for(int j= index;j< array.length;j++)
        {
            storeAltered[k]= array[j];
            k++;
        }

        System.arraycopy(storetheFirstIndex,0,storeAltered,k,index);


//     int j=0;
//        for (int i = index-1 ; i < array.length-index; i++) {
//             storeAltered[j]=array[i+1];
//             j++;
//        }
//        int g=0;
//        for (int k = array.length-index ; k < array.length; k++) {
//            storeAltered[k]=array[g];
//            g++;
//        }
        return storeAltered;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}

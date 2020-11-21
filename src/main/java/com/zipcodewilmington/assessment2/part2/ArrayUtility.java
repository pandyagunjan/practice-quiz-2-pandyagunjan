package com.zipcodewilmington.assessment2.part2;
import java.util.Arrays;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

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

        return storeAltered;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(valueToEvaluate)){
                count++;
            }
        }
        for (int j = 0; j < array2.length; j++) {
            if (array2[j].equals(valueToEvaluate)){
                count++;
            }
        }
        return count;

    }

    public Integer mostCommon(Integer[] array) {
        Map<Integer,Integer> hp = new HashMap<Integer,Integer>();

        for (int i = 0; i < array.length; i++) {
            if(hp.containsKey(array[i]))
            {
              //  Integer value=array[i];
                hp.replace((array[i]),hp.get(array[i]),hp.get(array[i])+1);
            }
            else
            {
                hp.put((array[i]),1);
            }

        }
        int maxValueInMap=(Collections.max(hp.values()));
        int maxValuesKey=0;
        for (Map.Entry<Integer, Integer> entry : hp.entrySet()) {  // Iterate through hashmap
            if (entry.getValue()==maxValueInMap) {
                maxValuesKey= entry.getKey();     // Print the key with max value
            }
        }

        return maxValuesKey;
    }
}

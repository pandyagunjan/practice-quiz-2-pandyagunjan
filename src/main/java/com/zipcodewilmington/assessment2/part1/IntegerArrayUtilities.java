package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length%2==0);
    }

    public Integer[] range(int start, int stop) {
        int length = (stop+1) - start;

        Integer[] range = new Integer[length];
        for (int i = 0; i < range.length; i++)
        {
            range[i] = start;
            start++;
        }
        return range;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        Integer storeResult=array[0]+array[1];

        return (array[0]+array[1]);
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int length =array.length;
        return (array[length-2]*array[length-1]);
    }
}

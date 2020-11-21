package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.*;

public class ListUtility {
    private List<Integer> list=  new ArrayList<>();

    public Boolean add(Integer i) {
        this.list.add(i);
        return true;
    }

    public Integer size() {
        return list.size();
    }
    public List<Integer> getUnique() {
        Set<Integer> unique= new HashSet<Integer>();
        for (Integer integer : list) {

         unique.add(integer);

        }
        return  new ArrayList<>(unique);
    }

    public String join() {
    StringBuilder sb= new StringBuilder();
        for (Integer integer : list) {
            if(list.indexOf(integer) ==0)
            {
                sb.append(integer);
            }
            else {
                sb.append(", " + integer);
            }
          }
        return sb.toString();

//        StringBuilder string = new StringBuilder();
//        for (Integer e: needThis) {
//            if(needThis.indexOf(e) != 0) {
//                string.append(", ").append(e);
//            } else {
//                string.append(e);
//            }
////            StringBuilder joinedNums = new StringBuilder();
////            joinedNums.append(list);
////            return joinedNums.toString().replace("[", "").replace("]", "");
//        }
       // return String.valueOf(string);

    }
    public Integer mostCommon() {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (Integer i : list){
            if (count.containsKey(i))
                count.put(i, count.get(i) + 1);
            else
                count.put(i, 0);
        }
        Map.Entry<Integer, Integer> mostCommon = null;
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if (mostCommon == null || entry.getValue() > mostCommon.getValue())
                mostCommon = entry;
        }
        return mostCommon.getKey();
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}

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
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}

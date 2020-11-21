package com.zipcodewilmington.assessment2.part2;

import com.sun.tools.corba.se.idl.StringGen;

import java.util.*;
import java.util.Map;

public class Router {
    HashMap<String,String> hp;

    public Router() {
        this.hp=new LinkedHashMap<>();
    }

    public void add(String path, String controller) {
        this.hp.put(path,controller);

    }

    public Integer size() {
        return hp.size();
    }

    public String getController(String path) {
        return hp.get(path);
    }

    public void update(String path, String studentController) {
        this.hp.replace(path ,studentController );
    }

    public void remove(String path) {
        this.hp.remove(path);
    }
    @Override
    public String toString()
    {
        StringBuilder str= new StringBuilder();

        for (Map.Entry<String,String> entry : hp.entrySet()) {  // Iterate through hashmap
          str.append(entry.getKey()).append(entry.getValue()).append("\n");
        }

       return str.toString();
    }

}

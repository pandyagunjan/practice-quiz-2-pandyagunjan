package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    Map<String,String> hp=new HashMap<String,String>();
    public void add(String path, String controller) {
        this.hp.put(path,controller);

    }

    public Integer size() {
        return null;
    }

    public String getController(String path) {
        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
    }
}

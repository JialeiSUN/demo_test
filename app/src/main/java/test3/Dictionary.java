package test3;

import java.util.HashMap;

public class Dictionary {
    private String nameD;
    private HashMap<String,String> traduction;
    public Dictionary(String name){
        nameD = name;
        traduction = new HashMap<String,String>();
    }
    public String getName(){
        return nameD;
    }
    
    public String gettraduction(String name){
        return traduction.get(name);
    }
    public void addtraduction(String fr, String en){
        this.traduction.put(fr,en);
    }
}

package test3;

import java.util.HashMap;
import java.util.List;
public class Dictionary {
    private String nameD;
    private HashMap<String,List<String>> traduction;
    public Dictionary(String name){
        nameD = name;
        traduction = new HashMap<String,List<String>>();
    }
    public String getName(){
        return nameD;
    }
    
    public List<String> gettraduction(String name){
        return traduction.get(name);
    }
    public void addtraduction_key(String fr,List<String> en){
        int count = 0;
        for(String key : this.traduction.keySet()){
            if(key == fr){
                count = 1;
            }
        }
        if(count == 0){
            this.traduction.put(fr,en);
        }
        else{
            System.out.println("Mot exsite");
        }
        
    }
    public void addNewTraduction(String fr, String en){
        int count = 0;
        int count_tradu = 0;
        for(String key : this.traduction.keySet()){
            if(key != fr){
                count = 1;
            }
        }
        if(count == 0){
            for(String i: this.gettraduction(fr)){
                if(i == en){
                    count_tradu = 1;
                }
        }
        if(count_tradu == 0){
            this.gettraduction(fr).add(en);
        }
        else{
            System.out.println("Mot exsite");
        }
        
    }

}
    public String getInverse(String name){
        String ret = null;
        for(String key : this.traduction.keySet()){
            for(String i: this.gettraduction(key)){
                if(i == name){
                    ret = key;
                }
            }
        }
        return ret;
    }

}

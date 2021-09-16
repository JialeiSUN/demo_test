package test3;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
    
    public List<String> getMultipleTranslations(String name){
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
            for(String i: this.getMultipleTranslations(fr)){
                if(i == en){
                    count_tradu = 1;
                }
        }
        if(count_tradu == 0){
            this.getMultipleTranslations(fr).add(en);
        }
        else{
            System.out.println("Mot exsite");
        }
        
    }

}
    public String getInverse(String name){
        String ret = null;
        for(String key : this.traduction.keySet()){
            for(String i: this.getMultipleTranslations(key)){
                if(i == name){
                    ret = key;
                }
            }
        }
        return ret;
    }
    public void WriterTraduction() throws IOException{
        FileWriter fw = new FileWriter("test.txt");
        BufferedWriter bufw = new BufferedWriter(fw);
        bufw.write(this.getName());
        bufw.newLine();
        for(String key : this.traduction.keySet()){
            for(String i: this.getMultipleTranslations(key)){
                bufw.write(key);
                bufw.write("=>");
                bufw.write(i);
                bufw.newLine();
            }
        }
        bufw.flush();
        bufw.close();
    }
    

}

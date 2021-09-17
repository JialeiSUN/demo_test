package test3;

import java.io.IOException;

public class DictionaryParser {
    private Dictionary dict;
    public IDictionary loadTranslations(IlineReader reader) {
        String key = null;
        String value = null;  
        String line = null;  
        try{
            int count = 0;
            while((line=reader.readLine())!=null){ 
                if(count == 0){
                    dict = new Dictionary(line);
                }
                else{
                    key = line.substring(0,line.indexOf("="));
                    // System.out.println(key);
                     value = line.substring(line.indexOf(">")+1,line.length());
                   //  System.out.println(value);
                     if(line!=null){
                         dict.addNewTraduction(key,value);
                     }
                }
               count++;
            }
        }catch(IOException e){
            System.out.println(e);
        }
        return dict;
        }

}

package test3;
import java.util.List;
import java.io.IOException;
public interface IDictionary {
    public List<String> getMultipleTranslations(String name);
    public void addtraduction_key(String fr,List<String> en);
    public void addNewTraduction(String fr, String en);
    public String getInverse(String name);
    public void WriterTraduction() throws IOException;
    public String getName();
}

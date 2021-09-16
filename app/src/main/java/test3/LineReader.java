package test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
public class LineReader implements IlineReader {
    private BufferedReader reader;
    public LineReader(Reader in){
        reader = new BufferedReader(in);
    }
    @Override
    public String readLine() throws IOException{
        return reader.readLine();
    }
}

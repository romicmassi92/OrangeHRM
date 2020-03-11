package WebExercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    static Properties prop;
    static FileInputStream input;
    //static String fileName = "config.properties";
    static String fileLocation = "src/test/resources/TestData/config.properties";

    public String getProperty(String key){
        prop = new Properties();
        try{
            input = new FileInputStream(fileLocation );
            prop.load(input);

        }catch(IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}


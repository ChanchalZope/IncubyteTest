package CoreLogic;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    
	public static String getProperty(String key) {
        Properties properties = new Properties();
        try (FileInputStream fs = new FileInputStream("src/test/resources/configuration.properties")) 
        {
            properties.load(fs); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);    }
    }



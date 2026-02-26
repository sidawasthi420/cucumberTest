package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop = null;

    private static void loadProperties() {
        if (prop == null) {
            prop = new Properties();
            try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")) {
                if (input == null) {
                    System.out.println("Sorry, unable to find config.properties");
                    return;
                }
                prop.load(input);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static String getProperty(String key) {
        if (prop == null) {
            loadProperties();
        }
        return prop.getProperty(key);
    }
}

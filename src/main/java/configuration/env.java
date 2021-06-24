package configuration;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class env {
    public static final Properties CONFIG = read();
    private static final String CONFIG_PATH = "properties.properties";
    public static Properties read() {
        Properties properties = new Properties();
        try(InputStream reading = new FileInputStream(CONFIG_PATH)) {
            properties.load(reading);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}

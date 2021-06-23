package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SettingConfigFile {

    public Properties setConfig() {
        Properties properties = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("properties.properties");
            properties.load(input);
            return properties;
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
        return properties;
    }
}

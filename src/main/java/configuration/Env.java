/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 *
 * @author Edson Anawaya Rios
 */
package configuration;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class reads a properties file.
 */
public class Env {
    public static final Properties CONFIG = read();
    private static final String CONFIG_PATH = "config.properties";

    /**
     * Gets the values inside a properties file.
     *
     * @return the read properties.
     */
    public static Properties read() {
        Properties properties = new Properties();
        try (InputStream reading = new FileInputStream(CONFIG_PATH)) {
            properties.load(reading);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}

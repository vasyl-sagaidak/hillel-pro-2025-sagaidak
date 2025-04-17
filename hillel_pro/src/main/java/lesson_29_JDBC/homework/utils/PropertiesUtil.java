package lesson_29_JDBC.homework.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertiesUtil {
    private static final Properties PROPERTIES = new Properties();

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try (InputStream inputStream = PropertiesUtil.class.getClassLoader()
                .getResourceAsStream("application.properties")) {
            if (inputStream == null) {
                throw new RuntimeException("Файл application.properties не знайдено в ресурсах!");
            }
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }

    private PropertiesUtil() {
    }
}

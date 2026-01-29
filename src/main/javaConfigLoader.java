import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
    public static Properties load() {
        Properties props = new Properties();
        try (InputStream is =
                 ConfigLoader.class.getClassLoader()
                     .getResourceAsStream("app.properties")) {
            if (is != null) {
                props.load(is);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return props;
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Util {

    public static String find(String sourcePath, String pattern) {
        byte[] buffer = null;

        try {
            buffer = Files.readAllBytes(Paths.get(sourcePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(buffer == null){
            return null;
        }
        String source = new String(buffer, UTF_8);

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(source);
        if(matcher.find()){
            return source.substring(matcher.end() - 16, matcher.end());
        }else return null;
    }
}

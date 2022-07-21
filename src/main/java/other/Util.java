package other;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Util{
    public static String toBase64(String text){
        byte[] base64Bytes = Base64.getEncoder().encode(text.getBytes(StandardCharsets.UTF_8));
        return new String(base64Bytes);
    }
    public static String toText(String base64){
        byte[] textBytes;
        try{
            textBytes = Base64.getDecoder().decode(base64.getBytes(StandardCharsets.UTF_8));
        }catch (IllegalArgumentException illArgs){
            System.err.println(illArgs.getMessage());
            return "";
        }
        return new String(textBytes);
    }
}

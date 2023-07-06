package IOStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NonBlockingIO {
    public static void main(String[] args) {
        Path path = Paths.get("test.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"))){
            writer.write("To be, or not to be. That is the question.");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}

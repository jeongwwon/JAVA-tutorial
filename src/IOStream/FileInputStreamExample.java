package IOStream;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileChannel fileChannel = FileChannel.open(Paths.get("test.txt"),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            String data = "Hello World";
            ByteBuffer buffer = StandardCharsets.UTF_8.encode(data);
            int byteCnt = fileChannel.write(buffer);
            System.out.println("Bytes written: " + byteCnt);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

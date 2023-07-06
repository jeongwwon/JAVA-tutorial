package IOStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class BasicIOTest {
    public static void main(String[] args) {
        InputStream in = System.in;
        OutputStream out = System.out;

        int input;
        try {
//            System.out.print("## Input 1~3 character: ");
//            // input 1byte from keyboard
//            input = in.read();
//            System.out.println("## 1byte read and print");
//            System.out.println(input);
//            out.write(input);
//            //out.flush();


			// input 3byte from keyboard
			byte[] b = new byte[3];
			in.read(b);
			System.out.println("## 3byte read and print");
			out.write(b);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

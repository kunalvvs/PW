package Practice.IO;
import java.io.*;

public class FileReader3 {
    public static void main(String[] args) throws IOException {
        
        File kk = new File("/workspaces/PW/Practice/IO/Testing Folder");

        File k1 = new File(kk,"new.txt");
        FileReader f1 = new FileReader(k1);

        char ch[] = new char[(int)k1.length()];


        f1.read(ch);

        for(char d:ch)
        {
            System.out.print(d);
        }

    }
}

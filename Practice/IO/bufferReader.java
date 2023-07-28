package Practice.IO;
import java.io.*;
public class bufferReader {
    public static void main(String[] args) throws Exception {
         File fil =new File("/workspaces/PW/Practice/IO/Testing Folder");
        
        File f = new File(fil,"new.txt");
        
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String s = br.readLine();
    
        while(s!=null)
        {
            
            System.out.print(s);
            s=br.readLine();
        }

    }
}

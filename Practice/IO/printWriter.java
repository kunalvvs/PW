package Practice.IO;

import java.io.*;

public class printWriter {
    public static void main(String[] args) throws Exception {
         File fil =new File("/workspaces/PW/Practice/IO/Testing Folder");
        
        File f = new File(fil,"new.txt");
        
        FileWriter fr = new FileWriter(f);
        PrintWriter br = new PrintWriter(fr);

        br.println("Heku");
        br.println("Hello it is print by the print writter method");
        br.println(23);
        br.close();//it is neccesary
        System.out.println("Executed");
        

    

    }
}

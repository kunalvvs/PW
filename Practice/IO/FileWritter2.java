package Practice.IO;
import java.io.*;

public class FileWritter2 {
    public static void main(String[] args) throws Exception  {
        
        File lo =new File("/workspaces/PW/Practice/IO/Testing Folder/");
      
        // lo.createNewFile();

        File l = new File(lo,"new.txt");

        FileWriter fl =new FileWriter(l, true);

        fl.write("Hello friend welcome to the java here we can play few activity\n");
        fl.write("\n");
        fl.write(65);
         fl.write("\n");

        fl.write(66);
         fl.write("\n");
        fl.write(69);
         fl.write("\n");
         fl.write("234 34");
         
        fl.close();

        System.out.println("File will be modified");
        
    }
}

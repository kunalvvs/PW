package Practice.IO;
import java.io.*;
public class bufferWritter {
    public static void main(String[] args)  {

        File fil =new File("/workspaces/PW/Practice/IO/Testing Folder");
        
        File f = new File(fil,"new.txt");
        try{
        FileWriter f1 = new FileWriter(f,true);
        BufferedWriter b = new BufferedWriter(f1);
        b.write("Hi i am here ");
        b.newLine();
        b.write("Now ir");
         b.close();
        }
        catch(Exception e){System.out.println(e);}
     
        

            
    }
}

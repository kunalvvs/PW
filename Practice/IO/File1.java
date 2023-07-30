package Practice.IO;
import java.io.*;
import java.util.*;

class sec{
    void met()
    {
        System.out.println("Hello this is other class inside the method");
    }
}
public class File1 implements Serializable {
    public static void main(String[] args) throws Exception {
        File h = new File("/workspaces/PW/Practice/IO/Testing Folder");
        // h.mkdir();
        File k = new File(h,"pw.txt");
        // k.createNewFile();
        // System.out.println(h.exists());
        // System.out.println(k.isFile());   
        
        File l = new File("Practice");
        for(Object o:l.list())
        {
            System.out.println(o);
        }
        
    }
}

package Practice.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class cho implements Serializable 
{
    private String name;
    int age;

    cho(String name,int age)
    {
        this.name=name;
        this.age=age;
        disp();

    }

    void disp()
    {
        System.out.println("Name : "+name+"\n"+"Age : "+age);
    }


}


public class Serialization__Deserial {
    public static void main(String[] args) throws Exception {

        // cho c = new cho("Kunal", 50);
        // System.out.println(" ---------------------");

        // FileOutputStream fo = new FileOutputStream("/workspaces/PW/Practice/IO/Testing Folder/new.txt", true);
        // BufferedOutputStream bo = new BufferedOutputStream(fo);
        // ObjectOutputStream os = new ObjectOutputStream(bo);
        // os.close();


        FileInputStream fi = new FileInputStream("/workspaces/PW/Practice/IO/Testing Folder/new.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);
        ObjectInputStream oi = new ObjectInputStream(bi);

        cho ou = (cho)oi.readObject();

        ou.disp();

        oi.close();

       
        
    }
}

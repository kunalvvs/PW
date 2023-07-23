package Hospital_Management;

import java.util.Scanner;

interface enter{
    public void reg();
    
}
public class Register
{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Register r = new Register();
        enter o = new Entry();
        New oe= new New();
        o.reg();
        oe.reg1();
    }
}



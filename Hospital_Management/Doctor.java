package Hospital_Management;

import java.util.Scanner;

public class Doctor extends Entry{
    void met()
    {
        System.out.println("Which doctor do you want \nPhyscian\nRadiologist\nNeurocergen");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        switch(ch)
        {
            case "Physcian":
            System.out.println("Physcians: Dr.Ajay Sharma ");
            reg();
            break;
            case "Radiologist":
            System.out.println("Dr.Titu Verma");
            reg();
            break;
            case "Neurocergun":
            System.out.println("Dr.Amir Usain");
            reg();
            break;
            default:
            System.out.println("Inccorrect");
        }
        
        
        
    }
}


package Hospital_Management;

import java.util.Scanner;

public class Doctor extends Entry{
    void met()
    {
        System.out.println("Which doctor do you want \nPhysician\nRadiologist\nNeurosurgen");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        switch(ch)
        {
            case "Physician":
            System.out.println("Physcians: Dr.Ajay Sharma\nDr.Rahul Rajput ");
            reg();
            break;
            case "Radiologist":
            System.out.println("Dr.Titu Verma\nDr.Shubh Agarwal");
            reg();
            break;
            case "Neurosurgen":
            System.out.println("Dr.Amir Usain\nDr.B.K Gupta");
            reg();
            break;
            default:
            System.out.println("Choose Doctor to checkup");
        }
        
        
        
    }
}


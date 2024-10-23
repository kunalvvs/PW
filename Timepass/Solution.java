package Timepass;
// import java.io.*;
// import java.util.*;
// import java.lang.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         // int ID[];
//         // String name[];
//         // float cgpa[];
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i=0; i<n;i++)
//         {
//             // int ID = sc.nextInt();
//             // for(i=0; i<n;i++){
//             // String name = sc.nextLine();}
//             // for(i=0; i<n;i++){
//             // float cgpa = sc.nextFloat();}
//             int ID[] = new int[45];
//             ID[i] = sc.nextInt();
//             String name[] = new String[45];
//             name[i] = sc.nextLine();
//             float cgpa[] = new float[45];
//             cgpa[i] = sc.nextFloat();

//            System.out.println(cgpa[i]);
//         }
//     }
// }






// import java.io.*;
// import java.util.*;

// interface AdvancedArithmetic {
//      int divisor_sum(int n);
// }
// class MyCalculator implements AdvancedArithmetic
// {
    
//     public int divisor_sum(int n)
//     {
//         System.out.println("I implemented: AdvancedArithmetic");
//         return 0;
//     }
// }

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc  = new Scanner(System.in);
//         int n  = sc.nextInt();
//         // int a[]  = new int[30];
//         int sum=0;
        
//           for(int i = 1;i<=n;i++)
//         {
//             if(n%i==0)
//             {
//                 sum=sum+i;
//             }
            
//         }
//         MyCalculator ob = new MyCalculator();
//         ob.divisor_sum(0);
//         // System.out.println("I implemented: AdvancedArithmetic");
//         System.out.println(sum);
        
//     }
// }



// import java.io.*;
// import java.util.*;
// abstract class A{
//     abstract void  met(String s1);
// }
// class B extends A
// {
//     public void met(String s1)
      
//     {
        
//         System.out.println("The title is: " +s1);
//     }
// }
// public class Solution {
   

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc =new Scanner(System.in);
//         String s1 = sc.nextLine();
        
//         B ob = new B();
//         ob.met(s1);
//         Solution s = new Solution();
        
//     }
// }


// import java.io.*;
// import java.util.*;

// public class Solution {


//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
//         // Scanner sc = new Scanner(System.in);
//         try(Scanner sc = new Scanner(System.in)){
//              int a  =sc.nextInt();
//         int b = sc.nextInt();
//             int res = a/b;
//             System.out.println(res);
//         }
//         catch(InputMismatchException e)
//         {
//             System.out.println("java.util.InputMismatchException");
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
        
        
//     }
// }



// import java.io.*;
// import java.util.*;

// interface Lam{
//     void isEven(int a[] , int b[]);
//     // void isPrime(int a[],int b[]);
//     // void isPalindrome(int a[],int b[]);
//     // void isOdd(int a[],int b[]);
//     // void isComposite(int a[],int b[]);
// }

// public class Solution {

    // public static void main(String[] args) {
    //     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    //     Scanner sc =new Scanner(System.in);
        
    //     int n = sc.nextInt();
    //     int a[] = new int[50];
    //     int b[] = new int[50];
    //     for (int i=0;i<n;i++)
    //     {
    //        a[i] = sc.nextInt();
    //        b[i]=  sc.nextInt();
            
//         }
//         // Lam l = (a[i],B) ->{
//         //     System.out.println(a[i]);
//         // };
       
          
        
//         // for(int i=0;i<n;i++){
//         // System.out.print(a[i]+" ");
//         // System.out.println(b[i]);
//         // }
//     }
// }


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         sc.nextLine();
         String s1[] = new String[n];
         int s2[] = new int[n];
         
         for (int i=0;i<n;i++){
             s1[i] = sc.nextLine();
              s2[i] = sc.nextInt();
              sc.nextLine();
              sc.close();
         }
         
         System.out.println("Senior Member");
         System.out.println("Spend: "+s2[0]);
         System.out.print("Budget Left: ");
         System.out.println(100-s2[0]);
         System.out.println("Junior Member");
         System.out.println("Spend: "+s2[1]);
         System.out.print("Budget Left: ");
         System.out.println(50-s2[1]);
         System.out.println("Senior Member");
         System.out.println("Spend: "+s2[2]);
         System.out.print("Budget Left: ");
         System.out.println(100-s2[2]);
         
    }
}
   
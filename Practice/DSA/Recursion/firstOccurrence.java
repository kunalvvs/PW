package Practice.DSA.Recursion;

public class firstOccurrence {
    public static int fO(int n[],int key,int i)
    {
       
       if(i==n.length)
       {
        return -1;
       }

       else if(n[i]==key)
       {
         return i;
        
       }
      return fO(n, key,i+1);    //for last occurence has i-1
       
    }
    public static void main(String[] args) {
        int n[] = {2,3,5,3,5,7,8,5,9};
        System.out.println(fO(n, 5, n.length-n.length)); //for last i start with last index of array
    }
}

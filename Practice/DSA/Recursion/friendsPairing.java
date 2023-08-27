package Practice.DSA.Recursion;

public class friendsPairing {
    public static int friendsPairProblem(int n){
        //base case
        if(n==1 || n==2)
        {
            return n;
        }
        // choice
        //single
        int s = friendsPairProblem(n-1);
        int pair = friendsPairProblem(n-2);
        int pairWays = n-1 * pair;

        int totalWays = s+pairWays;
        return totalWays; //we can return above 4 lines in single line
    }
    public static void main(String[] args) {
        System.out.println(friendsPairProblem(2));
    }
}

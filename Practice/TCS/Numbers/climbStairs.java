package Practice.TCS.Numbers;

class climbStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args) {
        climbStairs cs = new climbStairs();
        System.out.println(cs.climbStairs(2)); // prints 5
    }
}
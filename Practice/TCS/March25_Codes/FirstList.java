package Practice.TCS.March25_Codes;

import java.util.*;

public class FirstList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = n; i <= n1; i++) {
            numbers.add(i);
        }
        
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        
        System.out.println(sum);
        
        sc.close();
    }
}


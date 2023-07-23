package Practice.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//it is scanner code of hashset
public class ExtraPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String pair = scanner.nextLine();
            pairs.add(pair);
            System.out.println(pairs.size());
        }

        scanner.close();
    }
}
 


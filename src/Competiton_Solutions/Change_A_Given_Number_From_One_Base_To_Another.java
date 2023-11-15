import java.util.*;
import java.math.BigInteger;

public class Change_A_Given_Number_From_One_Base_To_Another
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int base1 = scan.nextInt();

        scan.nextLine();

        int base2 = scan.nextInt();

        scan.nextLine();

        String input = scan.nextLine();

        BigInteger num = new BigInteger(input, base1);

        String ans = num.toString(base2);

        System.out.println(ans);

        scan.close();
    }
}
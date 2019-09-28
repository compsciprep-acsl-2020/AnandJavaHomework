import java.util.*;


public class Binary {

        public static void main(String[]Args){

            Scanner s = new Scanner(System.in);

            int num = s.nextInt();

            int binary[] = new int[40];
            int thing = 0;

            while (num > 0) {
                binary[thing++] = num % 2;
                num = num / 2;
            }
            for (int i = thing - 1; i >= 0; i--) {
                System.out.print(binary[i]);

        }

        }

}


import java.util.*;
public class BinaryToCHMOD extends OctalToBinary{

    public static String CHMOD(int[][] a){
        String CHMOD = "";
        for(int i = 0; i <3; i++){

            for(int j = 0; j<3; j++){

                if(a[i][j] == 0){

                    CHMOD = CHMOD + "-";

                }

                else if( j == 0){

                    CHMOD = CHMOD + "r";

                }
                else if(j == 1){

                    CHMOD = CHMOD + "w";

                }

                else {

                    CHMOD = CHMOD + "x";

                }

            }
        }

        return CHMOD;

    }

    public static void main(String[]Args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number in octal and you will recieve the binary and chmod conversion");
        int oct = s.nextInt();
        String binary = "";

        int [][] bin = conversion(oct);

        for(int i = 0; i<3; i++){

            for(int j = 0; j<3; j++){

                if(bin[i][j] == 1){

                    binary = binary + "1";

                }

                else {

                    binary = binary + "0";

                }

            }

        }

        System.out.println("The binary is: " + binary);


        System.out.println("The CHMOD conversion is: " + CHMOD(conversion(oct)));

    }

}
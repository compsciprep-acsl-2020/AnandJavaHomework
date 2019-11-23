import java.util.*;
import java.lang.*;
import java.io.*;

public class NinetyNine {

    public static int getMax(ArrayList<Integer> a) {
        int max = a.get(0);
        for (int i = 0; i < a.size(); i++) {

            max = Math.max(max, a.get(i));
        }

        return max;

    }

    public static int isA(String val, int sum){
        if(val.equals("14")) {
            if (sum + 14 < 99) {

                return 14;
            }
            else  {

                return 1;
                }
            }
        if(val.equals("10"))
            return -10;

        return Integer.valueOf(val);
    }


    public static String[] format(String[] input) {

        String[] thing = input;

        for (int i = 0; i < input.length; i++) {

            String trial = thing[i].trim();

            switch (trial) {
                case "A":
                    thing[i] = "14";
                    break;
                case "T":
                    thing[i] = "10";
                    break;
                case "K":
                    thing[i] = "13";
                    break;
                case "Q":
                    thing[i] = "12";
                    break;
                case "J":
                    thing[i] = "11";
                    break;

                case "9":
                    thing[i] = "0";
                    break;
                default:
                    thing[i] = trial;

            }
        }
        return thing;
    }
    public static boolean checkSum(int sum){
        if(sum>99)
            return false;
        return true;
    }

    public static String game(String[]input){

        String[]deck = format(input);
        String returnVal = "";
        int sum = Integer.valueOf(deck[0]);
        ArrayList<Integer> hand = new ArrayList<Integer>();
        boolean dealerTurn = true;
        int index = 1;
        int i = 0;

        while(index<9) {
        for( i = index; i< index + 3; i++){

         hand.add((Integer.valueOf(deck[i])));

        }

            index = i;

            i = 1;
            int max = getMax(hand);
            System.out.println(isA(Integer.toString(max),sum));
            sum += isA(Integer.toString(max),sum);
            System.out.println(sum);
            if(sum>99)
                break;

            System.out.println("hi");
            System.out.println(deck[index]);

            hand.add(hand.lastIndexOf(max),Integer.valueOf((deck[index])));
            System.out.println(index);
            index++;

            dealerTurn = true;

            sum += isA((deck[index]),sum);
            if(sum>99)
                break;
            dealerTurn = false;
            System.out.println(sum);
            index++;
            sum += isA(Integer.toString(getMax(hand)),sum);

            System.out.println(deck[index]);
            hand.add(hand.lastIndexOf(max),Integer.valueOf(deck[index]));
            index++;
            dealerTurn = true;
            System.out.println(deck[index]);
            sum+= isA((deck[index]),sum);
            System.out.println(sum);
            if(sum>99)
                break;


        }
        return Integer.toString(sum);
    }
    public static void main(String[]Args) throws IOException{

        File file = new File("C:\\Users\\Anand Vinod\\Desktop\\input.txt");
        Scanner s = new Scanner(file);
        int i = 0;
        while(s.hasNextLine()&& i <5){


            String test = s.nextLine();
            String[] in = test.split(",");

            game(in);

            i++;
        }

    }
}

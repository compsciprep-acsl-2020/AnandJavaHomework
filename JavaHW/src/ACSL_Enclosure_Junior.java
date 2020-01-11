import java.util.*;
import java.io.*;
import java.lang.*;
public class ACSL_Enclosure_Junior {

    public static String parFind(String a){
        String [] test = a.split("");
        String val = "";

        for(String b: test ){

            if(b.equals("(")){

                val += ("t" + a.indexOf(b));

            }

            else if(b.equals(")")){

                val += ("f" + a.indexOf(b));

            }
        }

        return val;
    }

    public static ArrayList<Integer> parenPos(String c){

        String a = parFind(c);

        boolean alf;
        if(a.substring(0,1).equals("t"))
        alf = true;
        else
        alf = false;

        int pos = Integer.parseInt(a.substring(1,2));
        int len = c.length();
        ArrayList<Integer> posib = new ArrayList<Integer>();
        if(alf) {
            for (int i = 0; pos + 2 < len+1; i++) {
                if (i == 0 && pos+3<len+1)
                    pos = pos + 3;
                else
                    pos = pos + 2;

                posib.add(pos+2);
            }
        }

        else {
            for (int i = 0; pos - 2 > -1; i++) {
                if (i == 0 && pos -3 > -1)
                    pos = pos - 3;
                else
                    pos = pos - 2;

                posib.add(pos+1);
            }
        }
        return posib;
    }

    public static void main(String[]Args) throws IOException{

        File f = new File("C:\\Users\\Anand Vinod\\Desktop\\Enclose.txt");
       Scanner s = new Scanner(f);

       while(s.hasNextLine()){

           String a = s.nextLine();
           System.out.println(a);
           System.out.println(parenPos(a));

       }


    }
}

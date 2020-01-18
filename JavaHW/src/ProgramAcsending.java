import java.io.File;
import java.io.IOException;
import java.util.*;
public class ProgramAcsending {
    public static String reverse(String c){
        String x = "";

        for(int i = c.length(); i>0; i--)
            x+= c.substring(i-1,i);
        return x;
    }
    public static String acsend(String a){
        int la = Integer.parseInt(a.substring(0,1));
        String b =  a.substring(1);
        String x = "";
        String retVal ="";

       int lead = Integer.parseInt(b.substring(0,la));

       b = b.substring(la);

        x  = reverse(b);
       String testVal = "";

       String [] l = x.split("");
       String last =  l[l.length-1];
       System.out.println(Arrays.asList(l));
        retVal = Integer.toString(lead);
        testVal = l[0];

        if(a.length()<=1) {

        return a;
        }


            for(int j = 1; j < b.length(); j++) {

                if (lead < Integer.parseInt(testVal)) {

                    retVal += " " + testVal;
                    lead = Integer.parseInt(testVal);
                    testVal = l[j];

                }
                else {
                    testVal += l[j];


                }


            }

        if (lead < Integer.parseInt(testVal)) {

            retVal += " " + testVal;


        }





        return retVal;
    }

    public static void main(String[]Args) throws IOException {
        File file = new File("C:\\Users\\Anand Vinod\\Desktop\\input.txt");
        Scanner s = new Scanner(file);
        while(s.hasNextLine()) {
            String test = s.nextLine();
            System.out.println(acsend(test));
        }

    }
}

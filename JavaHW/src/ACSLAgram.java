import java.util.*;

public class ACSLAgram{

    public static String agram(ArrayList<String> input){

        String lead = input.get(0);

        int rank = Integer.valueOf(lead.substring(0,1));

        String suite = lead.substring(1,2);


        ArrayList<String> pos = new ArrayList<String>();

        for(int i = 1; i<input.size(); i++){


            if(((input.get(i).substring(1,2))).equals(suite)){

                pos.add(input.get(i));
            }

        }
        if(pos.size() == 0){
            return "NONE";
        }

        String chosenCard = pos.get(0);

        int currentRank = Integer.valueOf(pos.get(0).substring(0,1));
        int rankTest;
        String currentTest;
        for( int j = 0; j<pos.size(); j++){
            rankTest = Integer.valueOf((pos.get(j)).substring(0,1));

            currentTest = pos.get(j);

            if(rankTest > rank){

                if(rankTest < currentRank || !(currentRank>rank)){

                    chosenCard = currentTest;
                    currentRank = rankTest;


                }


            }
            else if(currentRank < rank){

                if(rankTest<currentRank){

                    chosenCard = currentTest;

                    currentRank = rankTest;

                }

            }




        }
        return chosenCard;
    }

    public static void main(String[]Args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter user input");

        String input = s.nextLine();

        for(int i = 0; i < input.length(); i ++){

            if(input.substring(i,i+1).equals(" ") || input.substring(i,i+1).equals(",")){

                input = input.substring(0,i) + input.substring(i+1);
            }
            if(input.substring(i,i+1).equals(" ") || input.substring(i,i+1).equals(",")){

                input = input.substring(0,i) + input.substring(i+1);
            }


        }
        ArrayList<String> in = new ArrayList<String>();

        for(int i = 0; i<input.length()-1; i+=2)
        {
            in.add(input.substring(i,i+2));

        }

        System.out.println(agram(in).substring(0,1) + ", " + agram(in).substring(1,2));
    }
}



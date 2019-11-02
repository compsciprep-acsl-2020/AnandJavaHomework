import java.io.*;
import java.util.*;
import java.lang.*;
public class Student {

    String name;
    String id;
    String zip;
    String school;

    public Student(String[]a){

        this.name = a[1];
        this.id = a[0];
        this.zip = a[2];
         this.school = a[3];

    }






    public static void main(String[]Args) throws IOException{

        File file = new File("C:\\Users\\Anand Vinod\\Desktop\\input.txt");

        Scanner s = new Scanner(file);
        Scanner bruh = new Scanner(System.in);
        String a = "";
        String[] thing;

        ArrayList<Student> lads = new ArrayList();
        for(int i = 0; i<10; i++){
            a = s.nextLine();

            thing = a.split("#");

            Student currentStudent = new Student(thing);

            lads.add(currentStudent);

        }
        System.out.println("Which student would you like?");

        int num = bruh.nextInt();

        System.out.println("What info would you like: press 1 for id, 2 for name, 3 for zip, and 4 for school");

        int choice = bruh.nextInt();

        String info ="";

        if(choice == 1)

            info = lads.get(num).id;

        if(choice == 2)

            info = lads.get(num).name;

        if(choice == 3)

            info = lads.get(num).zip;

        if(choice == 4)

            info = lads.get(num).school;

        System.out.println("Here is your info: " + info);

    }
}

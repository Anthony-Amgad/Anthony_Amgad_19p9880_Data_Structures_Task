import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] numarr = {3,50,21,1,22,55,21,100,2,68,70};
        Arrays.sort(numarr);

        System.out.println("\nThe array of numbers sorted is: ");
        for(int element : numarr)
            System.out.print(element + ", ");

        System.out.println("\nPlease enter the People in the format of (\"name\",\"age\"):\n");
        ArrayList<Person> personAL = new ArrayList<>();

        while(true){
            System.out.print("Please Enter data or '0' if you want to exit: ");
            String s = scan.nextLine();
            if (s.equals("0"))
                break;
            String[] temp = s.split(",",2);
            personAL.add(new Person(temp[0],Integer.valueOf(temp[1])));
        }

        System.out.println();

        for(Person element : personAL){
            System.out.println(element.getName() + " : " + element.getAge());
        }

    }

}

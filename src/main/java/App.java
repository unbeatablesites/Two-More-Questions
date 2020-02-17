import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("TWO MORE QUESTIONS, BABY!\n" +
                "\n" +
                "Think of something and I'll try to guess it!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Question 1) Does it stay inside or outside or both?");
        String input = scan.nextLine().toLowerCase();

        if(input.equals("inside")){
        doLogicForInside();
        }if(input.equals("outside")){
        doLogicForOutside();
        }if(input.equals("both"))
        doLogicForBoth();
    }


    public static void askQuestion(){


    }


    public static void doLogicForInside(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Question 2) Is it a living thing? yes or no?");
        String input = scan.nextLine().toLowerCase();
        if(input.equals("yes")){
            System.out.println("Then what else could you be thinking of besides a houseplant?!?\n");
        }

        if(input.equals("no")){
            System.out.println("Then what else could you be thinking of besides a \tshower curtain?!?\n");
            }

        }





    public static void doLogicForOutside(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Question 2) Is it a living thing? yes or no?");
        String input = scan.nextLine().toLowerCase();
        if(input.equals("yes")){
            System.out.println("Then what else could you be thinking of besides a bison?!?\n");
        }

        if(input.equals("no")){
            System.out.println("Then what else could you be thinking of besides a \tshower curtain?!?\n");
        }

    }

    public static void doLogicForBoth(){

        System.out.println("TWO MORE QUESTIONS, BABY!\n" +
                "\n" +
                "Think of something and I'll try to guess it!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Question 1) Does it stay inside or outside or both?");

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();

        System.out.println("Question 2) Is it a living thing? yes or no?");

        String input2 = scan.nextLine().toLowerCase();

        if(input.equals("both") && input2.equals("yes")){
            System.out.println("Then what else could you be thinking of besides a python?!?\n");
        }
        if(input.equals("both") && input2.equals("no")){
            System.out.println("Then what else could you be thinking of besides a python?!?\n");
        }

    }


}

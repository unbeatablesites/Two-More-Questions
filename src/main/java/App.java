import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        doLogicForInside();
    }


    public static void doLogicForInside(){

        System.out.println("TWO MORE QUESTIONS, BABY!\n" +
                "\n" +
                "Think of something and I'll try to guess it!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Question 1) Does it stay inside or outside or both?");

        Scanner input = new Scanner(System.in);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Question 2) Is it a living thing?");

        Scanner input2 = new Scanner(System.in);

        if(input.equals("outside") && input2.equals("alive")){
            System.out.println("Then what else could you be thinking of besides a python?!?\n");
        }



    }

}

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



    }

}

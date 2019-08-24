package keywords;

public class Calculator {

    public static void main(String[] args) {
        int number = 10;
        try {
            int result = 10 / 5;
            System.out.println(result);
        }catch(Exception ex){
            System.out.println("You can not divide a number by zero !");
        }
        System.out.println("You made it.");
    }
}

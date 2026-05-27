package ExceptionHandling;

public class exceptionhandling3 {

    public static void main(String[] args) {

        try {

            int a = 10 / 0;   // ArithmeticException

            String s = null;
            System.out.println(s.length());

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        } catch (NullPointerException e) {

            System.out.println("Null value found");

        } catch (Exception e) {

            System.out.println("Some other exception");

        }

        System.out.println("Program continues...");
    }
}
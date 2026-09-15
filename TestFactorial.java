public class TestFactorial {
    public static void main(String[] args) {

        long result = Factorial.factorial(5);

        if (result == 120)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");
    }
}
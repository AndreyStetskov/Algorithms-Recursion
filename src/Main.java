
@SuppressWarnings("InstantiationOfUtilityClass")
public class Main {
    public static void main(String[] args) {

        ExactPowerOfNumber.isExactPower(17, 0);


        AmountByDigitOfNumber number = new AmountByDigitOfNumber();
        System.out.println(number.sumOfDigit(1845));


        Fibonacci fibonacciNumber = new Fibonacci();
        System.out.println(Fibonacci.fibonacci(-7));


        String string = "madam";
        Palindrome.isPalindrome(string, 0, string.length() - 1);
    }
}
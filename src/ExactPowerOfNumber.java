// Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
// Операцией возведения в степень пользоваться нельзя!
@SuppressWarnings("ALL")
public class ExactPowerOfNumber {
    public static void isExactPower(int number, int power) { /* 2 is hard coding because power instead of 2 */
        if (power == 0) {
            System.out.println("Enter integer more than zero");
            return;
        }

        if (number == 1) {
            System.out.println("1 to any power equals 1");
            return;
        }


        if (number == 1) {
            System.out.println("NO");
        } else if (number == power || number == 0) {
            System.out.println("YES");
        }

        isExactPower(number / power, power);
    }
}

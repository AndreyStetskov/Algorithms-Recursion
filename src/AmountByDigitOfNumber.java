// Дано натуральное число N. Вычислите сумму его цифр.
// При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
@SuppressWarnings("ALL")
public class AmountByDigitOfNumber {
    int sum = 0;
    public int sumOfDigit(int number) {

        if (number == 0) {
            return sum;
        }

        sum += number % 10;
        sumOfDigit(number / 10);

        return sum;
    }
}

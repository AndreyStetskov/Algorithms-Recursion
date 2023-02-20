// Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
public class Fibonacci {
    public static int fibonacci(int element){
        if (element == 0) {
            return 0;
        } else if (element == 1 || element == -1) {
            return 1;
        } else if (element > 1) {
            return fibonacci(element - 2) + fibonacci(element - 1);
        } else {
            return fibonacci(element + 2) - fibonacci(element + 1);
        }
    }
}

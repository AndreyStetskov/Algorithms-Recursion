// Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.
public class Palindrome {
    public static void isPalindrome(String string, int begin, int end) {
        string = string.toLowerCase();
        if (begin >= end) {
            System.out.println("This string is palindrome");
        } else if (string.charAt(begin) == string.charAt(end)) {
            isPalindrome(string, begin + 1, end - 1);
        } else {
            System.out.println("This string isn't palindrome");}
    }
}

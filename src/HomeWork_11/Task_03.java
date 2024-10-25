package HomeWork_11;
/*
Task 3 * (Опционально)
Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов).
 */
public class Task_03 {
    public static void main(String[] args) {
        int [] a = {6, 5, 3, 4, 3, 5, 6};
        int [] b = {6, 5, 3, 4, 5, 3, 6};
        int [] c = {3, 5, 6, 4, 3, 5, 6};
        int [] d = {5, 6, 3, 4, 3, 5, 6};
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
        System.out.println(isPalindrome(c));
        System.out.println(isPalindrome(d));
    }

    public static boolean isPalindrome(int[] a) {

        for (int i = 0; i < (a.length-1) / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) return false;
        }
        return true;
    }

}

import java.util.Scanner;

public class Customer{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter your string:");
        String A = sc.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Static method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1; // Corrected the right index

        while (left < right) {
            // Compare characters at left and right indices
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;  // Move left pointer forward
            right--; // Move right pointer backward
        }
        return true; // If all characters match, it's a palindrome
    }
}

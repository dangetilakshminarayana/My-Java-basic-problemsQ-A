package Strings.ReverseStrng;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        // Method 1: Using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();
        
        System.out.println(reversed);
    }
}
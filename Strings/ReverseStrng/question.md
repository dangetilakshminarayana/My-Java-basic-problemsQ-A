
## 🧩 Problem: Reverse a String

### Problem Statement
Write a function that takes a string as input and returns the string reversed.

### Example
- Input: `"hello"`  
- Output: `"olleh"`

### Constraints
- The input string consists of printable ASCII characters.
- \(1 \leq \text{length of string} \leq 1000\)

---

## 📥 Input Format
- A single line containing the string \(s\).

## 📤 Output Format
- A single line containing the reversed string.

---

## 🔑 Sample Test Cases

**Test Case 1**  
Input:  
```
world
```  
Output:  
```
dlrow
```

**Test Case 2**  
Input:  
```
java
```  
Output:  
```
avaj


## 💻 Java Solution

```java
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
```

---

## 🚀 Alternate Approach (Without StringBuilder)

```java
import java.util.Scanner;

public class ReverseStringManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        char[] chars = input.toCharArray();
        String reversed = "";
        
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        
        System.out.println(reversed);
    }
}

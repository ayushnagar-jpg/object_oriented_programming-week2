package classes_fundamental.level2.Palindrome;

class PalindromeChecker {
       String text;
 
 PalindromeChecker(String text) {
     this.text = text;
 }

 boolean isPalindrome() {
     int left = 0;
     int right = text.length() - 1;

     while (left < right) {
         if (text.charAt(left) != text.charAt(right)) {
             return false;
         }
         left++;
         right--;
     }
     return true;
 }

 void displayResult() {
     if (isPalindrome()) {
         System.out.println("The text \"" + text + "\" is a palindrome.");
     } else {
         System.out.println("The text \"" + text + "\" is not a palindrome.");
     }
 }
}





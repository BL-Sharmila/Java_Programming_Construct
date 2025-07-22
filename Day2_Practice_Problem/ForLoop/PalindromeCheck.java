class PalindromeCheck {
    public static void main(String[] args) {
        int number = 121, original = number, reverse = 0;
        for (; number != 0; number /= 10) {
            reverse = reverse * 10 + number % 10;
        }
        if (original == reverse) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}

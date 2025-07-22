class ReverseNumberWhile {
    public static void main(String[] args) {
        int number = 231, reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reverse);
    }
}
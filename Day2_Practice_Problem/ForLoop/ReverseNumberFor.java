class ReverseNumberFor {
    public static void main(String[] args) {
        int number = 231, reverse = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reversed Number: " + reverse);
    }
}
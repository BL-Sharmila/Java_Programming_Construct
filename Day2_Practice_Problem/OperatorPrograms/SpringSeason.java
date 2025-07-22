class SpringSeason {
    public static void main(String[] args) {
        int m = 3, d = 21;
        boolean isSpring = (m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20);
        System.out.println(isSpring);
    }
}
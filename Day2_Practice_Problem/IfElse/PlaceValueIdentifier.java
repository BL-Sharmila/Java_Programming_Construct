class PlaceValueIdentifier {
    public static void main(String[] args) {
        int number = 100; // Example input
        if (number == 1) System.out.println("Unit");
        else if (number == 10) System.out.println("Ten");
        else if (number == 100) System.out.println("Hundred");
        else if (number == 1000) System.out.println("Thousand");
        else System.out.println("Invalid Input");
    }
}
public class Main {
    public static void main(String[] args) {
        int wysokosc = 3; 

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (wysokosc - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


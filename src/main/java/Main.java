public class Main {
    public static void main(String[] args) {
        int wysokosc = 5; 
        int liczbaPowtorzen = 3; 

        for (int k = 0; k < liczbaPowtorzen; k++) { 
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
}


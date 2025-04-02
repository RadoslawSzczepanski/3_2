public class Main {
    public static void main(String[] args) {
       

        for (int k = 0; k < 3; k++) { 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int l = 0; l < (2 * (3 - i) - 1); l++) {
                    System.out.print("*");
                }
                System.out.println(); 
            }
            
        }
    }
}


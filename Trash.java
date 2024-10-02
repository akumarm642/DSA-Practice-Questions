public class Trash {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 10; i++) {
            System.out.print("\n\rCount: " + i);
            System.out.flush(); // Ensure immediate output
            Thread.sleep(500);
        }
        System.out.println(); // Move to the next line after completion
    }
}

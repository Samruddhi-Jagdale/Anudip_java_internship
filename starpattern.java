public class starpattern{
    public static void main(String[] args) {
        // Static array for number of stars in each row
        int[] stars = {1, 2, 3, 4, 5};

        // Loop through array
        for (int i = 0; i < stars.length; i++) {
            // Print stars for current row
            for (int j = 0; j < stars[i]; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }
}


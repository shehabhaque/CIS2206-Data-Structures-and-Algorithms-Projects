public class SierpinskiCarpet {
    static String[][] carpet;
    static int size;

    public SierpinskiCarpet(int size) {
        // creates 2D array
        this.size = size;
        carpet = new String[size][size];
        int row = 0;
        int col = 0;
        while (row < size) {
            col = 0;
            while (col < size) {
                this.carpet[row][col] = " * ";
                col++;
            }
            row++;
        }
    }

    public static void emptyblock(int currentsize, int a, int b) {
        // function to empty middle block
        int row = b + currentsize / 3;
        int col = 0;
        while (row <= b + 2 * (currentsize / 3) - 1) {
            col = a + currentsize / 3;
            while (col <= a + 2 * (currentsize / 3) - 1) {
                carpet[row][col] = "   ";
                col++;
            }
            row++;
        }
    }

    public static void createboard(String[][] carpet, int a, int b, int presentsize) {
        //empty center block
        emptyblock(presentsize, a, b);

        if (presentsize <= 1) {
            return;
        }

        int row = 0;
        int col = 0;
        // loops through all blcoks
        while (row < presentsize) {
            col = 0;
            while (col < presentsize) {
                // recursive function to move to the 3n-1x3n-1
                createboard(carpet, row + b, col + a, presentsize / 3);
                col += presentsize / 3;
            }
            row += presentsize / 3;
        }
    }

    public static void printboard(int size) {
        // loops through the arrays to prints
        int row = 0;
        int col = 0;
        String output = "";
        while (row < size) {
            col = 0;
            output = "";
            while (col < size) {
                output += carpet[row][col];
                col++;
            }
            System.out.println(output);
            row++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sierpinski Carpet: ");
        SierpinskiCarpet board = new SierpinskiCarpet(27);
        createboard(carpet, 0, 0, 27);
        printboard(27);
    }
}

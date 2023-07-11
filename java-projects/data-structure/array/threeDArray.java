public class threeDArray {
    public static void main(String[] args) {
        char[][][] array = new char[6][6][4];
        int unicode = 32;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 4; k++) {
                    array[i][j][k] = (char) unicode;
                    unicode++;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.println((int) array[i][j][k] + " : " + array[i][j][k]);
                }
            }
        }

        System.out.println();
        System.out.println("Front view of the cuboid:");
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(array[i][0][k] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Back view of the cuboid:");
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(array[i][5][k] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Right side view of the cuboid:");
        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(array[0][j][k] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Left side view of the cuboid:");
        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(array[5][j][k] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Top view of the cuboid:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j][0] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Bottom view of the cuboid:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j][3] + " ");
            }
            System.out.println();
        }
    }
}

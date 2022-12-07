public class telusko {
    static int abs(int d) {
        return d < 0 ? -1 * d : d;
    }

    public static void main(String args[]) {

        {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 0)
                        System.out.printf("*");
                    else if (j == 4 / 2)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
            }

            for (int i = 0; i < 5; i++) {
                System.out.printf("*");
                for (int j = 0; j < 5; j++) {
                    if ((i == 0 || i == 5 - 1)
                            || (i == 5 / 2
                            && j <= 5 / 2))
                        System.out.printf("*");
                }
                System.out.printf("\n");
            }
            for (int i = 0; i < 5; i++) {
                System.out.printf("*");
                for (int j = 0; j <= 5; j++) {
                    if (i == 5 - 1)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
            }
            for (int i = 0; i < 5; i++) {
                if (i != 0 && i != 5 - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
                for (int j = 0; j < 5; j++) {
                    if (((i == 5 - 1)
                            && j >= 0
                            && j < 5 - 1))
                        System.out.printf("*");
                    else if (j == 5 - 1 && i != 0
                            && i != 5 - 1)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if ((i == 0 || i == 5 / 2
                            || i == 5 - 1))
                        System.out.printf("*");
                    else if (i < 5 / 2
                            && j == 0)
                        System.out.printf("*");
                    else if (i > 5 / 2
                            && j == 5 - 1)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
            }
            int i, j, half = 5 / 2, dummy = half;
            for (i = 0; i < 5; i++) {
                System.out.printf("*");
                for (j = 0; j <= half; j++) {
                    if (j == abs(dummy))
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
                dummy--;
            }
            int  space = (5 / 3);
            int width = 5 / 2 + 5 / 5 + space + space;
            for (i = 0; i < 5; i++) {
                for (j = 0; j <= width; j++) {
                    if (j == width - abs(space)
                            || j == abs(space))
                        System.out.printf("*");
                    else if ((i == 0
                            || i == 5 - 1)
                            && j > abs(space)
                            && j < width - abs(space))
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                if (space != 0
                        && i < 5 / 2) {
                    space--;
                } else if (i >= (5 / 2 + 5 / 5))
                    space--;
                System.out.printf("\n");
            }
        }

    }
}




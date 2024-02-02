class Main1 {
    public static void main(String[] args) {
        int size = 3;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else if (i == size - j - 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

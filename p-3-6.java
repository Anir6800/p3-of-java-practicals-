class FibonacciSeries {
        public static void main(String[] args) {
            int n = 50; // Number of terms in the series
            int firstTerm = 0;
            int secondTerm = 1;
    
            System.out.println("Fibonacci Series from 1 to 50:");
    
            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + " ");
    
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
    
public class Fibo {

    // No hay excepción que atrapar
    public static int fibo13(int n){
        if (n < 2){
            return n;
        } else {
            return fibo13(n - 1) + fibo13(n - 2);
        }
    }

    public static int fibo12(int n){
        if (n < 2){
            return n;
        } else {
            return fibo12(n - 1) + fibo12(n - 2);
        }
    }

    public static boolean equals (double num){
        double num1 = fibo13(13);
        double num2 = fibo12(12);
        double cociente = num1 / num2;
        if (Math.abs(num - cociente) < 0.1){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
    System.out.println(equals(1.618));
    }
}

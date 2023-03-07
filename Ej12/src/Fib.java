import java.util.*;

public class Fib {
    public static int fib(int n) {
        if (n > 45){
            throw new IllegalArgumentException("El número introducido es demasiado grande introduce uno menor o igual a 45");
        }
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce un número: ");
            n = sc.nextInt();
            System.out.println("El numero que ocupa esa posición en la serie de fibonnaci es: " + fib(n));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

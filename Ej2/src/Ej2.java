import java.util.Scanner;

public class Ej2 {
    public static int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero introducido no es valido");
        } else {
            return n * fact(n - 1);
        }

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor introduzca un numero entero mayor que 0: ");
            int num = 0;
            num = sc.nextInt();
            System.out.println("El factorial de " + num + " es: " + fact(num));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}


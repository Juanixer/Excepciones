import java.util.*;

public class Potencia {


    public static int pot(int ba, int exp) {
        if (ba == 0 || ba < 0) {
            throw new IllegalArgumentException("La base no puede ser 0 o menor manin");
        }
        if (exp == 0) {
            return 1;
        } else {
            return (int) Math.pow(ba, exp);
        }
    }


    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Por favor elija un entero el cual será la base de la potencia: ");
            int numeroBa;
            numeroBa = sc.nextInt();
            System.out.println("Ahora elija un exponente al que elevar su numero: ");
            int numeroExp;
            numeroExp = sc.nextInt();

            System.out.println(numeroBa + " elevado a " + numeroExp + " es = " + pot(numeroBa, numeroExp));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
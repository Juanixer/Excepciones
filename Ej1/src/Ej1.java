import java.util.*;

public class Ej1 {

    public static int sum(int n) throws IllegalArgumentException{

        if (n <= 0){
            throw new IllegalArgumentException("El numero introducido no es valido");
        }
        else{
            return n + sum(n - 1);


        }
    }


    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor introduzca un numero entero mayor o igual que 0: ");
            int num = 0;
            num = sc.nextInt();
            System.out.println("La suma de los numeros hasta " + num + " es: " + sum(num));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

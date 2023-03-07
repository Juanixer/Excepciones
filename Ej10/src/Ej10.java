import java.util.*;

public class Ej10 {

    public static ArrayList listaPar(ArrayList lista, int n) {
        if (n < 0)
            throw new IllegalArgumentException("El numero elegido no puede ser negativo");
        if (n == 2) {
            lista.add(n);
            return lista;
        } else {
            if (n % 2 == 0) {
                lista.add(n);
                return listaPar(lista, n - 1);
            } else {
                return listaPar(lista, n - 1);
            }
        }
    }

    public static void main (String[] args){
        ArrayList lista = new ArrayList();
        int num;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            System.out.println(listaPar(lista, num));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.util.ArrayList;

public class ObtenerListaPar {
    public static ArrayList sumPares(int[] lista, ArrayList lista2, int indice) {
        if (lista[indice] < 0) {
            throw new IllegalArgumentException("La lista no puede contener números negativos");
        }
        if (indice == lista.length) {
            if (lista[0] % 2 == 0) {
                lista2.add(lista[indice]);
                return lista2;
            } else
                return lista2;
        } else {
            if (lista[indice] % 2 != 0) {
                return sumPares(lista, lista2, indice + 1);
            } else
                lista2.add(lista[indice]);
            return sumPares(lista, lista2, indice + 1);
        }
    }

        public static void main(String[] args) {
        try {
            int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            ArrayList lista2 = new ArrayList();
            System.out.println(sumPares(lista, lista2, 0));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}




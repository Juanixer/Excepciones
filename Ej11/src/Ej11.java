public class Ej11 {

    public static int productoEscalar(int [] lista1 , int [] lista2, int n) {
        if (lista1.length != lista2.length ) {
            throw new IllegalArgumentException("Las listas deben tener la misma longitud");
        }
    if (n < 0) {
        return 0;
    } else {
        return lista1[n] * lista2[n] + productoEscalar(lista1, lista2, n - 1);
    }
    }


    public static void main(String[] args) {
        try{
        int [] lista1 = {1, 2, 3, 5};
        int [] lista2 = {2, 4, 3, 1};
        int n = lista1.length - 1;
        System.out.println("El producto escalar de las dos listas es: " + (productoEscalar(lista1, lista2, n)));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}

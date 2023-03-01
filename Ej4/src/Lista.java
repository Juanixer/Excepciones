public class    Lista{

    public static double sum(double[]numeros , int indice) {
        if (indice < 0 || indice > numeros.length - 1) {
            throw new IllegalArgumentException("El indice no es valido");
        }
        if (indice == numeros.length - 1) {
            return numeros[indice];

        } else {
            return numeros[indice] + sum(numeros,indice + 1);
        }
    }

    public static void main(String[] args) {
        try {
            double[] numeros = {1, 2, 3, 4, 5};
            System.out.println("La suma de los números es: " + sum(numeros, 0));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

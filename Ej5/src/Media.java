

public class Media {

    public static double sum(double[] numeros, int indice) {
        if (indice > numeros.length - 1) {
            throw new IllegalArgumentException("El indice se esta pasando del tamaño del array");
        }
        if (indice == numeros.length - 1) {
            return numeros[indice];
        } else {
            return numeros[indice] + sum(numeros, indice + 1);
        }
    }

    public static void main(String[] args) {
        try {
            double[] numeros = {1, 2, 3, 4, 5};
            double suma = sum(numeros, 0);
            double media = suma / numeros.length;
            System.out.println("La media de los numeros es: " + media);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
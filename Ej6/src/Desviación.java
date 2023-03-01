

public class Desviación{

    public static double sum(double[]numeros , int indice) {
        if (indice == numeros.length - 1) {
            return numeros[indice];
        } else {
            return numeros[indice] + sum(numeros,indice + 1);
        }
    }

    public static double sumaCuadrados(double[]numeros , int indice) {
        if (indice == numeros.length - 1) {
            return numeros[indice] * numeros[indice];
        } else {
            return numeros[indice]*numeros[indice] + sumaCuadrados(numeros,indice + 1);
        }
    }

    public static double desviacion(double[]numeros){
        double suma = sum(numeros, 0);
        double media = suma / numeros.length;
        double cuadrados = sumaCuadrados(numeros, 0);
        double varianza = (cuadrados / numeros.length) - (media*media);
        if(varianza < 0){
            throw new IllegalArgumentException("La varianza no puede ser negativa");
        }
        double desviacion = Math.sqrt(varianza);
        return desviacion;
    }


    public static void main(String[] args) {
        try {
            double[] numeros = {1, 2, 3, 4, 5};
            System.out.println("La desviación de los numeros es: " + desviacion(numeros));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

public class Pares {

    public static int sumPares(int num) {
        if (num < 2) {
            throw new IllegalArgumentException("El número debe ser mayor que 2");
        }
        if (num == 2) {
            return 2;
        } else
        if (num % 2 == 0){
            return num + sumPares(num - 2);

        } else {
           return sumPares(num - 1);
        }

    }

    public static void main(String[] args) {
        try {
            System.out.println("La suma de los números pares es: " + sumPares(5));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

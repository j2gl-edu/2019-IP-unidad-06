import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = reader.nextInt();

        Util myUtil = new Util();
        boolean z = myUtil.esPar(numero);
        if (z == true) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        reader.close();
    }

}
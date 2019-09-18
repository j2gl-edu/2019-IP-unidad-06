package procedures;

import java.util.Scanner;

public class FiguraMain {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese tamaño: ");
        int size = reader.nextInt();

        Figura miFigura = new Figura();
        
        System.out.println("Linea");
        System.out.println();
        miFigura.dibujarLinea(size);
        System.out.println();
        System.out.println();
        System.out.println("Triangulo ");
        System.out.println();
        miFigura.dibujarTriangulo(size);

        reader.close();
    }
}
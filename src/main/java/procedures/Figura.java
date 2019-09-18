package procedures;

public class Figura {

    public void dibujarLinea(int largo) {
        for (int i = 0; i < largo; i++) {
            System.out.print("_");
        }
    }

    public void dibujarTriangulo(int f) {
        int col = f;
        int size = 0;
        for (int i = 1; i <= f; i++ ) {
            for (int j = 1; j < col; j++) {
                System.out.print(" ");
            }
            System.out.print("X");
            
            for (int j = 0; j < size; j++) {
                System.out.print("X");
            }
            col--;
            size = size + 2;
            System.out.println();
        }
    }

}
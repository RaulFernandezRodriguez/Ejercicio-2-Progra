import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MatrizSimetrica {
    public static void main(String[] args) throws Exception {
        Scanner stdinput = new Scanner(System.in);
        int size = stdinput.nextInt();
        assert size > 0;
        int[][] matriz = new int[size][size];
        rellenarMatriz(0, 0);
        comprobarsimetria();
        
        System.out.println("Entrada errónea");
        System.out.println("Es simétrica la raiz cuadrada entera de la matriz de entrada");
        System.out.println("No es simétrica la raiz cuadrada entera de la matriz de entrada");
    }

    public static void rellenarMatriz(int x, int j){
        int input = stdinput.nextInt();

    }
}

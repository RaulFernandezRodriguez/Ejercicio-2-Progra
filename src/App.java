import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdinput = new Scanner();
        int size = stdinput.next;
        assert size > 0;
        ArrayList matriz = new ArrayList<int>(size);
        rellenarmatriz();
        comprobarsimetria();
        
        System.out.println("Entrada errónea");
        System.out.println("Es simétrica la raiz cuadrada entera de la matriz de entrada");
        System.out.println("No es simétrica la raiz cuadrada entera de la matriz de entrada");
    }
}

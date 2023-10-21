import java.util.Scanner;
import java.math.BigInteger;
public class MatrizSimetrica {
    static final Scanner stdinput = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        if (stdinput.hasNextInt()) {
            int size = stdinput.nextInt();
            stdinput.nextLine();
            if(size > 0){
                int[][] matriz = new int[size][size];
                int[][] matrizT = new int[size][size];
                rellenarMatriz(matriz, 0, 0);
                stdinput.close();
                transponer(matriz, matrizT, 0, 0);
                boolean simetric = comprobarSimetria(matriz, matrizT, 0, 0);
                if(simetric){
                    System.out.println("Es simétrica la raíz cuadrada entera de la matriz de entrada.");
                }else{
                    System.out.println("No es simétrica la raíz cuadrada entera de la matriz de entrada.");
                }
            }else{            
                System.out.println("Entrada errónea");
            }
        } else {
            System.out.println("Entrada errónea");
        }
    } 

    public static void rellenarMatriz(int[][] matriz, int x, int y){
        if(x < matriz.length){
            String filaInput = stdinput.nextLine();
            if (!filaInput.trim().isEmpty()) {
                String[] fila = filaInput.split(" ");
                assert fila.length == matriz[y].length;
                rellenarFila(matriz, x, 0, fila);
                rellenarMatriz(matriz, x+1, 0);
            }
        }
    } 
    
    public static void rellenarFila(int[][] matriz, int x, int y, String[] fila){
        if(y < matriz[x].length){
            matriz[x][y] = (int) Math.sqrt(Integer.parseInt(fila[y]));
            rellenarFila(matriz, x, y+1, fila);
        }
    }

    public static void transponer(int[][] matriz,int[][] matrizT, int x, int y){
        if (x < matriz.length) {
            if (y < matriz[x].length) {
                matrizT[y][x] = matriz[x][y];
                transponer(matriz, matrizT, x, y + 1);
            } else {
                transponer(matriz, matrizT,  x + 1, 0);
            }
        }  
    } 

    public static boolean comprobarSimetria(int[][] matriz,int[][] matrizT, int x, int y){
        if (x == matriz.length) {
            return true;
        }else if(y == matriz[x].length){
            return comprobarSimetria(matriz, matrizT, x+1, 0);
        }else{
            if(matriz[x][y] == matrizT[x][y]){
                return comprobarSimetria(matriz, matrizT, x, y+1);
            }else return false;
        } 
    }
}

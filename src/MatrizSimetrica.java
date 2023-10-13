import java.util.Scanner;
import java.math.BigInteger;


public class MatrizSimetrica {
    static final Scanner stdinput = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int size = stdinput.nextInt();
        if(size > 0){
            int[][] matriz = new int[size][size];
            int[][] matrizT = new int[size][size];
            rellenarMatriz(matriz, 0, 0);
            transponer(matriz, matrizT, 0, 0);
            boolean simetric = comprobarSimetria(matriz, matrizT, 0, 0);
            if(simetric){
                System.out.println("Es simétrica la raiz cuadrada entera de la matriz de entrada");
            }else{
                System.out.println("No es simétrica la raiz cuadrada entera de la matriz de entrada");
            }
        }else{            
            System.out.println("Entrada errónea");
        }
    }

    public static void rellenarMatriz(int[][] matriz, int x, int y){
        if(y == matriz[y].length){
    
        }else if(x == matriz[x].length){
            rellenarMatriz(matriz, 0, y+1);
        }else{
            int input = stdinput.nextInt();
            input = (int) Math.sqrt(input);
            matriz[x][y] = input;
            rellenarMatriz(matriz, x+1, y);
        }    
    } 
    
    public static void transponer(int[][] matriz,int[][] matrizT, int x, int y){
        if(y == matriz[y].length){
    
        }else if(x == matriz[x].length){
            transponer(matriz, matrizT, 0, y+1);
        }else{
            matrizT[y][x] = matriz[x][y];
            transponer(matriz, matrizT, x+1, y);
        }    
    } 

    public static boolean comprobarSimetria(int[][] matriz,int[][] matrizT, int x, int y){
        if(y == matriz[y].length){
            return true;
        }else if(x == matriz[x].length){
            return comprobarSimetria(matriz, matrizT, 0, y+1);
        }else{
            if(matriz[x][y] != matrizT[x][y]){
                return false;
            }
            return comprobarSimetria(matriz, matrizT, x+1, y);
        } 
    }
}

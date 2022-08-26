import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //n cantidad de oraciones y m cantidad de palabras
        int posFila,posColum;
        posFila=CantPosFila();
        posColum=CantPosColum();
        int [][]Matriz=new int [posFila][posColum];
        CargarMatriz(Matriz, posColum, posFila);
        MostrarMatriz(Matriz,posColum,posFila);
    }

    public static void MostrarMatriz(int Matriz[][],int posColum,int posFila){
        for(int i=0;i<posFila;i++){
            for(int j=0;j<posColum;j++){

                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static void CargarMatriz(int Matriz[][],int posColum,int posFila){
        Scanner sc= new Scanner(System.in);
        int numero;
        for(int i=0;i<posFila;i++){
            for(int j=0;j<posColum;j++){
                System.out.println("Ingrese numero fila:"+i+" columna:"+j);
                numero=sc.nextInt();
                Matriz[i][j]=numero;
            }
        }
    }

    public static int CantPosColum(){
        Scanner sc= new Scanner(System.in);
        int PosColum;
        System.out.println("Ingrese cantidad columnas");
        PosColum=sc.nextInt();
        return PosColum;
    }

    public static int CantPosFila(){
        Scanner sc= new Scanner(System.in);
        int PosFila;
        System.out.println("Ingrese cantidad filas");
        PosFila=sc.nextInt();
        return PosFila;
    
    }
}
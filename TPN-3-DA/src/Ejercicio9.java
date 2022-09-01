import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int lonFila,lonColum,posFila;

        lonFila=Modulos.CantPosFila();
        lonColum=Modulos.CantPosColum();
        int [][] Matriz=new int[lonFila][lonColum];
        int [] Numeros= new int[lonFila];
        CargarMatriz(Matriz, lonFila, lonColum);
        CargarArreglo(Numeros, lonFila);
        MostrarMatriz(Matriz, lonFila, lonColum);
        System.out.println();
        MostrarArreglo(Numeros, lonFila, lonColum);
        System.out.println();
        System.out.println("Ingrese fila que desea reemplazar");
        posFila=sc.nextInt();
        ReemplazarFila(Matriz, Numeros, lonFila, lonColum, posFila-1);
        System.out.println();
        MostrarMatriz(Matriz, lonFila, lonColum);

    }

    public static void ReemplazarFila(int [][] Matriz,int [] Numeros,int lonFila,int lonColum,int posFila){
        for(int i=0;i<lonFila;i++){ 
            for(int j=0;j<lonColum;j++){
                if(i==posFila){
                    Matriz[i][j]=Numeros[i];
                }
            }
        }
    }

    public static void MostrarMatriz(int [][] Matriz,int lonFila,int lonColum){
        for(int i=0;i<lonFila;i++){
            for(int j=0;j<lonColum;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void MostrarArreglo (int []Numeros,int lonFila,int lonColum){
        for(int i=0;i<lonFila;i++){
            System.out.print(Numeros[i]+" ");
            
        }
    }

    public static void CargarMatriz(int [][] Matriz,int lonFila,int lonColum){
        int num;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<lonFila;i++){
            for(int j=0;j<lonColum;j++){
                System.out.println("Ingrese numero");
                num=sc.nextInt();
                Matriz[i][j]=num;
            }
        }
    }
    public static void CargarArreglo(int [] Numeros,int lonFila){
        Scanner sc= new Scanner(System.in);
        int num;
        for(int i=0;i<lonFila;i++){
            System.out.println("Ingrese numero");
            num=sc.nextInt();
            Numeros[i]=num;
        }
    }
}

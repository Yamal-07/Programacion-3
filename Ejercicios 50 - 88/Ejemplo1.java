import java.util.*;

public class Ejemplo1 {

    static void Numeromayor(int N1,int N2){

        if(N1>N2){
            System.out.println("Numero mayor: "+N1);
        }
        else if (N2>N1) {
            System.out.println("Numero mayor: "+N2);
        }
        else {
            System.out.println("Son valores similares");
        }
    }
    static void IngresoDatos(){
        int num1;
        int num2;
        Scanner entero=new Scanner(System.in);
        System.out.println("Ingrese primer valor");
        num1= entero.nextInt();
        System.out.println("Ingrese segundo valor");
        num2= entero.nextInt();
        Numeromayor(num1,num2);
    }
    public static void main(String[] args) {
        IngresoDatos();
    }

}

import java.util.*;
public class Ejemplo1a {

    static int primervalor(int N1){
        System.out.println("ingrese primer valor: ");
        Scanner entero=new Scanner(System.in);
        N1= entero.nextInt();
        return N1;
    }
    static int segundovalor(int N2){
        System.out.println("ingrese primer valor: ");
        Scanner entero=new Scanner(System.in);
        N2= entero.nextInt();
        return N2;
    }

    static void mayor(int N1, int N2){
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
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        primervalor(num1);
        segundovalor(num2);
        mayor(num1,num2);
    }
}
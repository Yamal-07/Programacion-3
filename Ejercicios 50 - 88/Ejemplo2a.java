import java.util.*;
public class Ejemplo2a {

    static int ingreseDato(int N){
        Scanner entero=new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        N= entero.nextInt();
        return N;
    }

    static String respuesta(int Num, String dato){
        if(Num>0){
            dato="Es positivo";
        }
        else {
            dato="Es negativo";
        }
        return dato;
    }
    public static void main(String[] args) {
        int num=0;
        String tipodedato=" ";
        num=ingreseDato(num);
        String R=respuesta(num, tipodedato);
        System.out.println(R);
    }
}

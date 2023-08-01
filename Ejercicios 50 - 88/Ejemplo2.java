import java.util.*;
public class Ejemplo2 {
    public static void main(String[] args) {

        int Num;
        String R;
        Scanner entero=new Scanner(System.in);

        System.out.print("Ingrese un valor de numero Entero:");
        Num= entero.nextInt();

        if(Num>0){
            R="Es positvo";
        }
        else {
            R="Es negativo";
        }

        System.out.println(R);
    }
}

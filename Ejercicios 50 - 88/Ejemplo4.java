import java.util.*;
public class Ejemplo4 {
    static void descuento(double Price){
     double descont1=0.15;
     double descont2=0.08;
     double preciototal;
     if(Price>2500){
         preciototal=Price-descont1*Price;
         System.out.println("El precio total es: " + preciototal + "$");
     }

     else {
         preciototal=Price-descont2*Price;
         System.out.println("El precio total es: " + preciototal + "$");
     }
    }
    static void IngresePrecioTraje(){
        double precio;
        System.out.println("Ingrese el precio del traje: ");
        Scanner decimal=new Scanner(System.in);
        precio= decimal.nextDouble();
        descuento(precio);
    }
    public static void main(String[] args) {
        IngresePrecioTraje();
    }
}

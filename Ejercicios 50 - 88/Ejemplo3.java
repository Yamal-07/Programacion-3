import java.util.*;
public class Ejemplo3 {

    static void comparacion(double P1, double P2, int lapices){
        double precioTotal;

        if(lapices>=1000){
            precioTotal=lapices*P2;
            System.out.println("El precio total de " + lapices + " lapices es " + precioTotal + " $");
        }
        else{
            precioTotal=lapices*P1;
            System.out.println("El precio total de " + lapices + " lapices es " + precioTotal + "$");
        }
    }
    public static void main(String[] args) {

        double Precio1=0.90;
        double Precio2=0.85;
        int CantidadLapices;

        System.out.print("Ingrese la cantidad de lapices que desea comprar: ");
        Scanner decimal=new Scanner(System.in);
        CantidadLapices= decimal.nextInt();

        comparacion(Precio1, Precio2, CantidadLapices);
    }
}

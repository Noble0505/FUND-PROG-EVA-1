
package eva1_6_entradas_salidas;

import java.util.Scanner;

public class EVA1_6_ENTRADAS_SALIDAS {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        String marca;
        String modelo;
        int anio;
        double precio;
        //Hay un paquete System, dentro de un paquete out,
        //y dentro de out, la instruccion println
        System.out.println("Introduce la marca del auto");
        marca= leer.nextLine();
        System.out.println("Introduce el modelo del auto");
        modelo= leer.nextLine();
        System.out.println("Introduce el año de salida del auto");
        anio= leer.nextInt();
        System.out.println("Introduce el precio del auto");
        precio= leer.nextDouble();
        System.out.println("la marca del auto es: " + marca);
        System.out.println("el modelo del auto es: " + modelo);
        System.out.println("el año de salida del auto es: " + anio);
        System.out.println("el precio del auto es: " + precio);
    }  
    
}

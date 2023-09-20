/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_inicializacion;

/**
 *
 * @author invitado
 */
public class EVA1_11_INICIALIZACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // los parentesis denotan una funcion:}
        //println() <<_---  funcion
        //main() <<---- funcion
        System.out.println();
        int valor = 0; //Inicializar la variable para usarla
        System.out.println();

        double salario = 0, iva = 0, subtotal = 0;
        final int califa_pasar = 70;
        final String ESCUELA = "Instituto Tecnologico de Chihuahua II";

        System.out.println(ESCUELA);
        System.out.println("la califa minima para pasar es:");
        System.out.println(califa_pasar);
        //error: solo se puede asignar una sola vez
        //califa_pasar = 100;
        //califa_pasar = 20;
        
        /*
        IGNORA
        VARIAS LINEAS DE TEXTO
        SI VAN A TIRAR MUCHO
       
        */
        int x; // esto ya es ignorado
        byte valores = 120;
        //valores = 128;
        int miValor = Integer.MAX_VALUE;
        System.out.println(miValor + 1);
    }

}

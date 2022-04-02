
package ejemplosguia1_sem1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalculoInterSimple {
       public static void main(String[] args) {
           NumberFormat formato = new DecimalFormat("#0.00");
        //Declarar variables
        double area, radio;
        final double pi= 3.1416; //la palabra final indica que ese valor no cambiara
        
        //inicializacion de variables
        area= 145;
        //uso de variables 
        radio = Math.sqrt(area/pi); // calcular la raiz cuadrada con la funcion Math.sqr
           System.out.println("Radio: " + formato.format (radio) + "cm");
       }
}
     

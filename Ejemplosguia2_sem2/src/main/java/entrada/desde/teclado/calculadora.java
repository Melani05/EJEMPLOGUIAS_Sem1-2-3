package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class calculadora {
    public static void main(String[] args) {
        double cantidad1=1, cantidad2=0 ;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingresar cantidad 1: ");
            cantidad1 = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar cantidad 2: ");
            cantidad2 = Double.parseDouble(leer.readLine());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(cantidad1+ " " + cantidad2);
    }

    public static double sumar(double cantidad1, double cantidad2){
        double suma = cantidad1 + cantidad2;
        return suma;
    }
    
    public static double restar(double cantidad1, double cantidad2){
        double resta = cantidad1 - cantidad2;
        return resta;
    }
    
    public static double multiplicar(double cantidad1, double cantidad2){
        double multiplicar = cantidad1 * cantidad2;
        return multiplicar;
    }
    
    public static double dividir(double cantidad1, double cantidad2){
        double division = cantidad1 / cantidad2;
        return division;
    }
}
    

    


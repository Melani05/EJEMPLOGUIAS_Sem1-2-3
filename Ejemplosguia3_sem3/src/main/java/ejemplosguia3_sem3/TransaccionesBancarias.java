package ejemplosguia3_sem3;

import java.util.Scanner;

public class TransaccionesBancarias {
    
    	    public  static  void  main ( String [] args ) {
	       
	        Cuenta_Bancaria  cuenta = new  Cuenta_Bancaria ();
	        Scanner  leer = new  Scanner ( System.in );
	        
	        
	        String  duiCliente , nombreCliente ;
	        long  telefonoCliente ;
	        
	        double  abono , retiro ;
	               System.out.println("Igrese los datos que se le solicita acontinuacion:" );
	               System.out.println("Nombre del propietario:" );
	               duiCliente = leer.nextLine();
	        
	               System.out.println( "Numero DUI:" );
	               nombreCliente = leer.nextLine();
	        
	               System.out.println( "Teléfono: " );
	               telefonoCliente = leer.nextLong();
                       
                       
                       Cliente  propietario = new  Cliente ( duiCliente , nombreCliente , telefonoCliente );
	        
	               System.out.println( "Ingrese la cantidad a abonar:" );
	               cuenta.abonar ( abono = leer.nextDouble( ));
	        
	               System.out.println( "Ingrese cantidad a retirar" );
	               cuenta.Retirar ( retiro = leer.nextDouble());
	        
	               System.out.println( "Su saldo de la cuenta es: " + cuenta.SaldoCuenta);
	        
	        //obtener informacion del propietario
	               System.out.println( "Datos del propietario : \n" + cuenta.DatosPropietarioCuenta());
	    }
	}


    


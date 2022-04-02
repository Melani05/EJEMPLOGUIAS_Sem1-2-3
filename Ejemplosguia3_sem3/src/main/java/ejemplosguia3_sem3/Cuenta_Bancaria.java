package ejemplosguia3_sem3;

public class Cuenta_Bancaria {
    long  NumeroCuenta ;
    Cliente   propietarioCuenta ;
    double  SaldoCuenta ;
    
    public  void  abonar ( double  cantidad ){
        SaldoCuenta += cantidad ; // logica de negocio
        
    }
    public  void  Retirar ( double  Cantidad ){
        if ( Cantidad > SaldoCuenta ){
            System.out.println ( "Saldo insuficiente" );
        }
        SaldoCuenta -= Cantidad ; // logica de negocio
    }
    
    public  String  DatosPropietarioCuenta (){//Metdo para retornar los datos
        String  informacion = "" ;
        informacion += "DUI: " + propietarioCuenta.duiCliente +"\n" ;
        informacion += "Nombre: " + propietarioCuenta.nombreCliente + "\n" ;
        informacion += "Telefono: " + propietarioCuenta.telefonoCliente + "\n" ;
        return  informacion ;
    }
 

}

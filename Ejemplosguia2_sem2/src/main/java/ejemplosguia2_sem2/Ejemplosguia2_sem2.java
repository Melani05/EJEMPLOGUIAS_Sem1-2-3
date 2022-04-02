package ejemplosguia2_sem2;
public class Ejemplosguia2_sem2 {

    public static void main(String[] args) {
        
       //Se hace el llamado cada uno de los métodos creados
       
       metodoConVoid();
       metodoConInt();
       metodoConDouble();
       metodoConString();
       
    }
    public static void metodoConVoid() {
        System.out.println("Contenido del método con void");
    }
    public static int metodoConInt () {
        System.out.println("Contenido del método con int");
        return 0;
    }
    public static double metodoConDouble(){
        System.out.println("Contenido del método con double");
        return 0.00;
    }
    public static String metodoConString() {
        System.out.println("Contenido del metodo con String");
        return "";
    }
}

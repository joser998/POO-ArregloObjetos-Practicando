
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Main objeto = new Main();
        
        objeto.metodo();
        
    }  
    
    public void metodo(){
        
        Scanner sc = new Scanner (System.in);
        
        int a,b;
        int opc=0; //switch
        
        System.out.println("dame numero");
        a=sc.nextInt();
        System.out.println("dame numero");
        b=sc.nextInt();
        
        Hija2 o = new Hija2(a,b); //Instancia de clase Hija2 ya que esta clase hereda de todas las anteriores
                                  //por eso la uso para todo  
        
        System.out.println("el numero es: ");
        
        o.Ver();      
        o.VerHija();
        o.VerHija2();
        
        o.dameDatos();
        o.muestroDatos();
        
        o.jalarMetodo();
        
        System.out.println("Menu con switch\n1.-ver metodo VerHija2 de clase Hija2\n2.-ver metodo ver de clase Padre\n");
        opc=sc.nextInt();
        switch(opc){
            case 1: o.VerHija2();
            break;
            case 2: o.Ver();
            break;
        }
        
       o.GuardarDatos();
        
       o.GuardarDatosConSetters();
        
        o.setNombre("constructor de un parametro... en clase Padre");
        o.SetterDeNombre();
        
        ArregloObjetos();
        
        System.out.println("llamando metodo: MostrandoarregloObjetosdesdeClasePadre");
        o.MostrandoarregloObjetosdesdeClasePadre();
        
        
        
        
        
        
    }//cierra menu metodo
    
    public void ArregloObjetos(){
        String matricula;
        String apellido;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Estas dentro de metodo ArregloObjetos\n");
        
        Padre arregloObjetos[] = new Padre[2];
        
        for(int i=0; i<arregloObjetos.length; i++){
            sc.nextLine();
            System.out.print("Inserta matricula: ");
            matricula=sc.nextLine();
            System.out.print("Inserta apellido: ");
            apellido=sc.nextLine();
            
            arregloObjetos[i]=new Padre( matricula, apellido); //paso el arreglo de objetos al constructor que hice 
                                                               // para estas variables
        }
          
        //experimentar donde puedo presentar los datos guardados y de que forma dependiendo donde esten...
        
        
        //Presento datos del arreglo de objetos que ya habia guardado, en este caso no fue necesario usar el getter
          //de este atributo matricula, ya que mi objeto esta heredado de Hija2 por lo tanto heredo el atributo matricula
            //y lo traigo directamente al main
        System.out.println("Se presentan datos dentro del mismo metodo ArregloObjetos");
         for(int i=0; i<arregloObjetos.length; i++){
             sc.nextLine();
             System.out.println("Matricula: "+arregloObjetos[i].matricula);
             System.out.println("Apellido: "+arregloObjetos[i].apellido);
         }
        
        
      
        
    }
    
    
    
    
}

//clase hija
public class Hija2 extends Hija{

    
    
    public Hija2(int numero, int numero2) {
        super(numero, numero2);
    }
    
    public void VerHija2(){
        System.out.println("Estas en metodo VerHija2 de clase Hija2");
        System.out.println(getNumero());
        System.out.println(getNumero2());
    }
    
    public void jalarMetodo(){
        VerHija();
    }
    
    
    
    
    
    
    
    
    
}

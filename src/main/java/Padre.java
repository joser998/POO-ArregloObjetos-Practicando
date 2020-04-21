import java.util.Scanner;
//clase padre
public class Padre {
    Scanner sc = new Scanner (System.in);
    
    private int numero;
    private int numero2;

    public Padre(int numero, int numero2) {
        this.numero = numero;
        this.numero2 = numero2;
    }
    public void dameDatos(){
        System.out.println("Estas en metodo dameDatos de clase Padre");
        System.out.print("Dame numero: ");
        numero=sc.nextInt();
        
    }
    public void muestroDatos(){
        System.out.println("ya estas en metodo muestroDatos de clase Padre");
        System.out.println("el numero de dameDatos es: ");
        System.out.println(getNumero());
    }
    public int getNumero2() {
        return numero2;
    }
    public int getNumero() {
        return numero;
    }
    
    public void Ver(){
        System.out.println("Estas en metodo Ver de clase Padre");
        System.out.println(getNumero());
        System.out.println(getNumero2());
    }
            
            
    //nuevas variables
    String nombre;
    String registro;

    public String getNombre() {
        return nombre;
    }
    public String getRegistro() {
        return registro;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
   
    public void GuardarDatos(){
        sc.nextLine();
        System.out.println("Metodo GuardarDatos en clase Padre, guarda y muestra sus datos mediante getters ");
        System.out.println("Inserta nombre: ");
        nombre=sc.nextLine();
        System.out.println("Inserta registro: ");
        registro=sc.nextLine();
        
        System.out.println("El nombre y el Registro son: ");
        System.out.println(getNombre());
        System.out.println(getRegistro());
    }
    
    public void GuardarDatosConSetters(){
        sc.nextLine();
        System.out.println("Inserta nombre: ");
            nombre=sc.nextLine();
        System.out.println("Inserta registro: ");
            registro=sc.nextLine();
        sc.nextLine();
        
        System.out.println("El nombre y el Registro son: ");
        System.out.println(getNombre());
        System.out.println(getRegistro());
    }
    
    
    
    //Constructor con un solo parametro para modificar variable nombre y 
    public Padre(String nombre) {
        this.nombre = nombre;
    }
    
    public void SetterDeNombre(){
        System.out.println(getNombre());
    }
            
    
    //variables para arreglo de objetos
    String matricula;
    String apellido;
    //constructor arreglo de objetos
    public Padre (String matricula, String apellido){
        this.matricula = matricula;
        this.apellido = apellido;
    }
    
    public void MostrandoarregloObjetosdesdeClasePadre(){
        Padre arregloObjetos[] = new Padre[2];
        for(int i=0; i<arregloObjetos.length; i++){
             sc.nextLine();
             System.out.println("Matricula: "+arregloObjetos[i].matricula);
             System.out.println("Apellido: "+arregloObjetos[i].apellido);
         }
    }
    
    //Getters y Setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
    
    
    
    
}
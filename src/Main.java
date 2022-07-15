public class Main {
    public static void main(String[] args) {
        Persona nuevaPersona=new Persona();
        nuevaPersona.setEdad(35);
        nuevaPersona.setNombre("Richard Castillo");
        nuevaPersona.setTelefono(942971664);

        System.out.println("Nombre de la persona :" +nuevaPersona.getNombre());
        System.out.println("Edad de la persona :" +nuevaPersona.getEdad());
        System.out.println("Telefono de la persona :"+nuevaPersona.getTelefono());


    }

}
 class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    //getters y setters
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
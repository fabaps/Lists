public class Patient{

  //Campos
  String nombre;
  byte prioridad;

  //Constructor
  public Patient(String nombre, byte prioridad){
    this.nombre = nombre;
    this.prioridad = prioridad;
  }

  @Override 
  public String toString(){
    return String.format("(%s:%d)", this.nombre, this.prioridad);
  }
}
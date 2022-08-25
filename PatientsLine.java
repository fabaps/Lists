import java.util.ArrayList;
import java.io.*;

public class PatientsLine{
    
  //public static void main(String[] args) throws Exception{
    
    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in)); 
    //Campos
    private ArrayList<Patient> pacientes = new ArrayList<Patient>();

    //Constructor
    public PatientsLine(){
      this.pacientes = new ArrayList<Patient>(0);
    }

    public void enqueue(String nombre, byte prioridad){
      if(this.pacientes.size() == 0){
        Patient p = new Patient(nombre,prioridad);
        this.pacientes.add(0,p);
      } else {
        Patient pNuevo = new Patient(nombre,prioridad);
        //byte prioridadNuevo = pNuevo.prioridad;
        for (Patient elemento: pacientes){
          int posicion = pacientes.indexOf(elemento);
          if (prioridad > elemento.prioridad){
            this.pacientes.add(posicion, pNuevo);
            break;
          } 
        }
      }
    }

    public Patient getNext(){
      if (this.pacientes.size() == 0){
        return null;
      } else {
        Patient aux = this.pacientes.get(0);
        pacientes.remove(0);
        return aux;
      }
    }
 
    @Override 
    public String toString(){
      String s = " ";
      for(Patient elementos: pacientes){
        s= s + elementos +" ";
      }
      return String.format("Cola: %s", s);
    }


  }

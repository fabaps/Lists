import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class Emergency {
  public static void main(String[] args) throws Exception{
    BufferedReader tec2 = new BufferedReader(new InputStreamReader(System.in));
    Scanner tec = new Scanner(System.in);
    System.out.println("------- Emergency Line -------");
    System.out.println();
    PatientsLine nueva = new PatientsLine();
    nueva.enqueue("Fabian", (byte) 43);
    nueva.enqueue("Roxana", (byte) 50);
    nueva.enqueue("Vera", (byte) 55);
    System.out.println(nueva);
    System.out.println();



    while(true){
  
      Random r = new Random();
      int r1 = r.nextInt(4) + 1;

      if (r1 == 1){
        System.out.print("Presione ENTER para continuar");
        System.out.println();
        String enter = tec2.readLine();
        System.out.println("Se escogio atender un paciente...");
        nueva.getNext();
        System.out.println(nueva);
      } else if (r1 == 2){
        System.out.print("Presione ENTER para continuar");
        System.out.println();
        String enter2 = tec2.readLine();
        System.out.print("Ingrese nombre de paciente: ");
        String nom = tec2.readLine();
        System.out.print("Ingrese Prioridad: ");
        byte priori = tec.nextByte();
        nueva.enqueue(nom,priori);
        System.out.println(nueva);
        System.out.println();
      } else if (r1 == 3){
        System.out.print("Presione ENTER para continuar");
        System.out.println();
        String enter3 = tec2.readLine();
        System.out.print("Ingrese nombre de paciente: ");
        String nom = tec2.readLine();
        System.out.print("Ingrese Prioridad: ");
        byte priori = tec.nextByte();
        nueva.enqueue(nom,priori);
        System.out.println(nueva);
        System.out.println();
      } else if (r1 == 4){
        System.out.print("Presione ENTER para continuar");
        System.out.println();
        String enter4 = tec2.readLine();
        System.out.print("Ingrese nombre de paciente: ");
        String nom = tec2.readLine();
        System.out.print("Ingrese Prioridad: ");
        byte priori = tec.nextByte();
        nueva.enqueue(nom,priori); 
        System.out.println(nueva);
        System.out.println();
      }
    } 
    




    
    




  }
}
import java.io.*;
import java.util.LinkedList;


public class Scheduling {
  public static void main(String[] args)throws Exception{
    
    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));

    LinkedList<Task> tareas = new LinkedList<Task>();

    while(true){
      System.out.println();
      System.out.print("1. Agregar un task\n");
      System.out.print("2. Realizar un task\n");
      System.out.print("3. Tasks No Realizadas\n");
      System.out.print("4. Salir\n");

      System.out.print("Ingrese opcion: ");
      int op = Integer.parseInt(tec.readLine());

      switch(op){
        case 1:
          System.out.print("Tarea a agregar: ");
          String tarea = tec.readLine();
          Task t = new Task(tarea);
          tareas.add(tareas.size(), t);
          break;
        case 2:
          System.out.println("Tus Tareas");
          String s1 = "";
          if(tareas.size() != 0){
            for(Task elementos: tareas){
              System.out.println(s1 + elementos);
            }
            System.out.println(s1);
            System.out.println();
            System.out.print("Ingrese numero de tarea a realizar: ");
            int numero = Integer.parseInt(tec.readLine());
            if(numero > 0){
              tareas.remove(numero-1);
              break;
            } else {
              System.out.println("Numero de tarea invalida");
              break;
            }
          } else {
            System.out.println("NO HAY TAREAS");
          }



        case 3:

          
          String s = "";
          for(Task elementos: tareas){
            System.out.println(s + elementos);
          }
          System.out.println(s);
          break;

        case 4:
          System.out.println("Saliendo del programa....");
          return;



      

      }
    }





  }
}
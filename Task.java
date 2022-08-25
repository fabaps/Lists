public class Task{

  //Variable de Clase
  static int contador;
  //Variable de Objeto
  private String task;
  private int numeroTask;

  //Constructor
  public Task(String task){
    this.numeroTask =  1 + contador++;
    this.task = task;
  }

  public int getNumber(){
    return numeroTask;
  }

  public String getTask(){
    return this.task;
  }

  @Override
  public String toString(){
    return String.format("(%d, %s)", getNumber(), this.task);
  }


}
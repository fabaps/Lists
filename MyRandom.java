import java.util.LinkedList;
import java.util.Collections;

public class MyRandom{
  public static void main(String[] args){

    LinkedList<Integer> original = new LinkedList<Integer>();

    original.add(0,1);
    original.add(1,2);
    original.add(2,3);
    original.add(3,4);
    original.add(4,5);
    original.add(5,6);
    original.add(6,7);
    original.add(7,8);
    original.add(8,9);
  
    System.out.println("Original: "+ original);
    System.out.println("Final: " + random(original));


  }

  public static LinkedList<Integer> random(LinkedList<Integer> lista){
    
    LinkedList<Integer> nueva = new LinkedList<Integer>();
    Collections.shuffle(lista);
    int contador = 0;
    for(Integer elementos: lista){
      nueva.add(contador, elementos);
    }
    return nueva;
  }


}

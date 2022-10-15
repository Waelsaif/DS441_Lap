import java.util.ArrayList;


public class Testing {
    public static void main(String[] args) {
      ArrayList <String> list = new ArrayList<>(6);
      
      list.add("tiger");
      list.add("lion");
      list.add("bear");
      list.add("frog"); 
      list.add("elephant");
      list.add("dog");
      System.out.println(list+"\n"+list.size());
      list.remove("bear");
      System.out.println(list+"\n"+list.size());
      
    }
}
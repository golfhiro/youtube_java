public class forbun {
  public static void main(String[] args) {
    for(int i = 0; i <= 4; i++) {
      // System.out.println(i); //=> 0 1 2 3 4

      if(i == 3) {
        // break; // => 0 1 2
        continue; //=> 0 1 2 4
      }
      System.out.println(i);
    }
  }
}

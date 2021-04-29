public class TaskThird {
  public static void main(String[]args){
    int[] numbers = {1,3,7,9,25};
    for(int i = 0; i < numbers.length;i ++){
      if(numbers[i]% 3 == 0){
        System.out.println(numbers[i]);
      }
    }
  }
}

import java.util.Scanner;

public class TaskSecond {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Как тебя зовут?: ");
    String name = in.nextLine();
    if(name == "Вячеслав"){
      System.out.println("Привет," + name);
    }else System.out.println("Нет такого имени");



  }
}
import java.util.Scanner;
import java.util.Random;

class Good {
    public static void main(String[] args) {
      Integer num = new Random().nextInt(10) + 1;
      String name = "key";
      Integer attack = 0;

      while (true) {
        System.out.print("数字を当ててください");
        Integer answer = new Scanner(System.in).nextInt();
        attack++;
        if(answer == num) {
          System.out.print("名前を当ててください");
          String answerTwo = new Scanner(System.in).next();
          if (answerTwo == name) {
            System.out.println("２問とも正解です");
            break;
           } else {
             System.out.println("違います");
           }
        } else if(answer > num){
          System.out.println("もっと下の数字です");
        } else {
          System.out.println("もっと上の数字です");
        }
      }
  }
}
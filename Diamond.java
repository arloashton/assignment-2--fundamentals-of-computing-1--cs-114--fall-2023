//Arlo Ashton

import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int userSize;
    String brick;

    Scanner sizeScan = new Scanner(System.in);
    System.out.println("Provide an integer for size of diamond");
    userSize = sizeScan.nextInt();

    if(userSize % 2 != 0){
      brick = "*";
    }
    else{
      brick = "* ";
    }
  }
}

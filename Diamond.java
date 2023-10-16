//Arlo Ashton

import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int userSize, length;
    double radius;
    String brick;

    Scanner sizeScan = new Scanner(System.in);
    System.out.println("Provide an integer for size of diamond");
    userSize = sizeScan.nextInt();

    radius = Math.floor(userSize/2);

    System.out.println(radius);

    if(userSize % 2 != 0){ //check if integer provided is even or odd
      brick = "*";
      }
    else{
      brick = "* ";

    }


  }
}

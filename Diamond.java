//Arlo Ashton

import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int userSize, length;
    double radius;
    String brick;
    String filler = " ";
    Scanner sizeScan = new Scanner(System.in);
    System.out.println("Provide an integer for size of diamond");
    userSize = sizeScan.nextInt();

    radius = Math.floor(userSize/2);

    System.out.println(radius);

    if(userSize % 2 != 0){ //check if integer provided is odd
      brick = "*"; //sets the string of which the diamond is built to "*" since the userSize is odd
      length = 1;
      while(length < userSize){
        for(int i = 0; i < (userSize-length)/2; i++){
          System.out.print(filler);
        }
        for(int i = 0; i < length; i++){
          System.out.print(brick);
        }
        System.out.println("");
        length+=2;
      }
      if(length == userSize){
        for(int i = 0; i<userSize; i++ ){
          System.out.print(brick);
        }
      }
      length-=2;
      System.out.println("");

      while(length>0){
        for(int i = 0; i < (userSize-length)/2; i++){
          System.out.print(filler);
        }
        for(int i = 0; i < length; i++){
          System.out.print(brick);
        }
        System.out.println("");
        length-=2;
      }
    }
    else{//check if integer provided is even
      brick = "* ";

    }


  }
}

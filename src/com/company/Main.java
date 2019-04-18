package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String answer;

        boolean done = false;
        while(!done){
            System.out.println("still in the loop");
            System.out.println("do you want to go again?y/n");
            answer = scan.nextLine();
              if (answer.toLowerCase().equals("yes")||answer.toLowerCase().equals("y")){
                done=false;
              }else{
                done=true;
              }
        }


        for(int i=1 ; i < 11; i++) {
            System.out.println("Count is: " + i);
            if (i % 2 == 0){
                System.out.printf("%d is an even number\r\n", i);
            }else{
            System.out.printf("%d is an odd number\r\n", i);
        }

        }
        System.out.println("goodbye!");




    }
}

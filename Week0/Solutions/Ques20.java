import java.util.Scanner;

public class Ques20{
    public static void main(String[] args) {

    /*  
          * 
        *   *
      *       *
    *           * 
      *       * 
        *   *
          *    
          
          */
                
          int n = 7; 
                int a = (n+1)/2;
                for(int i = a; i>= 1; i--){
                    for(int j = 1; j<= i;  j++){
                        if(j==i){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                    for(int j = 1; j<= a-i; j++){
                        System.out.print("  ");
                    }
                    for(int j =2; j<= a-i; j++){
                        System.out.print("  ");
                    }
                    for(int j =1; j<= a-i && j<= 1 ; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for(int i = 2; i<= a; i++){
                    for(int j = 1; j<= i;  j++){
                        if(j==i){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                    for(int j = 1; j<= a-i; j++){
                        System.out.print("  ");
                    }
                    for(int j =2; j<= a-i; j++){
                        System.out.print("  ");
                    }
                    for(int j =1; j<= a-i && j<= 1 ; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                } 
            }
        }
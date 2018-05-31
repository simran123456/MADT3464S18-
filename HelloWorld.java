/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simranjit
 */
public class HelloWorld {
    public static void main (String args[]){
        System.out.println("Hello Java");
        int n1 = 10;
        if (n1 % 2 ==0){
            System.out.println("Even");
        }else{
             System.out.println("Odd");
            
        }
        char pass = 'A';
        switch(pass)
        {
            case 'A':
                System.out.println("Adult pass : valid pass");
                break;
            case 'S':
                System.out.println("Student pass : valid pass");
                break;
            case '0':
                System.out.println("Senior Citizen : valid pass");
                break;
            default:
                System.out.println("invalid pass : valid pass");
                break;
    
        }
        char pass1 = 'A';
        switch(pass){
            case 'A':
            case 'S':
            case '0':
                System.out.println("Senior Citizen : valid pass");
                break;
            default:
                System.out.println("invalid pass : valid pass");
                break;
        }
        
        switch(10+20){
            case 10:
                System.out.println("value is");
                break;
            case 20:
                System.out.println("value is");
                break;
            case 30:
                System.out.println("value is");
                break;
        }
         n1 =20;

        while(n1 >10){
            System.out.println("n1 : " + n1);
            n1--;
    }
        
        do{
            
            System.out.println("n1 : " + n1);
            n1--;
        }while(n1 > 10);
        int i;
        for(i=0; i<5 ; i++){
             System.out.println("i : " + i);
            
        }
       int I=0;
       for( ; ; ){
           
           if (i == 3){
               continue;
           }else if (i < 5){
             System.out.println("i : " + i);
             
           }else{
               break;
           }
       }
       for (i=1; i<=5 ; i++){
           if (i == 3){
               continue;
           }else{
             System.out.println("i : " + i);   
           }
        }
        for (i=1; i<=5 ; i++){
             for ( int j=1; j<=i ; j++){
                 System.out.print("*");
             }
             System.out.println(""); 
             }
        for (i=1; i<=5 ; i++){
             for ( int j=1; j<=i ; j++){
                 System.out.print("*");
             }
             System.out.println(""); 
             }
        for (i=1; i<=5 ; i++){
        for (int space = 5; space>i ; space--){
                 System.out.print(" ");
             }
          for ( int j=1; j<=i ; j++){
             System.out.println("* "); 
             }
         System.out.println("");
        
        }
    }
}
    
    

        
    


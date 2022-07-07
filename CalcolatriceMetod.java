import java.util.Scanner;


public class CalcolatriceMetod{

    public static int somma(int a,int b) {
        return a + b;
    }
    public static int prodotto(int a,int b) {
        return a*b;  
    }
    public static int differenza(int a,int b) {
        return a-b; 
    }
    public static int divisione(int a,int b) {
        if(b!=0){
            return a/b;
        }else{
            System.out.println("Error divisione!!");
            System.exit(1);
        }
      return 0;   
    }




}
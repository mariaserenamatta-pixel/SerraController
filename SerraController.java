
package serracontroller;
import java.util.Scanner;

public class SerraController {
   //Metodo per leggere la temperatura da input
public static double leggiTemperatura(){
    double temperatura;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Inserisci la temperatura attuale: ");
        temperatura = scanner.nextDouble();
    }
return temperatura;
}

    
    public static void main(String[] args) {
        double temperatura = leggiTemperatura();
    System.out.println("Temperatura attuale:"+temperatura+"°C");
        if(temperatura<18){
    System.out.println("Temperatura troppo bassa!Attiva il riscaldamento.");
    }else
       if(temperatura>30){
    System.out.println("Temperatura troppo alta! Attiva ventilazione.");       
       }else{
    System.out.println("Temperatura ideale per la serra");       
       }
        
    }
    
}
    
    
    
   
    


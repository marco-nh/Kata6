package kata6;

import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class Kata6 {

    public static void main(String[] args) {
        String str = "";
        Scanner obj = new Scanner(System.in);
        while(true){
            SerialNumberGenerator serie = new SerialNumberGenerator();
            str = obj.nextLine();
            
            if (str.contentEquals("exit")){
                break;
            } else if(str.contentEquals("car")){
                Car car = new Car(serie.next(),"coche");
                car.pack();
                car.label();
                
                System.out.println("Coche creado");
            } else if(str.contentEquals("helicopter")){
                Helicopter helicopter = new Helicopter(serie.next(), "helicoptero");
                helicopter.pack();
                helicopter.label();
                
                System.out.println("Helicoptero creado");
            } else{
                System.out.println("Command unknown!");
            }
        }
        
    }
    
}

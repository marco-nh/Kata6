package kata6;

import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Kata6 {

    public static void main(String[] args) {
        String str = "";
        Scanner obj = new Scanner(System.in);
        ToyBusiness creador = new ToyBusiness();
        while(true){
            
            str = obj.nextLine();
            
            if (str.contentEquals("exit")){
                break;
            } else if(str.contentEquals("car")){
                creador.createCar();
                System.out.println(creador.getSerieNumber());
                System.out.println("Coche creado");
            } else if(str.contentEquals("helicopter")){
                creador.createHelicopter();
                System.out.println(creador.getSerieNumber());
                System.out.println("Helicoptero creado");
            } else{
                System.out.println("Command unknown!");
            }
        }
        
    }
    
}

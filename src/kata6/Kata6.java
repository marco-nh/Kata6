package kata6;

import java.util.Scanner;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;
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
                creador.createToy(str);
                System.out.println(creador.getSerieNumber());
                System.out.println("Coche creado");
            } else if(str.contentEquals("helicopter")){
                creador.createToy(str);
                System.out.println(creador.getSerieNumber());
                System.out.println("Helicoptero creado");
            } else{
                System.out.println("Command unknown!");
            }
        }
        
    }
    
}

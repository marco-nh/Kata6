package kata6;

import java.util.Scanner;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AsianCarToy;
import business.SerialNumberGenerator;
import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import business.ToyBusiness;

public class Kata6 {

    public static void main(String[] args) {
        String str = "";
        Scanner obj = new Scanner(System.in);
        ToyBusiness creador;
        System.out.println("american o asian");
        str = obj.nextLine();
        
        
        //Selecionar rama
        if (str.contentEquals("american")){
            creador = new AmericanToyBusiness();
        } else if (str.contentEquals("asian")){
            creador = new AsianToyBusiness();
        } else{
            //Default
            creador = new AmericanToyBusiness();
            str = "american (defecto)";
        }
        
        System.out.println("Servidor: " + str + " ,escribe juguete");
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

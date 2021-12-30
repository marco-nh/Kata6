package kata6;

import java.util.Scanner;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AsianCarToy;
import factories.SerialNumberGenerator;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
import business.ToyBusiness;
import toyproducts.Toy;

public class Kata6 {

    public static void main(String[] args) {
        String str = "";
        Scanner obj = new Scanner(System.in);
        ToyBusiness creador;
        System.out.println("american o asian");
        str = obj.nextLine();
        
        
        //Selecionar rama
        if (str.contentEquals("american")){
            
            creador = new ToyBusiness(new AmericanToyFactory());
        } else if (str.contentEquals("asian")){
            creador = new ToyBusiness(new AsianToyFactory());
        } else{
            //Default
            creador = new ToyBusiness(new AmericanToyFactory());
            str = "american (defecto)";
        }
        
        System.out.println("Servidor: " + str + " ,escribe juguete");
        while(true){
            
            str = obj.nextLine();
            
            if (str.contentEquals("exit")){
                break;
            } else if(str.contentEquals("car")){
                creador.produceToy(str);
                System.out.println(creador.getToyfactory().getSerieNumber());
                System.out.println("Coche creado");
            } else if(str.contentEquals("helicopter")){
                creador.produceToy(str);
                System.out.println(creador.getToyfactory().getSerieNumber());
                System.out.println("Helicoptero creado");
            } else{
                System.out.println("Command unknown!");
            }
        }
        
    }
    
}

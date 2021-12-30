
package branches;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import business.SerialNumberGenerator;
public class AmericanToyBusiness extends ToyBusiness {
    SerialNumberGenerator serie = new SerialNumberGenerator();

    public AmericanToyBusiness() {
    }
    public Toy createToy(String type){
       Toy toy;
       switch(type){
           case "car":
            toy = new AmericanCarToy(serie.next(), type);
            break;
           case "helicopter":
            toy = new AmericanHelicopterToy(serie.next(), type);
            break;
       }
       return null;
    }
    
    //comprobar, no esta en el UML
    public Integer getSerieNumber(){
        return serie.getSerialNumber();
    }
}

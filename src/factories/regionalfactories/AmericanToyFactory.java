
package factories.regionalfactories;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import factories.SerialNumberGenerator;
import factories.ToyFactory;
public class AmericanToyFactory extends ToyFactory {
    SerialNumberGenerator serie = new SerialNumberGenerator();

    public AmericanToyFactory() {
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
           default:
            toy = new AmericanHelicopterToy(-1, "fallo");
       }
       return toy;
    }
    
    //comprobar, no esta en el UML
    public Integer getSerieNumber(){
        return serie.getSerialNumber();
    }
}

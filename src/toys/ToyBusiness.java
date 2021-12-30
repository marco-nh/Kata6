
package toys;

import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;
import toyproducts.*;
public class ToyBusiness {
    SerialNumberGenerator serie = new SerialNumberGenerator();

    public ToyBusiness() {
    }
    public Toy createToy(String type){
       Toy toy;
       switch(type){
           case "car":
            toy = new CarToy(serie.next(), type);
            break;
           case "helicopter":
            toy = new HelicopterToy(serie.next(), type);
            break;
       }
       return null;
    }
    
    //comprobar, no esta en el UML
    public Integer getSerieNumber(){
        return serie.getSerialNumber();
    }
}

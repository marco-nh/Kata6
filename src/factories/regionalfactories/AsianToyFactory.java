
package factories.regionalfactories;


import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;
import factories.SerialNumberGenerator;
import business.ToyBusiness;
import factories.ToyFactory;

public class AsianToyFactory extends ToyFactory{
    SerialNumberGenerator serie = new SerialNumberGenerator();

    public AsianToyFactory() {
    }
    public Toy createToy(String type){
       Toy toy;
       switch(type){
           case "car":
            toy = new AsianCarToy(serie.next(), type);
            break;
           case "helicopter":
            toy = new AsianHelicopterToy(serie.next(), type);
            break;
           default:
            toy = new AsianCarToy(-1, "fallo");   
       }
       return toy;
    }
    
    //comprobar, no esta en el UML
    public Integer getSerieNumber(){
        return serie.getSerialNumber();
    }
}

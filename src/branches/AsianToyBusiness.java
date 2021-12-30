
package branches;


import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;
import business.SerialNumberGenerator;
import business.ToyBusiness;

public class AsianToyBusiness extends ToyBusiness{
    SerialNumberGenerator serie = new SerialNumberGenerator();

    public AsianToyBusiness() {
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
       }
       return null;
    }
    
    //comprobar, no esta en el UML
    public Integer getSerieNumber(){
        return serie.getSerialNumber();
    }
}

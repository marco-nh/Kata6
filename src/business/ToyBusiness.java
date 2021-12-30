
package business;


import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;
public abstract class ToyBusiness {
    SerialNumberGenerator serie = new SerialNumberGenerator();

    public ToyBusiness() {
    }
    public abstract Toy createToy(String type);
    
    //comprobar, no esta en el UML
    public abstract Integer getSerieNumber();
}

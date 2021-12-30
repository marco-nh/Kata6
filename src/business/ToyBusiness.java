
package business;


import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class ToyBusiness {
    ToyFactory toyfactory;

    public ToyBusiness(ToyFactory toyfactory) {
        this.toyfactory = toyfactory;
    }

    public Toy produceToy(String type){
        return toyfactory.produceToy(type);
    };
    //Comprobacion, no esta en el UML
    public ToyFactory getToyfactory() {
        return toyfactory;
    }
    
}

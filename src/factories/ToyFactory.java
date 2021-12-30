package factories;


import factories.SerialNumberGenerator;
import factories.regionalfactories.AmericanCarToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;
public abstract class ToyFactory {
    
    public ToyFactory() {
    }
    public abstract Toy createToy(Integer serialNumber);
    public Toy produceToy(Integer serialNumber){
        Toy toy = createToy(serialNumber);
        toy.label();
        toy.pack();
        return toy;
    }
    //comprobar, no esta en el UML
    public abstract Integer getSerieNumber();
}

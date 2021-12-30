package factories;


import factories.SerialNumberGenerator;
import factories.regionalfactories.AmericanToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;
public abstract class ToyFactory {
    SerialNumberGenerator serie = new SerialNumberGenerator();

    public ToyFactory() {
    }
    public abstract Toy createToy(String type);
    public Toy produceToy(String type){
        Toy toy = createToy(type);
        toy.label();
        toy.pack();
        return toy;
    }
    //comprobar, no esta en el UML
    public abstract Integer getSerieNumber();
}

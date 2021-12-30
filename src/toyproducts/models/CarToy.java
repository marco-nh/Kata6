
package toyproducts.models;

import toyproducts.Toy;

public class CarToy implements Toy {
    Integer serialNumber;
    String type;

    public CarToy(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }
    
    public void pack(){
        
    }
    public void label(){
        
    }
    
}

package toyproducts.models;

import toyproducts.Toy;

public class HelicopterToy implements Toy {
    Integer serialNumber;
    String type;

    public HelicopterToy(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
    }

    public void label() {
    }

    public void pack() {
    }
    
}

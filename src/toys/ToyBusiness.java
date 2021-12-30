
package toys;

public class ToyBusiness {
    SerialNumberGenerator serie = new SerialNumberGenerator();

    public ToyBusiness() {
    }
    public Car createCar(){
        Car car = new Car(serie.next(),"coche");
        car.pack();
        car.label();
        
        return car;
    }
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(serie.next(),"helicoptero");
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
    
    public Integer getSerieNumber(){
        return serie.getSerialNumber();
    }
}

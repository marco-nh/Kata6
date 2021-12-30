/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package toys;

public class SerialNumberGenerator {
    Integer serialNumber;

    public SerialNumberGenerator() {
        this.serialNumber = 0;
    }
    
    public Integer next(){
        return ++serialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
    
}

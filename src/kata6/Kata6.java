package kata6;

import java.util.Scanner;
import toys.Car;
import toys.SerialNumberGenerator;

public class Kata6 {

    public static void main(String[] args) {
        String str = "";
        Scanner obj = new Scanner(System.in);
        while(true){
            SerialNumberGenerator serie = new SerialNumberGenerator();
            str = obj.nextLine();
            
            if (str.contentEquals("exit")){
                break;
            } else{
                Car car = new Car(serie.next());
                car.pack();
                car.label();
            }
            
        }
        
    }
    
}

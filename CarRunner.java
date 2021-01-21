import static java.lang.System.*;
public class CarRunner{
   public static void main(String[]arqs){
       Car carOne = new Car("Ford",25,false);
       
       out.println(carOne+"\n"); 
       carOne.setCarBrand("Subaru");
       out.println(carOne+"\n");
       carOne.carMoving(25);
       out.println(carOne+"\n");
       carOne.carGallonDecrease(25);
       carOne.carStop(0);
       out.println(carOne);
   }
}

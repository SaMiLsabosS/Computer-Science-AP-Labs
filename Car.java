public class Car{
  private String carBrand;
  private int numGallons;
  private boolean moving;
  
  public Car(String c, int g, boolean m){
      carBrand = c;
      numGallons = g;
      moving = m;
  }
  
  public void setCarBrand(String c){
      carBrand = c;
  }
  
  public void setNumGallons(int g){
      numGallons = g;
  }
  
  public void setMoving(boolean m){
      moving = m;
  }
  
  public String getCarBrand(){
     return carBrand;
  }
  
  public int getNumGallons(){
     return numGallons;
  }
  
  public boolean getMoving(){
     return moving;
  }
  
  public String toString(){
     return "Car Brand: "+carBrand+"\nNumber of Gallons: "+numGallons+"\nCar Moving?: "+moving;
  }
  
  public void carMoving(int g){
     if(numGallons<=25 || numGallons>=10)
       moving = true;
  }
  
  public void carStop(int g){
     if(numGallons==0)
       moving = false;
  }
  
  public void carGallonDecrease(int g){
     for(int i=g;i>0;i--){
       g--;
     }
     if(g==0){
       numGallons = 0;
     }
  }
}

public class Turkey
{
    private String name, size;
    private double ounces;
    public Turkey(){
        name="X Æ A-12";
        ounces=1;
        size="tiny";}
    public Turkey(String n,double o){
        name=n;
        ounces=o;
        if(ounces>0.0 && ounces<11.0)
           size="tiny";        
        else if(ounces>10.0 && ounces<26.0)
           size="small";       
        else if(ounces>25.0 && ounces<51.0)
           size="average";        
        else if(ounces>50.0 && ounces<76.0)
           size="big";         
        else
           size="thick";}
    public void setName(String n){name=n;}
    public void setSize(String s){size=s;}
    public void setOunces(double o){
        ounces=o;
        if(ounces>0.0 && ounces<11.0)
           size="tiny";        
        else if(ounces>10.0 && ounces<26.0)
           size="small";       
        else if(ounces>25.0 && ounces<51.0)
           size="average";        
        else if(ounces>50.0 && ounces<76.0)
           size="big";         
        else
           size="thick";}
    public String getName(){return name;}
    public String getSize(){return size;}
    public double getOunces(){return ounces;}
    public String toString(){return name+" the "+size+" turkey is "+ounces+" ounce(s)";}}
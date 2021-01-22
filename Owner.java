import java.util.ArrayList;
/*
 * Programmer: Sami Melhem
 * Date: 12/13/20
 * Pet Spa Project
*/
public class Owner{
    private String name, streetAddress, phone;
    private double bill;
    private ArrayList<Pet> dragons;
    public Owner(String n,String sA,String p){
        name=n;
        streetAddress=sA;
        phone=p;
        dragons=new ArrayList<Pet>();}
    public void setName(String n){
        name=n;
    }
    public void setStreetAddress(String sA){
        streetAddress=sA;
    }
    public void setPhone(String p){
        phone=p;
    }
    public void setBill(double b){
        bill=b;
    }
    public String getName(){
        return name;
    }
    public String getStreetAddress(){
        return streetAddress;
    }
    public String getPhone(){
        return phone;
    }
    public double getBill(){
        return bill;
    }
    public Pet getPet(int petNum){
        return dragons.get(petNum);
    }
    public ArrayList<Pet> getPets(int petNum){
        return dragons;
    }
    public void addPet(String n,int a){
        Pet newDragon=new Pet(n,false,false,a);
        dragons.add(newDragon);
    }
    public void removePet(int p){
        dragons.remove(p);
    }
    public String toString(){
        String output=name+" dogs:\n";
        for(int i=0;i<dragons.size();i++)
           output+=i+"  "+dragons.get(i).getName()+"\n";
        output+="\n";
        return output;
    }
}

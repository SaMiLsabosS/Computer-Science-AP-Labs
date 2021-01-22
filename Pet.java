/*
 * Programmer: Sami Melhem
 * Date: 12/13/20
 * Pet Spa Project
*/ 
public class Pet{
    private boolean clean, brush;
    private String name;
    private int age;
    public Pet(String n,boolean c,boolean b,int a){
        name=n;
        clean=c;
        brush=b;
        age=a;
    }
    public void setName(String n){
        name=n;
    }
    public void setClean(boolean c){
        clean=c;
    }
    public void setBrush(boolean b){
        brush=b;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public boolean getClean(){
        return clean;
    }
    public boolean getBrush(){
        return brush;
    }
    public int getAge(){
        return age;
    }
}
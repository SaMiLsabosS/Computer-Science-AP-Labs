import static java.lang.System.*;
import java.util.*;
import java.util.ArrayList;
/*
  Programmer: Sami Melhem
  Date: 12/13/20
  Pet Spa Project
*/ 
public class PetSpaRunner{
    public static void main(){
        Scanner k=new Scanner(System.in);
        Owner evan=new Owner("Evan","78953 Sus Susan Drive","444-444-4444");
        evan.addPet("Mr.Hoe",3);
        Owner ryan=new Owner("Ryan","86548 Rally John street","555-555-5555");
        ryan.addPet("Dumb",4);
        ryan.addPet("Dumber",6);
        ArrayList<Owner> owners=new ArrayList<Owner>(Arrays.asList(evan,ryan));
        ArrayList<Pet> pets=new ArrayList<Pet>();
        boolean end=false;
        out.println("Dragon Temple Of Mehbum");
        while(!end){
            out.print("enter 1 to check-in a pet\nenter 2 to check-out a pet\nenter 3 to wash pet\nenter 4 to trim pet\nenter 5 for a status report on checked-in pets\nenter 6 to print cust bills\nenter 7 to add a customer\nenter 8 to end\nentry: ");
            int num=k.nextInt();
            k.nextLine();
            if(num==1){
               out.println(printOwners(owners));
               out.print("Which customer is checking in a pet? ");
               int customNum=Integer.valueOf(k.next());
               out.println(owners.get(customNum)); 
               out.print("Which pet is checking in? ");
               pets.add(owners.get(customNum).getPet(Integer.valueOf(k.next())));
               out.println(printPets(pets));
            }   
            else if(num==2){
               if(pets.size()==0)
                 out.println("There are no checked-in pets");
               else{
                 out.println(printPets(pets));
                 out.print("Which pet is checking out? ");
                 pets.remove(k.nextInt());
                 out.println();
               }
            } 
            else if(num==3){
               if(pets.size()==0)
                 out.println("There are no checked-in pets");
               else{
                 out.println(printPets(pets));
                 out.print("Which pet is going to be washed? ");
                 int petsNum=Integer.valueOf(k.next());
                 pets.get(petsNum).setClean(true);
                 for(int i=0;i<owners.size();i++)
                     if(owners.get(i).getPet(i).equals(pets.get(petsNum)))
                        owners.get(i).setBill(30);                                  
                 out.println();
               }
            } 
            else if(num==4){
               if(pets.size()==0)
                 out.println("There are no checked-in pets");
               else{
                 out.println(printPets(pets));
                 out.print("Which pet is going to be brushed? ");
                 int petsNum=Integer.valueOf(k.next());
                 pets.get(petsNum).setBrush(true);
                 for(int i=0;i<owners.size();i++)
                     if(owners.get(i).getPet(i).equals(pets.get(petsNum)))
                        owners.get(i).setBill(30);   
                 out.println();
               }
            } 
            else if(num==5){
               if(pets.size()==0)
                  out.println("There are no checked-in pets");
               else
                  out.println(printPets(pets));             
            } 
            else if(num==6){
               String billList="\n";
               for(int i=0;i<owners.size();i++)
                  if(owners.get(i).getBill()>0.0)
                      billList+=i+"   "+owners.get(i).getName()+" owes us "+owners.get(i).getBill()+" dollars\n";                      
               out.println(billList);
            } 
            else if(num==7){
               out.print("What is this new customer's name? ");
               String customName=k.nextLine();
               out.print("What is their street address? ");
               String streetAddress=k.nextLine();
               out.print("What is their phone number? ");
               String phoneNumber=k.nextLine();
               Owner customer=new Owner(customName,streetAddress,phoneNumber);
               owners.add(customer);
               out.print("What is your first dragon's name? ");
               String newPetName1=k.nextLine();
               out.print("How old is "+newPetName1+"? ");
               int newPetAge1=k.nextInt();
               k.nextLine();
               customer.addPet(newPetName1,newPetAge1);
               out.print("What is your second dragon's name? ");
               String newPetName2=k.nextLine();
               out.print("How old is "+newPetName2+"? ");
               int newPetAge2=k.nextInt();
               k.nextLine();
               customer.addPet(newPetName2,newPetAge2);
               out.println();
            } 
            else if(num==8){
               end=true;
               out.println("Thank you for coming!");
            }
            else
               out.println("\nPlease enter a number that's between 1 and 8! - Mr.Villapondo\n");
        }
    }
    public static String printOwners(ArrayList<Owner> owners){
        String output="\n";
        for(int i=0;i<owners.size();i++)
            output+=i+"   "+owners.get(i).getName()+" owes us "+owners.get(i).getBill()+" dollars\n"; 
        return output;
    }
    public static String printPets(ArrayList<Pet> pets){
        String output="\n";
        for(int i=0;i<pets.size();i++){
           output+=i+" "+pets.get(i).getName()+"  \t";
           if(pets.get(i).getClean())
              output+="clean";
           else
              output+="dirty";
           if(pets.get(i).getBrush())
              output+="  fresh\n";
           else
              output+="  dusty\n";
        }
        return output;
    }
}
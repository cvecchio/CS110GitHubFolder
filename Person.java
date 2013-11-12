//Chris Vecchio
//CS110
//Person Class
public class Person 
{ 
   private String Name;
   private int phoneNumber; 
   private String Address;
   public Person() 
   { 
      Name=""; 
      phoneNumber = 0; 
      Address = ""; 
   } 
   public Person (String n, int p, String a) 
   { 
      Name = n; 
      phoneNumber = p; 
      Address = a; 
   } 
   public Person(Person p)
   {
      Name = p.Name;
      phoneNumber = p.phoneNumber;
      Address = p.Address;
   }
   public void setName(String n) 
   { 
      Name = n; 
   } 
   public void setIDnumber(int p) 
   { 
      phoneNumber = p; 
   } 
   public void setDepartment(String a) 
   { 
      Address = a; 
   } 
   public String getName() 
   { 
      return Name; 
   } 
   public int getPhoneNumber() 
   { 
      return phoneNumber; 
   } 
   public String getAddress() 
   { 
      return Address; 
   } 
   public String toString()
   {
      return getName() + "\n" + getPhoneNumber() + "\n" + getAddress();
   }
} 
//Change for GitHub


package staffs;
class staff
{
   int Sid;
   String Sname;
   int phone;
   
   
}
   class trainer extends staff
   {
       int Working_Hours;
        trainer(int S,String SN,int P)
       {
           Sid = S;
           Sname = SN;
           phone = P;
           
           
       }
       
        void Set_max_load(int WH )
       {
           
           Working_Hours = WH;
           
           
       }
        
        
         void Get_info()
         {
             
    System.out.println(Sid+" "+Sname+" "+phone+" "+Working_Hours);
       
         } 
        
       
       
   }
    
   
   class employee extends staff
   {
       int overtime;
        employee(int S,String SN,int P)
       {
           
           Sid = S;
           Sname = SN;
           phone = P;
           
           
       }
       
         void Set_max_overtime(int OT )
       {
           
          
           overtime = OT;
           
       }
         
        void Get_info()
      {
    System.out.println(Sid+" "+Sname+" "+phone+" "+overtime);
       } 
       
       
       
       
   }
    
    
    
    
    
    

public class Staffs {

    
    public static void main(String[] args) {
      
        trainer trainer1 = new trainer (1 , "ahmed" , 0444333555);
trainer1.Set_max_load(18);
trainer1.Get_info();

employee employee1 = new employee(10,"Ali",0333444666);
        employee1.Set_max_overtime(40);
        System.out.println("\n");
        employee1.Get_info();
         
         
        
    }
    
}

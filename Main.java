import java.sql.Timestamp;
import java.util.*;
import java.util.Scanner;


public class Main extends User 
{


  
    public static void main(String[] args) {
        User U;
        Network N=new Network();
        
        int login=0;
        
        Scanner in=new Scanner(System.in);
        
        
        
       
       
        while(true)
        {
            
            
            if (login==0)
            {
                System.out.println("Create Account or Login (1,2):");
                String a=in.nextLine();
                if (a.equals("1"))
                {
                    System.out.println("Give Email:");
                    String eml=in.nextLine();
                    System.out.println("Give Password:");
                    String pss=in.nextLine();
                    System.out.println("Give FullName:");
                    String on=in.nextLine();
                    
                    User u2=new User();
                    u2.set_user(eml, pss, on);
                    
                    N.insertUser(u2);
                }
                else
                {
                    
                    System.out.println("Email:");
                    String eml=in.nextLine();
                    System.out.println("Password:");
                    String pss=in.nextLine();

                    U=N.findUser(eml, pss);
                    if (U!=null)
                    {
                        Menu M=new Menu(U,N);
                        while(true)
                        {
                         M.show();
                         int k=M.run();

                        if (k==1) break;
                        if (k==2) System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.println("Not Found User");

                    }
                }
                
            }
          
        }
    }
    
}

import java.sql.Timestamp;
import java.util.*;
import java.util.Scanner;

class User 
{
    String email,password,fname;
  
    List Requests=new ArrayList();
    List Friends=new ArrayList();
    
    Wall W;
    
    
    User()
    {
        email="";
        password="";
        fname="";
        
        
    }
    
    void set_user(String eml, String pss, String on)
    {
        email=eml;
        password=pss;
        fname=on;
        W=new Wall(this);
        
    }
    
    boolean check(String e, String pss)
    {
        if (e.equals(email) && pss.equals(password))
        {
         return true;   
        }
        else
        {
            return false;
        }
    }
    
    
    
    @Override
    public String toString()
    {
        return "email:"+email+" User-FullName:"+fname;
    }
    
    
    void ShowFriends()
    {
        int i=0;
        for (Object Friend : Friends) {
            
            User U = (User) Friend;
            System.out.println(i+". "+U.toString());
            i++;
        }
    }
}


import java.sql.Timestamp;
import java.util.*;
import java.util.Scanner;
class Network extends User
{
    List Users_of_net;
    
    Network()
    {
        Users_of_net=new ArrayList();
    }
    
    void insertUser(User u)
    {
        Users_of_net.add(u);
        
    }
    
    User findUser(User u)
    {
       
       int n=Users_of_net.indexOf(u);
       if(n!=-1)
           return (User) Users_of_net.get(n);
       else
           return null;
       
    }
    
     User findUser(String eml, String pss)
    {
       for (int i=0;i<Users_of_net.size();i++)
       {
           User u=(User) Users_of_net.get(i);
           if(u.check(eml, pss))
           {
              return u; 
           }
           
       }
       return null;
    }
    
    void delUser(User u)
    {
        Users_of_net.remove(u);
    }
    
   
}


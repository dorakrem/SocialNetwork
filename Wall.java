import java.sql.Timestamp;
import java.util.*;
import java.util.Scanner;
class Wall extends User
{
    List Posts=new ArrayList();
    User U;
    Wall (User u)
    {
        U=u;
    }
    
    void newPost(User u2)
    {
        Message m=new Message();
        m.set(u2);
        Posts.add(m);
    }
    
    void getList()
    {
        int i=0;
        for (Object Post : Posts) {
            Message m;
            m=(Message) Post;
            System.out.println(i+". " +m.toString());
            i++;
        }
        
    }
    
    void Show()
    {
        System.out.println("My Posts");
        System.out.println("-----------");
        getList();
        System.out.println("\n Friends Posts");
        System.out.println("-----------");
        for (Object F: U.Friends)
        {
            User uu;
            uu=(User) F;
            uu.W.getList();
        }
        
        
        
    }
  
   
    
}
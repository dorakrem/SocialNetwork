import java.sql.Timestamp;
import java.util.*;
import java.util.Scanner;

class Message extends User
{
    String text;
    User u;
    Timestamp timestamp;
    List Likes;
    List ReplyMessages;
    
    Scanner in=new Scanner(System.in);
    
    Message()
    {
        u=new User();
        text="";
        Likes=new ArrayList();
        ReplyMessages=new ArrayList();
    }
    
    void set(User u1)
    {
        u=u1;
        timestamp = new Timestamp(System.currentTimeMillis());
        
        System.out.println("Text of message:");
        text=in.nextLine();
        
    }
    
    
    public String toString()
    {
        String s;
        s= text+" time:"+timestamp.toString()+"\n Number of Likes:"+Num_of_Likes();
        for (Object R : ReplyMessages) {
            Message mm=(Message) R;
            s=s+"\n "+text;
        }
        return s;
    }
  
    void UserLikes()
    {
        System.out.println("Likes from:");
        String s="";
         for (Object Like : Likes) {
            User uu=(User) Like; 
            s=s+"\n like from:"+uu.email;
        }
        System.out.println(s);
    }
    
    void reply(User u2)
    {
        Message m2=new Message();
        m2.set(u2);
        
        this.ReplyMessages.add(m2);
    }
    
    void like(User u2)
    {
        int f=0;
        if(Likes.contains(u2))
        {
            
            System.out.println("You already made like");
        }
        else
        {
            Likes.add(u2);
        }
    }
    
    int Num_of_Likes()
    {
        return Likes.size();
    }
    

}
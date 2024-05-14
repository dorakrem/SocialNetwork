import java.sql.Timestamp;
import java.util.*;
import java.util.Scanner;
class FriendRequest extends User
{
    User user1,user2;
    Timestamp timestamp;
    
    
    FriendRequest(User u1, User u2)
    {
        user1=u1;
        user2=u2;
        timestamp= new Timestamp(System.currentTimeMillis());
        user2.Requests.add(this);
      
    }
    
    void accept(int s)
    {
        user1.Friends.add(user2);
        user2.Friends.add(user1);
        
    }
    
    void reject(int s)
    {
        user2.Requests.remove(this);
    }

    void show()
    {
        System.out.println(user2.toString()+" Timestamp:"+timestamp);
    }
}

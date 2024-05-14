import java.sql.Timestamp;
import java.util.*;
import java.util.Scanner;

class Menu extends User
{
    int choice;
    User u;
    Network N;
    
    Scanner in=new Scanner(System.in);
    Menu(User u1,Network n2)
    {
      choice=0;
      u=u1;  
      N=n2;
        
    }
    
    void show()
    {
        System.out.println("1. See your Wall");
        System.out.println("2. See Friends Wall");
        System.out.println("3. See Friends Request");
        System.out.println("4. Accept/Reject friend request");
        System.out.println("5. See my friends");
        System.out.println("6. Logout");
        System.out.println("7. Exit");
        
        
        choice=in.nextInt();
        
        
        
    }
    
    int run()
    {
        Scanner in=new Scanner(System.in);
        if(choice==1)
        {
          
            u.W.Show();
            System.out.println("New Post?");
            String f=in.nextLine();
            if (f.equals("Y"))
            {
                u.W.newPost(u);
            }
        }
        
        if(choice==2)
        {
            System.out.println("Your Friends");
            u.ShowFriends();
            
            System.out.println("Give a number:");
            int f=in.nextInt();
            System.out.println("1. New Post");
            System.out.println("2. Reply Message");
            System.out.println("3. Like");
            System.out.println("Give a Choice:");
            int ch2=in.nextInt();
            
            User U2=(User) u.Friends.get(f);
            if(ch2==1)
            {
                U2.W.newPost(U2);
            }
            if(ch2==2)
            {
                U2.W.getList();
                
                    System.out.println("Give a number:");
                    int mm=in.nextInt();
                Message m=(Message) U2.W.Posts.get(mm);
                m.reply(u);
            }
            if(ch2==3)
            {
                U2.W.getList();
                
                    System.out.println("Give a number:");
                    int mm=in.nextInt();
                Message m;
                m=(Message) U2.W.Posts.get(mm);
                m.like(u);
            }
            
         
        }
        
        if(choice==3)
        {
            int i=0;
            for (Object F: N.Users_of_net)
            {
                User ff=(User) F;
                
                if (!u.Friends.contains(ff))
                {
                    System.out.println(i+" "+ff.toString());
                }
                i++;
            }
            
               System.out.println("Give a number:");
               int f=in.nextInt();
               User u2;
               u2=(User) N.Users_of_net.get(f);
               FriendRequest rq=new FriendRequest(u, u2);
               u2.Requests.add(u);
            
        }
        
        if(choice==4)
        {
            int i=0;
            for (Object R: u.Friends)
            {
                FriendRequest rq=(FriendRequest) R;
                System.out.println(i+". "+rq.user2.toString());
                i++;
            }
            
               System.out.println("Give a number:");
               int f=in.nextInt();
               System.out.println("1. Accept, 2. Reject");
               int acc=in.nextInt();
               
               FriendRequest rq2=(FriendRequest) u.Requests.get(f);
               if(acc==1)
               {
                   rq2.accept(acc);
                   
               }
               else
               {
                   rq2.accept(acc);
                   
               }
        }
        if(choice==5)
        {
            u.ShowFriends();
        }
        
        if(choice==6)
        {
            
            return 1;
        }
        
         if(choice==7)
        {
            
            return 2;
        }
        
        return 0;
    }
    
}


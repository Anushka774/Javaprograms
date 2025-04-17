package user_post;

public class User 
{
   Post[] post;
   String username;
   static int count=0;
   
   
   public User(int size, String username)
   {
	   this.post=new Post[size];
	   this.username=username;
   }
   
   public void addPost(Post posts)
   {
	   if(count<post.length)
	   {
		   post[count++]=posts;
		   System.out.println("Post added");
	   }
	   
	   else
		   System.out.println("No post empty");
   }
   
   public void displaypost()
	{
		for(int i=0; i<count; i++)
		{
			System.out.println(post[i].postdescript +" "+ post[i].id);
		}
	}

   
}

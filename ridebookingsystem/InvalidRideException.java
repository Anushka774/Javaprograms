package ridebookingsystem;

public class InvalidRideException extends RuntimeException
{
     public InvalidRideException(String message)
     {
    	 super(message);
     }
}

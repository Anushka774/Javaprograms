package ridebookingsystem;
import java.lang.annotation.Retention;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SecurityCheck 
{
   public String role();
}

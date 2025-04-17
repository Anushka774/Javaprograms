package treeset;
import java.util.*;
public class ComparebyNames implements Comparator<Employee> 
{

	

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.name.compareTo(o1.name);
	}

}

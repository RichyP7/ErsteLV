
public class HelloWorldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calculateAge =0;
		boolean do_calc =true;
		int count = 0;
		
		if (do_calc == false)
		{
			calculateAge = 26;
		}
		else 
		{
			while(do_calc)
			{
				calculateAge = calculateAge + 5;
				if(count>5)
					do_calc=false;
				count++;
			}
		}
		System.out.println("Der Wert beträgt: " + calculateAge);
	}

}

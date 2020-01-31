package hellocucumber;

public class Withoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number = 1;
int n = print(1);

	}

	private static int print(int number) {
		// TODO Auto-generated method stub
		if(number<=100)
		{
			//System.out.print(number);
			print(number+1);
			System.out.print(number );
			
		}
		return number;
		
	}
	

}

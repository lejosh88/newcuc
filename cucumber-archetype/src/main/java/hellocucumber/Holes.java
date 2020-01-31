package hellocucumber;

public class Holes {
static int hole[] ={1,0,0,0,1,0,2,1,0,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 54819;
System.out.print(countHoles(num));

	}

	private static int countHoles(int num) {
		
		int holes = 0;
		// TODO Auto-generated method stub
		while(num>0){
		
		int d = num%10;
		holes = holes + hole[d];
		num=num/10;
	}
return holes;
	}
}

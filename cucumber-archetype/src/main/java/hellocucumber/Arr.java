package hellocucumber;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] Arra = new int[5];
Arra[0] = 20;
Arra[1] = 21;
Arra[2] = 20;
Arra[3] = 20;
Arra[4] = 22;
int count = 0;
int a  = Arra.length;
for(int i=0; i<a;i++){
	
	for(int j= i+1;j<a;j++)
		
              {
                   // System.out.print(Arra[i]);     
                    //System.out.print(Arra[j]);  
              if(Arra[i]==Arra[j])
              {
            	 // System.out.print(Arra[i]);  
            	  count++;
              }
             
              }

        
}
System.out.print(count);
	}
	}


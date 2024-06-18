package Singlelevel;

public class Zara extends ClothesBrand {
	
	
	int price=1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClothesBrand c =new Zara();
		System.out.println(c.material);
		System.out.println(c.size);
		
		Zara z=(Zara)c;
		System.out.println(z.material);
		System.out.println(z.price);
		System.out.println(z.size);
		// cannot access child class members
		
		
		

	}

}

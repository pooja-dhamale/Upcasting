package Singlelevel;

public class Casio extends Watch {
	
	String color="black";
	

   public void setColor(String color) {
		this.color = color;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Watch w=new Fastrack();
		System.out.println(w instanceof Casio);
		if(w instanceof Fastrack)
		{
			Fastrack f=(Fastrack)w;//Down casting
			System.out.println(f.price);
			System.out.println(f.material);
			
			
		}
		else if (w instanceof Casio) 
		{
			Casio c=(Casio)w; // Down casting
			System.out.println(c.color);
			System.out.println(c.price);
			
		}
			
		
	}

}

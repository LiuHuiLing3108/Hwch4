package sample4_5;

public class sample4_5 {

	public static void main(String[] args) 
	{
		Car car1;
		car1 = new RacingCar();
		
		car1.setCar(1234,20.5);
		
		car1.show();
	}
}
public Car()
{
	num = 0;
	gas = 0.0;
	System.out.println("生產了車子");
}
public void setCar(int n,double g)
{
	num = n;
	gas = g;
	System.out.println("將車號設爲"+num+"，汽油量設爲"+gas);
}
public void show()
{
	System.out.println("車號是"+num);
	System.out.println("汽油量是"+gas);
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設爲"+course);
	}
	
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
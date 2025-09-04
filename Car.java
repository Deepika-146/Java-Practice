package Java;
class Cars
{
	String brand;
	String model;
	int speed;
	
	Cars(String brand,String model, int speed)
	{
		this.brand=brand;
		this.model=model;
		this.speed=speed;
	}
	
	void display()
	{
		System.out.println(brand+" "+model+" "+speed);
	}
}
public class Car {

	public static void main(String[] args) {
		Cars car1=new Cars("Ferrari", "488", 330);
		Cars car2=new Cars("Lamborghini", "Aventador", 350);
		Cars car3=new Cars("Bugatti", "Chiron", 420);
		Cars car4=new Cars("Porsche", "911", 310);
		Cars car5=new Cars("Aston Martin", "Vantage", 314);
		
		car1.display();
		car2.display();
		car3.display();
		car4.display();
		car5.display();
		
		
		
	}

}

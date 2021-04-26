package p13.textbook.s130301;

public class ProductExample {
	public static void main(String[] args) {
		
		Product<TV, String> product1 = new Product<TV, String>();
		product1.setKind(new TV());
		product1.setModel("스마트TV");
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}

class TV {}
class Car {}
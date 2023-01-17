package vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck car = new Truck(1000,100.0,5.0);
		System.out.println("최대적재중량\t오일탱크크기\t잔여오일량\t현재적재중량\t연비");
		System.out.println("=============================================");
		System.out.println(car);
		car.addOil(50);
		System.out.println(car);
		car.moving(50);
		System.out.println(car);
		car.addWeight(100);
		System.out.println(car);
		car.moving(30);
		System.out.println(car);
		car.getCost(80);
	}

}

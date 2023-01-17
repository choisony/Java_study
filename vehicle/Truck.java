package vehicle;

public class Truck extends Car{
	
	public Truck() {}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public double getEfficiency() {
		return this.getCurWeight()/5 * 0.2 ;
	}
	
	public void moving(int distance) {
		this.setCurWeight((int)(this.getCurWeight()-calcOil(distance)));
	}
	
	private double calcOil(int distance) {
		return distance/this.getEfficiency();
	}
	
	public int getCost(int distance) {
		return (int)(calcOil(distance)) * 3000;
	}

	@Override
	public String toString() {
		return super.toString()+ "\t\t" + super.getEfficiency();
	}
	
	
}

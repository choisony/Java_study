package vehicle;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;
	public Car() {}
	
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public void addOil(int oil) {
		if (curWeight + this.getOilTankSize() < this.getMaxWeight()){
			curWeight += oil;
		}
	}
	
	public void moving(int distance) {
		curWeight -= this.getEfficiency() * distance;
	}
	
	public void addWeight(int weight) {
		if (curWeight + weight < this.getMaxWeight()) {
			curWeight += weight;
		}
	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t\t"  + restOil +"\t" + curWeight;
	}
}

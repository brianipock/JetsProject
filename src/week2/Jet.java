package week2;

public class Jet {
	//fields
	private String model;
	private double speed;
	private float range;
	private float price;
	private Pilot pilot;
	//constructors
	
	public Jet(String model, double speed, float range, float price, Pilot p){
		setModel(model);
		convertMach(speed);
		setRange(range);
		setPrice(price);
		setPilot(p);
	}
	//methods
	public double convertMach(double getSpeed){
		double mach = 0;
		mach = getSpeed * 0.001303;
		speed = mach;
		return speed;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model == null || model.equals("")) {
			throw new IllegalArgumentException("Not a model");
		}
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		if (speed <= 0 ) {
			throw new IllegalArgumentException("Speed cannot be less than or equal to zero");
		}
		convertMach(speed);
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		if (range <= 0 ) {
			throw new IllegalArgumentException("Range cannot be less than or equal to zero");
		}
		this.range = range;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Price cannot be less than or equal to zero");
		}
		this.price = price;
	}
	public Pilot getPilot() {
		return pilot;
	}
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + " M" + ", range=" + range + ", price=" + price + ", pilot=" + pilot
				+ "]";
	}
}
package wheater;

public class CurrentConditions implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditions(WheaterData wheaterData) {
		this.weatherData = (Subject) wheaterData;
		wheaterData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		
	}
	
	@Override
	public void display() {
		System.out.println("Current condition : " + temperature
				 + "F degrees and " + humidity + "% humidity");
		
	}

}

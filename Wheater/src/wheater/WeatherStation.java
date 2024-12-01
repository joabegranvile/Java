package wheater;

public class WeatherStation {

	public static void main(String[] args) {
		WheaterData wheaterData = new WheaterData();
		
		CurrentConditions currentDisplay =
				new CurrentConditions(wheaterData);
				wheaterData.setMeasurements(80, 65, 40.4f);
				wheaterData.setMeasurements(82, 70, 29.2f);
				wheaterData.setMeasurements(78, 90, 29.2f);

	}

}

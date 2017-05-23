package pattern.observer;

import pattern.observer.observers.GeneralDisplay;
import pattern.observer.observers.StatisticsDisplay;
import pattern.observer.subject.WeatherData;

public class Main {

	public static void main(String[] args) {
		WeatherData data = new WeatherData(10, 10, 10);
		GeneralDisplay gd = new GeneralDisplay();
		StatisticsDisplay sd = new StatisticsDisplay();
		data.addObserver(gd);
		data.addObserver(sd);
		
		data.setHumidity(20); data.notifyObservers();
		data.setPressure(20); data.notifyObservers(new Integer (20));
		data.setTemperature(20); data.notifyObservers(new Integer (30)); 
		
		System.out.println("Completed!!!");
	}

}

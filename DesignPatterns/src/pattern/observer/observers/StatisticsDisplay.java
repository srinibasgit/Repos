package pattern.observer.observers;

import java.util.Observable;
import java.util.Observer;

import pattern.observer.subject.WeatherData;

public class StatisticsDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		WeatherData data = (WeatherData) o;
		System.out.println("New Weather data available in StatisticsDisplay. " + data + arg);
	}

}

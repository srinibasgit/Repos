package pattern.observer.observers;

import java.util.Observable;
import java.util.Observer;

import pattern.observer.subject.WeatherData;

public class GeneralDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		WeatherData data = (WeatherData) o;
		System.out.println("New Weather data available in GeneralDisplay. " + data + arg + "\n");
	}
}

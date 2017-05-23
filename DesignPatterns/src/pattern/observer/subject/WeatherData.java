package pattern.observer.subject;

import java.util.Observable;

public class WeatherData extends Observable {

	int temperature ;
	int humidity ;
	int pressure ;
	
	public WeatherData(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
		setChanged();
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
		setChanged();
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
		setChanged();
	}
	
	@Override
	public String toString() {
		return "temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure + ".\n";
	}
}

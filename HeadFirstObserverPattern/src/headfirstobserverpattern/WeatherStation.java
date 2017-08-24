package headfirst.observer.weatherobservable;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}

main(){
    someCode();
    someCode();
    someCode();
    someCode():
    someCode();
}


differentThread{
    bool flag;
    while(true){
    flag = scanningForSomething();
    if(flag){
       // Immediately interrupt normal execution of code in main Thread and 
       // execute blah blah blah. (Without just throwing a bunch of conditional
       // checks everywhere in the main Thread
        }
    }
}


abstract class test{
    Object lock;
    public void execute(){
        synchronized(new Lock()){
            currentObject.execute();
        }
    }
    
    
}
}

package Episode7p2.task10;

public class Solution {
	public static void main(String[] args) {
		System.out.println(new Today(WeatherType.CLOUDY));
		System.out.println(new Today(WeatherType.FOGGY));
		System.out.println(new Today(WeatherType.FREEZING));
	}
	public interface WeatherType {
		String CLOUDY = "Cloudy";
		String FOGGY = "Foggy";
		String FREEZING = "Freezing";
	}
	public interface Weather {
		String getAkToWeatherType();
	}
	static class Today implements Weather{
		private String type;
		Today(String type) {
			this.type = type;
		}
		public String toString() {
			return String.format("Today it will be %s", this.getAkToWeatherType());
		}

		public String getAkToWeatherType() {
			return type;
		}
	}
}
/*
Есть класс Today. В нем нужно реализовать интерфейс Weather и метод getAkToWeatherType, объявленный в интерфейсе Weather.
Подумайте, как связан параметр type с методом getWeatherType(). Поскорее приступайте!
В классе Today реализовать интерфейс Weather.
Подумайте, как связан параметр type с методом getAkToWeatherType().
 */
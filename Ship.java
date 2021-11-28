import java.time.LocalDateTime;
public class Ship {

	private double minspeed;
	private double maxspeed;
	private double efficient;//most efficient speed for the boat(reduces emissions /all speeds are in knots
	private LocalDateTime arrival;
	private LocalDateTime departure;
	private double distance; //distance in km
	private double longitude;
	private double latitude;
	
	public Ship(double minspeed, double maxspeed, double efficient, LocalDateTime departure,LocalDateTime arrival, double distance, double longitude,double latitude) {
		this.minspeed = minspeed;
		this.maxspeed = maxspeed;
		this.efficient = efficient;
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.longitude = longitude;
		this.latitude = latitude;
	
	}
	
	public double GetTimeDifference() {

		int year = arrival.getYear()-departure.getYear();
		int month = arrival.getMonthValue() - departure.getMonthValue();
		int day = arrival.getDayOfMonth() - departure.getDayOfMonth();
		int hour= arrival.getHour()-departure.getHour();
		int minute = arrival.getMinute()-departure.getMinute();
		
		return year*8760 + month*730 + day*24 + hour + minute/60;
//math to get the difference in hours between the arrival and departure.
	}

	public double getMinspeed() {
		return minspeed;
	}

	public void setMinspeed(double minspeed) {
		this.minspeed = minspeed;
	}

	public double getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(double maxspeed) {
		this.maxspeed = maxspeed;
	}

	public double getEfficient() {
		return efficient;
	}

	public void setEfficient(double efficient) {
		this.efficient = efficient;
	}

	public LocalDateTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalDateTime arrival) {
		this.arrival = arrival;
	}

	public LocalDateTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalDateTime departure) {
		this.departure = departure;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	
	
	
}

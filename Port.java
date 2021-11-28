
public class Port {

	private int maxships;
	private double longitude;
	private double latitude;
	String name;
	
	public Port (int maxships, double longitude, double latitude, String name ) {
		this.maxships = maxships;
		this.longitude= longitude;
		this.latitude = latitude;
		this.name = name;
	}

	public int getMaxships() {
		return maxships;
	}

	public void setMaxships(int maxships) {
		this.maxships = maxships;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

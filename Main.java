import java.util.ArrayList;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ship> shiplist = new ArrayList<>();
		Port port = new Port(8,-1.6997222222222223, 53.31861111111111, "port1");
		
		Ship ship1 = new Ship(9, 24, 11, LocalDateTime.of(2021,5,14,5,40),LocalDateTime.of(2021,5,15,3,40), 0, -1.7297222222222221,  53.32055555555556);

		//System.out.println(ship1.GetTimeDifference());
	
		double difference = ship1.GetTimeDifference();
		double e= ship1.getEfficient() * 1.852;
		double max= ship1.getMaxspeed() * 1.852;
		double min= ship1.getMinspeed() * 1.852;
		//double distance = Distance(ship,port);//distance in km
		double distance = 416;//this is just an example
		double speed1 = 0;
		double speed2 = 0;
		double distance1;
		//the trip is a distance of (distance) kilometers and the time is (difference)
		for(int i=1;i<100;i++) {//i refers to the percentage of the trip done at most efficient speed
			distance1 = (double)i/100*difference*e;//distance covered in i percent of the trip
	
			double time1 = difference - ((double)i /100)*difference;//rest of the time needed to be covered
			
			double distance2 = distance - distance1;//rest of the distance needed
			
			if (distance2/time1 >= min && distance2/time1 <= max) {
				speed1 = (double)i;
				speed2 = distance2/time1;
			}

		}
		System.out.println("The best way is to use " + e / 1.852+ " knots for " + difference*(speed1/100) + " hours");
		System.out.println("And to use " + speed2 / 1.852 + " knots for " + ((100-speed1)/100)* difference + " hours");
		
		
		
	}
	public static double Distance(Ship ship,Port port){
		double lat1 = ship.getLatitude() / (180 / Math.PI);
		double lon1 = ship.getLongitude() / (180/Math.PI);
		
		double lat2 = port.getLatitude() / (180 / Math.PI);
		double lon2 = port.getLongitude() / (180/Math.PI);
		
		double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                 + Math.cos(lat1) * Math.cos(lat2)
                 * Math.pow(Math.sin(dlon / 2),2);
        
        double c = 2 * Math.asin(Math.sqrt(a));
        
        return(6371*c);
	}//calculates the distance between the ship and the port in kilometers

}

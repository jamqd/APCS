import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * 
 * @author John Dang 
 * period 3
 * 
 * Program to simulate road trip
 *
 */
public class RoadTrip {
	private ArrayList<GeoLocation> list = new ArrayList<GeoLocation>();

	/**
	 * Constructor reads in the geo locations from the given file and adds them
	 * to the list
	 * 
	 * @param fname
	 *            - file name
	 */
	public RoadTrip(String fname) {
		String name;
		double lat;
		double longt;
		try {
			Scanner io = new Scanner(new File(fname));
			while (io.hasNext()) {
				name = io.next();
				lat = io.nextDouble();
				longt = io.nextDouble();
				addStop(name, lat, longt);
			}
		} catch (FileNotFoundException f) {
			System.out.println(f.getMessage());
		}
	}

	/**
	 * Create a GeoLocation and add it to the road trip
	 * 
	 * @param name
	 *            - name of the geo location
	 * @param latitude
	 *            - latitude in degrees
	 * @param longitude
	 *            - longitude in degrees
	 */

	public void addStop(String name, double latitude, double longitude) {
		list.add(new GeoLocation(name, latitude, longitude));
	}

	/**
	 * Get the total number of stops in the trip
	 * 
	 * @return total number of stops
	 */
	public int getNumberOfStops() {
		return list.size();
	}

	/**
	 * Get the total miles of the trip
	 * 
	 * @return the total miles
	 */

	public double getTripLength() {
		Iterator i = list.iterator();
		double distance = 0;
		GeoLocation a = null;
		GeoLocation b = null;
		if (getNumberOfStops() % 2 == 0) {
			while (i.hasNext()) {
				a = (GeoLocation) i.next();
				if(b != null){
					distance += b.distanceFrom(a);
				}
				b = (GeoLocation) i.next();
				distance += a.distanceFrom(b);
			}
		} else {
			int count = getNumberOfStops();
			while (i.hasNext() && count != 1) {
				a = (GeoLocation) i.next();
				b = (GeoLocation) i.next();
				distance += a.distanceFrom(b);
				count -= 2;
			}
			distance += ((GeoLocation) i.next()).distanceFrom(b);
		}
		return distance;
	}

	/**
	 * Return a formatted toString of the trip
	 * 
	 * @return information about the trip
	 */

	public String toString() {
		String s = "";
		for (GeoLocation g : list) {
			s += g.toString() + "\n";
		}
		s += "Stops: " + getNumberOfStops() + "\n";
		s += "Total miles: " + getTripLength() + " miles" + "\n";
		return s;
	}
}

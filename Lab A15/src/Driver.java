
public class Driver {
	public static void main(String [] args){
		GeoLocation a = new GeoLocation("SF", 37.7833, -122.4167);
		GeoLocation b = new GeoLocation("LA", 34.052235, -118.243683);
		GeoLocation c = new GeoLocation("LV", 36.114647, -115.172813);
		System.out.println(a.distanceFrom(b) +b.distanceFrom(c));
		
	}
}
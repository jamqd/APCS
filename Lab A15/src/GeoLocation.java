/**
 * 
 * @author John Dang
 * period 3
 * 
 * Program to store information about location on Earth
 *
 */
/*
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 *
 * This implementation is based off of the example from Stuart Reges at 
 * the University of Washington.
 */

public class GeoLocation 
{
    // Earth radius in miles
    public static final double RADIUS = 3959;  //miles
    private double latitude;
    private double longitude;
    private String name;

    /**
     * Constructs a geo location object with given latitude and longitude
     * @param theName - name of this geo location
     * @param theLatitude - latitude in degrees
     * @param theLongitude - longitude in degrees
     */
    public GeoLocation(String theName, double theLatitude, double theLongitude) 
    {
        name =  theName;
        latitude = theLatitude;
        longitude = theLongitude;
    }

    /**
     * Returns the name of this geo location
     * @return name of this geo location
     */
    public String getName() 
    {
    	return name;
    }

    /**
     * Returns the latitude of this geo location
     * @return latitude of this geo location in degrees
     */
    public double getLatitude() 
    {
        return latitude;
    }

    /**
     * returns the longitude of this geo location
     * @return longitude of this geo location in degrees
     */
    public double getLongitude() 
    {
        return longitude;
    }

    /**
     * returns a string representation of this geo location
     * @returns the string representation
     */
    
    public String toString() 
    {
        return name + "(latitude: " + latitude + ", longitude: " + longitude + ")"; 
    }

    /**
     * returns the distance in miles between this geo location and the given other geo location
     * @param other - a geo location
     * @return distance between this geo location and other in miles
     */
    
    public double distanceFrom(GeoLocation other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.getLatitude());
        double long2 = Math.toRadians(other.getLongitude());
    	double theta = Math.sin(lat1)* Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1-long2);
    	double arcLength = Math.acos(theta);
    	double distance = arcLength * RADIUS;
        return distance;
    }
}

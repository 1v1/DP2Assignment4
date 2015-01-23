package it.polito.dp2.FDS.sol4.server;

import javax.xml.datatype.XMLGregorianCalendar;


public class FlightInstanceKey {
	
	private final String flightID;
	private final XMLGregorianCalendar departureDate;
	
	public FlightInstanceKey (String flightID, XMLGregorianCalendar departureDate)
	{
		this.departureDate = departureDate;
		this.flightID = flightID;
	}
	
	@Override
	public int hashCode()
	{
		final int prime1 = 31;
		final int prime2 = 2659;
		int hashcode = (departureDate.getDay() + departureDate.getMonth() +
				departureDate.getYear() + departureDate.getTimezone()) 
				* prime2 * (departureDate.toGregorianCalendar().getTimeZone().getRawOffset());
		int c1 = (int) flightID.charAt(0);
		int c2 = (int) flightID.charAt(1);
		String number = flightID.substring(2);
		int n = Integer.valueOf(number);
		
		hashcode=(hashcode+c1+c2+n)*prime1;
		
		return hashcode;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this==obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
            return false;
		
		FlightInstanceKey other = (FlightInstanceKey) obj;
		if  (!flightID.equals(other.flightID))
			return false;
		if (departureDate.getYear() != other.departureDate.getYear())
			return false;
		if (departureDate.getMonth() != other.departureDate.getMonth())
			return false;
		if (departureDate.getDay() != other.departureDate.getDay())
			return false;
		if (departureDate.toGregorianCalendar().getTimeZone().getRawOffset() !=
				other.departureDate.toGregorianCalendar().getTimeZone().getRawOffset())
			return false;
		return true;
	}

}

package org.wahlzeit.uav;

public interface Location {
	double getLatitude();
	void setLatitude(double latitude);
	
	double getLongtitude();
	void setLongtitude(double longtitude);
	
	void setMapcode(String mapcode);
	String getMapcode();
}
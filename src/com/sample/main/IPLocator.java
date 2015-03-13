/**
 * @autor pathmasri
 * Mar 13, 2015 2:02:55 AM
 */
package com.sample.main;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     
		 String ip = "2.50.77.175";
		 GeoIPService gis = new GeoIPService();
		 GeoIPServiceSoap gipsoap = gis.getGeoIPServiceSoap();
		 GeoIP gip = gipsoap.getGeoIP(ip);
		 System.out.println(gip.getCountryName());

	}

}

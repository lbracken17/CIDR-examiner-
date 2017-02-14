//This class takes two sets of CIDR blocks and compares them against each other

import java.util.*;
import java.lang.Object.*;
import java.net.UnknownHostException;
import SubnetUtils.java.*;
import CIDRUtils.java.*;

public class CIDR {
	
	private String cidr;
	
	public static boolean isCIDRFormat (String cidrString){
		// method used to check if given CIDR is a real CIDR block notation
		// use try block so program won't crash if exception occurs 
		try {
			// Use SubnetUtils class to confirm notation of CIDR
			SubnetUtils other = new SubnetUtils(cidrString);
			return true;
			
		}catch (IllegalArgumentException e){
			return false;
		}	
	}
	
	public static boolean isCIDR(String cidrString){
		// method used to check if CIDR is a real CIDR block
		try{
			//Use SubnetUtils class again to if matches a network address
			SubnetUtils other = new SubnetUtils(CIDR);
			SubnetUtils newOther = other.getInfor();
			return newOther.getAddress.equals(newOther.getNetworkAddress());
		} catch(IllegalArgumentException e){
			return false;
		}
	}
	
	
	public static CIDRUtils cidrToIP(String cidrString) throws UnknownHostException{
		// Calls on CIDRUtils class and converts the CIDR notation in to an IP
	    // address range

		CIDRUtils newCIDR = new CIDRUtils(cidrString); 
		
		return newCIDR;
	
	}
	
	
	public String compareCIDR (String cidrOne, String cidrTwo) throws UnknownHostException{
		// this function only compares one element from each of the two sets
		// here it will call on the other functions (intersecting, containing, adjacent, none)
		//if all the test are false then the degree of interaction is none 
		String degree = "none";
    
		if(containing(cidrOne, cidrTwo) || containing(cidrTwo, cidrOne)){
			
			degree = "containing";
		}
		if(intersecting(cidrOne, cidrTwo) || intersecting(cidrTwo, cidrOne)){
			
			degree = "intersecting";
		}
		if(adjacent(cidrOne, cidrTwo) || adjacent(cidrTwo, cidrOne)){
			
			degree = "adjacent";
		}
		
		return degree;
	}
	
	// Unable to finish this part: if worked properly, would compare the two CIDR blocks and return if contains, intersects, or adjacent
	
	public boolean intersecting(String cidrOne, String cidrTwo) throws UnknownHostException{
		// compare the two CDIR and check if they are intersecting,
		// if they are, return true
    
		CIDRUtils ipOne = cidrToIP(cidrOne);
		CIDRUtils ipTwo = cidrToIP(cidrTwo);
    
		return true;		
	}
	
	public boolean containing(String cidrOne, String cidrTwo) throws UnknownHostException{
		// compare the two CDIR and check if they are intersecting,
		// if they are, return true
		
		CIDRUtils ipOne = cidrToIP(cidrOne);
		CIDRUtils ipTwo = cidrToIP(cidrTwo);
	
		return true;
	}
		
	public boolean adjacent(String cidrOne, String cidrTwo) throws UnknownHostException{
		// compare the two CDIR and check if they are intersecting,
		// if they are, return true
		
		CIDRUtils ipOne = cidrToIP(cidrOne);
		CIDRUtils ipTwo = cidrToIP(cidrTwo);
		
		return true;
	}
	
}

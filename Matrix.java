import java.net.UnknownHostException;

// This class creates a matrix of the results from the CIDR.java
// The Martix is of strings describing the degree of interaction between two sets

 
public class Matrix {
	// assume you have n sets, the rows and columns will be the size of the biggest n set
	CIDR cidrMartix = new CIDR();
	
	 // pre: given two sets of CIDR 
	public String[][] cidrMatrix(String[] setOne, String[] setTwo) throws UnknownHostException{
		//for loop to compare the two sets that are type String[]
		// finds the max length between two sets for length of for loop
		String [][] matrix = new String [setOne.length][setTwo.length];
		int max = Math.max(setOne.length, setTwo.length);
		int min = Math.min(setOne.length, setTwo.length);
		int i;
		int j;
		// need a nested for loop to compare every element of each set against each other
		for(i = 0; i<max; i++ ){
			
			for(j=0; j<min; j++ ){
			matrix[i][j] = cidrMartix.compareCIDR(setOne[i], setTwo[j]);			
	}	
	}
		return matrix;
}
}

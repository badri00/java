package utils;

import java.util.Comparator;

import com.dac.cricketer.Cricketer;

public class CricketerSortByRating implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer o1, Cricketer o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)o1.getRating();
		Integer i2=(Integer)o2.getRating();
		return i1.compareTo(i2);
	}

	

	

	
	
	
	
	
}

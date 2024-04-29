package CricketerMain;

import java.util.Comparator;

import CricketerMethods.Cricketers;

public class SortbyRating implements Comparator<Cricketers> {

	@Override
	public int compare(Cricketers o1, Cricketers o2) {
		if(o1.getRating()>o2.getRating()) {
			return 1;
		}
		if(o1.getRating()==o2.getRating()) {
			return 0;
		}
		return -1;
	}

	
	
}

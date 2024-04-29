package CricketerMethods;

public class Cricketers implements Comparable<Cricketers>{
	String name;
	int age;
	String email_id;
	String Phone;
	int rating;
	
	public Cricketers(String name, int age, String email_id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		Phone = phone;
		this.rating = rating;
	}
	
	

	@Override
	public String toString() {
		return "Cricketers [name=" + name + ", age=" + age + ", email_id=" + email_id + ", Phone=" + Phone + ", rating="
				+ rating + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Character) {
			Cricketers c =(Cricketers)(obj);
			return obj.equals(c.email_id);
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}




	@Override
	public int compareTo(Cricketers o1) {
		if(this.rating>o1.getRating()) {
			return 1;
		}
		if(this.rating==o1.getRating()) {
			return 0;
		}
		return -1;
	}
	
	
}

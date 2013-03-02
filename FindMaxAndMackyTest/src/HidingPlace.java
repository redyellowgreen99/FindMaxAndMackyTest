
public class HidingPlace {

	String hider;
	String place;
	
	public HidingPlace(String place, String hider) {
		this.hider = hider;
		this.place = place;
	}
	
	public HidingPlace(String place) {
		this.place = place;
	}
	
	public static void main(String[] args) {

	}
	
	public String getName() {
		return place;
	}

	public String getHider() {
		return hider;
	}
}

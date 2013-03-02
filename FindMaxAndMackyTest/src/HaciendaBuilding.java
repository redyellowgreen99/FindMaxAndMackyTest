import java.util.ArrayList;


public class HaciendaBuilding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	HidingPlace[] HidingPlace = new HidingPlace[]{new HidingPlace("in the trash"), new HidingPlace("behind the trash"), new HidingPlace("in front of the trash")};
	
	public HidingPlace[] initializeOldSchoolArrayOfHidingPlaces() {
		return HidingPlace;
	}
	
	public ArrayList<HidingPlace> initializeArrayListOfHidingPlaces() {
		ArrayList<HidingPlace> HidingList = new ArrayList<HidingPlace>();
		HidingList.add(new HidingPlace("in the computer"));
		HidingList.add(new HidingPlace("in the other dimmension"));
		HidingList.add(new HidingPlace("in the void"));
		return HidingList;
	}
	
	public void setHidingPlaces(HidingPlace[] hidingPlace) {
		
	}

}

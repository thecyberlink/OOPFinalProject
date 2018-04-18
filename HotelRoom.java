/*
 * HotelRoom class
Fields:
Name is room number
String customer name
String roomType (single, double)
Boolean isReserved (customer makes reservation)
Boolean isVacant (customer checks in or out)
Double costPerNight
static Double roomServicePrice = 50
Boolean needsCleaning

Methods:
Constructor- roomNumber, roomType, 
If roomType = single { costPerNight = $100 } else = 150
Set isVacant =true
cleanRoom

 */
public class HotelRoom {
	//fields
	int roomNumber;
	String roomType;  //single, double, triple
//	boolean isReserved;
	boolean isVacant;
	double costPerNight;
	double roomServiceFee = 50;
	String customerName = "";

	
	//Constructor
	public HotelRoom(int num, String type){
		roomNumber = num;
		roomType = type;
		if (roomType.equals("single")) costPerNight = 100;
		else if (roomType.equals("double")) costPerNight = 150;
		else costPerNight = 200;
		isVacant= true;
	}
	
	//when a customer checks out
	public void cleanRoom(){
		System.out.println("Room "+ roomNumber+ " has been cleaned.");
	}
	
	public void DisplayInfo(){
		System.out.println("Room "+ this.roomNumber);
		System.out.println("Room type: "+ this.roomType);
		System.out.println("Cost per night: $"+this.costPerNight);
//		if (isVacant) System.out.println("Room is vacant.");
//		else System.out.println("Room is occupied.");
	}
	
public void toggleVacancy(){
		if(this.isVacant){
			isVacant= false;
			System.out.println("Room " +this.roomNumber+" is occupied.");
		} else{
			isVacant= true;
			System.out.println("Room " +this.roomNumber+" is vacant.");
		}
	}
	
}

package truong.exercise1000.e827;

import java.util.List;

import truong.exercise1000.e827.Data.E827DataTestBuilder;
import truong.exercise1000.e827.model.HotelRoom;
import truong.exercise1000.e827.service.E827Service;

public class E827App {
	public static void main(String[] args) {
		List<HotelRoom> listHotelRoom = E827DataTestBuilder.getListHotelRoom();
		E827Service service = new E827Service();
		
		System.out.println("List room has status is free");
		System.out.println("==================================");
		service.printList(service.listFreeHotelRoom(listHotelRoom));
		System.out.println("Total bed int list room");
		System.out.println("==================================");
		System.out.println(service.amountOfBedInList(listHotelRoom));
		System.out.println("Sort list hotel room by room rate");
		System.out.println("==================================");
		service.printList(service.sortListHotelRoomByRoomRate(listHotelRoom));
	}
}

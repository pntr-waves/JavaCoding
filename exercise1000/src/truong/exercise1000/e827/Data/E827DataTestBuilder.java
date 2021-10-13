package truong.exercise1000.e827.Data;

import java.util.ArrayList;
import java.util.List;

import truong.exercise1000.e827.constant.RoomStatus;
import truong.exercise1000.e827.model.HotelRoom;

public class E827DataTestBuilder {
	public static List<HotelRoom> getListHotelRoom() {
		List<HotelRoom> listHotelRoom = new ArrayList<>();
		listHotelRoom.add(new HotelRoom("36800-685", "p51", 524, 2, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("0268-0819", "p32", 319, 1, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("49349-003", "p26", 463, 2, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("13537-372", "p70", 131, 4, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("37808-294", "p64", 565, 3, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("41520-410", "p54", 639, 3, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("55714-2328", "p27", 368, 1, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("66336-663", "p28", 769, 2, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("10893-908", "p61", 575, 2, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("52993-110", "p89", 872, 1, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("53329-640", "p74", 190, 4, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("53808-0258", "p59", 937, 1, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("55111-397", "p68", 972, 4, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("37000-083", "p100", 322, 1, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("21695-667", "p47", 865, 3, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("49708-102", "p22", 490, 4, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("68084-214", "p2", 848, 4, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("58411-235", "p86", 506, 4, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("41167-0940", "p66", 587, 2, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("0591-0149", "p60", 596, 4, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("10742-1538", "p83", 154, 1, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("52959-556", "p80", 880, 1, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("0007-4142", "p32", 751, 4, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("0378-1803", "p66", 523, 2, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("65862-168", "p96", 205, 4, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("67296-0642", "p82", 818, 1, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("60505-1329", "p24", 346, 4, RoomStatus.FREE));
		listHotelRoom.add(new HotelRoom("35356-744", "p48", 732, 3, RoomStatus.USED));
		listHotelRoom.add(new HotelRoom("0781-3315", "p26", 806, 2, RoomStatus.FREE));

		return listHotelRoom;
	}
}

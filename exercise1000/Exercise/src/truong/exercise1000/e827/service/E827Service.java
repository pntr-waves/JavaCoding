package truong.exercise1000.e827.service;

import java.util.ArrayList;
import java.util.List;

import truong.exercise1000.e827.model.HotelRoom;

public class E827Service {
	public List<HotelRoom> listFreeHotelRoom(List<HotelRoom> listHotelRoom) {
		List<HotelRoom> listResult = new ArrayList<>();
		for (HotelRoom hr : listHotelRoom) {
			if (hr.getRoomStatus().isFree() == true) {
				listResult.add(hr);
			}
		}
		return listResult;
	}

	public int amountOfBedInList(List<HotelRoom> listHotelRoom) {
		int amount = 0;
		for (HotelRoom hr : listHotelRoom) {
			amount += hr.getNumberBed();
		}

		return amount;
	}

	public List<HotelRoom> sortListHotelRoomByRoomRate(List<HotelRoom> listHotelRoom) {
		for (int i = 0; i < listHotelRoom.size(); i++) {
			for (int j = 0; j < listHotelRoom.size() - 1 - i; j++) {
				if (listHotelRoom.get(j).getRoomRate() > listHotelRoom.get(j + 1).getRoomRate()) {
					HotelRoom temp = listHotelRoom.get(j);
					listHotelRoom.set(j, listHotelRoom.get(j + 1));
					listHotelRoom.set(j + 1, temp);
				}
			}
		}

		return listHotelRoom;
	}

	public void printList(List<HotelRoom> listHotelRoom) {
		for (HotelRoom hr : listHotelRoom) {
			System.out.println(String.format("RoomCode: %s, Name: %s, Rate: %f, Bed: %d, Status: %s", hr.getRoomCode(),
					hr.getRoomName(), hr.getRoomRate(), hr.getNumberBed(), hr.getRoomStatus().getStatus()));
		}
	}
}

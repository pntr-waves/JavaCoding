package truong.exercise1000.e827.model;

import truong.exercise1000.e827.constant.RoomStatus;

public class HotelRoom {
	private String roomCode;
	private String roomName;
	private double roomRate;
	private int numberBed;
	private RoomStatus roomStatus;

	public HotelRoom(String roomCode, String roomName, double roomRate, int numberBed, RoomStatus roomStatus) {
		this.roomCode = roomCode;
		this.roomName = roomName;
		this.roomRate = roomRate;
		this.numberBed = numberBed;
		this.roomStatus = roomStatus;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public double getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(double roomRate) {
		this.roomRate = roomRate;
	}

	public int getNumberBed() {
		return numberBed;
	}

	public void setNumberBed(int numberBed) {
		this.numberBed = numberBed;
	}

	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}
}

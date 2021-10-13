package truong.exercise1000.e827.constant;

public enum RoomStatus {
	FREE("free", true), USED("used", false);

	private String status;
	private boolean value;

	RoomStatus(String status, boolean value) {
		this.setStatus(status);
		this.setValue(value);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isFree() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}
}

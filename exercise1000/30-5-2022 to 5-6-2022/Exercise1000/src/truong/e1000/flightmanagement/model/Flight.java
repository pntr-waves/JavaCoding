package truong.e1000.flightmanagement.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Flight {
    private String flightCode;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private String to;
    private String from;

    public Flight(String flightCode, String flightTime, String flightDate, String to, String from) {
        this.flightCode = flightCode;
        this.flightTime = LocalTime.parse(flightTime, DateTimeFormatter.ofPattern("HH:mm"));
        this.flightDate = LocalDate.parse(flightDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.to = to;
        this.from = from;

    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public LocalTime getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(LocalTime flightTime) {
        this.flightTime = flightTime;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}

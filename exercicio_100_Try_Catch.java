package linguagemDeProgramação;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class exercicio_100_Try_Catch {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	public exercicio_100_Try_Catch(Integer roomNumber, Date chekIn, Date chekcOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getChekIn() {
		return checkIn;
	}
	public Date getChekcOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date CheckOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room"
		     + roomNumber
		     + ", check-in"
		     + sdf.format(checkIn)
		     + ", check-out"
		     + sdf.format(checkOut)
		     + ", "
		     + duration()
		     + " nights.";
		
	}

}

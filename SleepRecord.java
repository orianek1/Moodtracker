import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 
 */

/**
 * @author Oriane
 *
 */
public class SleepRecord {
	int sleepFromUser;
	LocalTime startTime;
	
	public SleepRecord()
	{
		this.startTime = LocalTime.now();
		
	}
	
	
	
	
	/**
	 * @param sleepFromUser
	 */
	public SleepRecord(int sleepFromUser) {
		super();
		this.sleepFromUser = sleepFromUser;
	}



	/**
	 * @param sleepFromUser
	 * @param startDateTime
	 */
	public SleepRecord(int sleepFromUser, LocalDateTime startDateTime) {
		super();
		this.sleepFromUser = sleepFromUser;
		this.startTime = startTime;
	}
	
	public SleepRecord(SleepRecord oldRecord)
	{
		this.sleepFromUser = oldRecord.sleepFromUser;
		this.startTime = oldRecord.startTime;
	}




	/**
	 * @return the sleepFromUser
	 */
	public int getSleepFromUser() {
		return sleepFromUser;
	}




	/**
	 * @param sleepFromUser the sleepFromUser to set
	 */
	public void setSleepFromUser(int sleepFromUser) {
		
		// it should pick from a set of categories
		
		if (sleepFromUser >= 0 && sleepFromUser > 4)  
		{
			System.out.println("Invalid Input, please choose a number from 1 to 4");
					
		}
		else 
		{
					
			System.out.println("Your choice =" +sleepFromUser);
		}
				
			this.sleepFromUser = sleepFromUser;
	}




	/**
	 * @return the startDateTime
	 */
	public LocalTime getStartTime() {
		return startTime;
	}




	/**
	 * @param startDateTime the startDateTime to set
	 */
	public void setStartDateTime(LocalDateTime startDateTime) {
		
		//dates here or in the past
		if (startDateTime.isAfter(LocalDateTime.now()))
		{
			this.startTime = LocalTime.now();
		}
		else
		{
			this.startTime = startTime;
		}
		
		
	}
	
	
	

}

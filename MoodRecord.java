import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 * 
 *This class stores all the mood records
 *It tracks the record for the mood for a day. So the date and the mood level
/**
 * @author Oriane
 *
 */
public class MoodRecord {
	int moodFromUser;
	LocalTime startTime;
	
	public MoodRecord()
	{
		this.startTime = LocalTime.now();
		
	}
	
	/**
	 * @param moodFromUser
	 */
	public MoodRecord(int moodFromUser) {
		super();
		this.moodFromUser = moodFromUser;
		this.startTime = LocalTime.now();
	}

	/**
	 * @param moodFromUser
	 * @param startDateTime
	 */
	public MoodRecord(int moodFromUser, LocalDateTime startDateTime) {
		super();
		this.moodFromUser = moodFromUser;
		this.startTime = startTime;
	}
	
	
	// Copy of Constructor
	public MoodRecord(MoodRecord oldRecord)
	{
		this.moodFromUser = oldRecord.moodFromUser;
		this.startTime = oldRecord.startTime;
	}
	

	public int getMoodFromUser() 
	{
		return moodFromUser;
	}

	public void setMoodFromUser(int moodFromUser) {
		// it should pick from a set of categories
		
		if (moodFromUser >= 0 && moodFromUser > 10)  {
			System.out.println("Invalid Input, please choose a number from 1 to 10");
			
		}else {
			
			System.out.println("Your choice =" +moodFromUser);
		}
		
		
		this.moodFromUser = moodFromUser;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

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
	
	public String toString()
	{
		String output = "";
		output = Integer.toString(moodFromUser) +' ' + startTime.toString();
		
		return output;
	}
	
	

}

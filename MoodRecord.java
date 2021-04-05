import java.time.LocalDateTime;
/**
 * 
 *This class stores all the mood records
 *
/**
 * @author Oriane
 *
 */
public class MoodRecord {
	int moodFromUser;
	LocalDateTime startDateTime;
	
	public MoodRecord()
	{
		this.startDateTime = LocalDateTime.now();
		
	}
	
	/**
	 * @param moodFromUser
	 */
	public MoodRecord(int moodFromUser) {
		super();
		this.moodFromUser = moodFromUser;
		this.startDateTime = LocalDateTime.now();
	}

	/**
	 * @param moodFromUser
	 * @param startDateTime
	 */
	public MoodRecord(int moodFromUser, LocalDateTime startDateTime) {
		super();
		this.moodFromUser = moodFromUser;
		this.startDateTime = startDateTime;
	}
	
	public MoodRecord(MoodRecord oldRecord)
	{
		this.moodFromUser = oldRecord.moodFromUser;
		this.startDateTime = oldRecord.startDateTime;
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

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		//dates here or in the past
		if (startDateTime.isAfter(LocalDateTime.now()))
		{
			this.startDateTime = LocalDateTime.now();
		}
		else
		{
			this.startDateTime = startDateTime;
		}
		
	}
	
	
	
	

}

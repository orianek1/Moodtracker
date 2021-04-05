import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 
 *
 *
 *This class stores all the records for a given day for a single user
/**
 * @author Oriane
 *
 */
public class DayEntry {
	
	//private int moodFromUser;
	
	private int sleepFromUser;
	private String journalEntry;
	
	ArrayList<MoodRecord> dayMoodRecord;
	//ArrayList<SleepRecord> daySleepRecord;
	LocalDate dateofMood;
	

	/**
	 * @param moodFromUser
	 * @param sleepFromUser
	 * @param journalEntry
	 * @param dateofMood
	 */
	public DayEntry(int sleepFromUser, String journalEntry, LocalDate dateofMood) 
	{
		super();
		//this.moodFromUser = moodFromUser;
		this.sleepFromUser = sleepFromUser;
		this.journalEntry = journalEntry;
		this.dateofMood = dateofMood;
	}



	/**
	 * @param dayRecord
	 */
	public DayEntry(ArrayList<MoodRecord> dayMoodRecord) {
		//super();
		this.dayMoodRecord = new ArrayList <MoodRecord> ();
		
		for (MoodRecord wr: dayMoodRecord)
		{
			this.dayMoodRecord.add(new MoodRecord (wr));
		}
	}
	
	


	//Copy of constructor
	
	public DayEntry( DayEntry toCopy)
	{
		super();
		 
		this.dateofMood = toCopy.dateofMood;
		this.sleepFromUser = toCopy.sleepFromUser;
		this.journalEntry = toCopy.journalEntry;
	    this.dayMoodRecord = new ArrayList<MoodRecord>();
		
		for (MoodRecord wr: toCopy.dayMoodRecord)
		{
			this.dayMoodRecord.add(new MoodRecord(wr));
		}
	}
	//}

	public void addREcord(MoodRecord session)
	{
		dayMoodRecord.add( new MoodRecord (session));
	}
	
	public void addRecord(String journalEntry, int moodFromUser, LocalDateTime startDatetime)
	{
		dayRecord.add(new MoodRecord(moodFromUser, startDateTime));
	}
	
	
	
	//TODO
	/**
	 * @return the dayRecord
	 */
	public ArrayList<MoodRecord> getDayRecord() 
	{
		ArrayList<MoodRecord> recordClone = new ArrayList<MoodRecord>();
		
		for (MoodRecord wr: dayMoodRecord)
		{
			recordClone.add(new MoodRecord (wr) );
		}
			
		return recordClone;
	}

	/**
	 * @param dayRecord the dayRecord to set
	 */
	//public void setDayRecord(ArrayList<MoodRecord> dayRecord) {
	//	this.dayMoodRecord = dayRecord;
	/**
	 * @param moodFromUser
	 * @param sleepFromUser
	 * @param journalEntry
	 * @param dateofMood
	 */
	

	

	/**
	 * @return the dateofMood
	 */
	public LocalDate getDateofMood() {
		return dateofMood;
	}

	/**
	 * @param dateofMood the dateofMood to set
	 */
	public void setDateofMood(LocalDate dateofMood) {
		this.dateofMood = dateofMood;
	}


	

	/**
	 * @return the moodFromUser
	 */
	//public int getMoodFromUser() {
		//return moodFromUser;
	//}



	/**
	 * @param moodFromUser the moodFromUser to set
	 */
	//public void setMoodFromUser(int moodFromUser) {
		//this.moodFromUser = moodFromUser;
	//}



	/**
	 * @return the dayMoodRecord
	 */
	public ArrayList<MoodRecord> getDayMoodRecord() {
		return dayMoodRecord;
	}



	/**
	 * @param dayMoodRecord the dayMoodRecord to set
	 */
	public void setDayMoodRecord(ArrayList<MoodRecord> dayMoodRecord) {
		this.dayMoodRecord = dayMoodRecord;
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
		this.sleepFromUser = sleepFromUser;
	}



	/**
	 * @return the journalEntry
	 */
	public String getJournalEntry() {
		return journalEntry;
	}



	/**
	 * @param journalEntry the journalEntry to set
	 */
	public void setJournalEntry(String journalEntry) {
		this.journalEntry = journalEntry;
	}
	
	
	
	
	
}

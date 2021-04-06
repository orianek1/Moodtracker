import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDateTime;

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
	
	private int sleepFromUser;
	private String journalEntry;
	private int moodFromUser;
	//ArrayList<MoodRecord> dayRecord;
	ArrayList<Record> dayRecords;
	LocalDate dateofMood;



	/**
	 * @param moodFromUser
	 * @param sleepFromUser
	 * @param journalEntry
	 * @param dateofMood
	 */
	
	public DayEntry(int sleepFromUser, String journalEntry, int moodFromUser, LocalDate dateofMood) 
	{
		super();
		this.moodFromUser = moodFromUser;
		this.sleepFromUser = sleepFromUser;
		this.journalEntry = journalEntry;
		this.dateofMood = dateofMood;
		dayRecords = new ArrayList<Record>();
	}



	/**
	 * @param dayRecords
	 */
	//public DayEntry(ArrayList<Record> dayRecords) 
	//{
		//super();
		//this.dayRecords = new ArrayList <Record> ();
		
		//for (Record r: dayRecords)
		//{
			//this.dayRecords.add(new Record(r));
		//}
	//}


	//Copy of constructor
	
	public DayEntry( DayEntry toCopy)
	{
		super();
		 
		this.moodFromUser= toCopy.moodFromUser;
		this.dateofMood = toCopy.dateofMood;
		this.sleepFromUser = toCopy.sleepFromUser;
		this.journalEntry = toCopy.journalEntry;
	    //this.dayRecords = new ArrayList<Record>();
		
		//for (Record r: toCopy.dayRecords)
		//{
			//this.dayRecords.add(new Record(r));
		//}
	}
	//}

	//public void addRecord(MoodRecord session, SleepRecord session )
	//{
		//dayRecord.add( (new MoodRecord, (session)), (new SleepRecord (session)));
	//}
	
	
	
	
	//public void addRecord(int moodFromUser, LocalDate startDateTime)
	//{
		//dayRecord.add(new MoodRecord(moodFromUser, startDateTime));
	//}
	
	
	
	

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
	

	

	public DayEntry(LocalDate now) {
		// TODO Auto-generated constructor stub
	}



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
	public int getMoodFromUser() {
		return moodFromUser;
	}



	/**
	 * @param moodFromUser the moodFromUser to set
	 */
	public void setMoodFromUser(int moodFromUser) {
		
	    this.moodFromUser = moodFromUser;
	}
	
	//TODO
	/**
	* @return the dayRecord
	*/
	//public ArrayList<MoodRecord> getDayRecord() 
	//{
		//ArrayList<MoodRecord> recordClone = new ArrayList<MoodRecord>();
			
		//for (MoodRecord wr: dayRecord)
		//{
			//recordClone.add(new MoodRecord (wr) );
		//}
				
		//return recordClone;
		//}

	/**
	 * @param dayMoodRecord the dayMoodRecord to set
	 */
	//public void setDayRecord(ArrayList<MoodRecord> dayRecord) {
		//this.dayRecord = dayRecord;
	//}



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



	public void addRecord(int moodFromUser2, int sleepFromUser2, String journalEntry2, LocalDateTime startDateTime) {
		// TODO Auto-generated method stub
		
	}
	public String toString()
	{
		String output = "";
		output.concat(dateofMood.toString() + ": ");
		
		if (!dayRecords.isEmpty())
		{
			for (Record r: dayRecords)
			{
				
			  output.concat(r.toString());
			    output.concat(",");
		   }
		
	}
		return output;
	}



	//public void addRecord(int moodFromUser, int sleepFromUser, String journalEntry, LocalDateTime startDateTime) 
	//{
		// TODO Auto-generated method stub
		//dayRecords.add(moodFromUser,sleepFromUser,journalEntry,startDateTime);
	//}
	
	
	
	
	
}

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 
 */

/**
 * @author Oriane
 *
 */
public class JournalRecord {
	String journalEntry;
    LocalTime startTime;
	
	public JournalRecord()
	{
		this.startTime = LocalTime.now();
		
	}

	/**
	 * @param journalEntry
	 */
	public JournalRecord(String journalEntry) {
		super();
		this.journalEntry = journalEntry;
		this.startTime = LocalTime.now();
	}

	/**
	 * @param journalEntry
	 * @param startDateTime
	 */
	public JournalRecord(String journalEntry, LocalDateTime startDateTime) {
		super();
		this.journalEntry = journalEntry;
		this.startTime = startTime;
	}
	
	public JournalRecord(JournalRecord oldRecord)
	{
		this.journalEntry = oldRecord.journalEntry;
		this.startTime = oldRecord.startTime;
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



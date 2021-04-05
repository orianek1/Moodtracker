import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author Oriane
 *
 */
public class JournalRecord {
	String journalEntry;
    LocalDateTime startDateTime;
	
	public JournalRecord()
	{
		this.startDateTime = LocalDateTime.now();
		
	}

	/**
	 * @param journalEntry
	 */
	public JournalRecord(String journalEntry) {
		super();
		this.journalEntry = journalEntry;
	}

	/**
	 * @param journalEntry
	 * @param startDateTime
	 */
	public JournalRecord(String journalEntry, LocalDateTime startDateTime) {
		super();
		this.journalEntry = journalEntry;
		this.startDateTime = startDateTime;
	}
	
	public JournalRecord(JournalRecord oldRecord)
	{
		this.journalEntry = oldRecord.journalEntry;
		this.startDateTime = oldRecord.startDateTime;
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
	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	/**
	 * @param startDateTime the startDateTime to set
	 */
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



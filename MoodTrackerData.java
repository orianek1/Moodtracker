import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @class MoodTrackerData
 * 
 * Store all the data for all days
 * - figure which day
 * -store data appropriately
 * 
 * @author Oriane
 *
 */
public class MoodTrackerData {
	ArrayList<DayEntry> totalData;
	
	public MoodTrackerData() 
	{
		totalData = new ArrayList<DayEntry>();
		DayEntry today = new DayEntry (LocalDate.now());
		totalData.add(today);
		
	}
	
	
	//We assume that the record is for today
	
	public void addData(int moodFromUser,int sleepFromUser, String journalEntry, LocalDateTime startDateTime) 
	{
		for(DayEntry de: totalData)
		{
			if(de.getDateofMood().equals(LocalDate.now()))
			{
				de.addRecord(moodFromUser,sleepFromUser,journalEntry,startDateTime);
				return;
			}
		}
		DayEntry today = new DayEntry(LocalDate.now());
		today.addRecord(moodFromUser, sleepFromUser, journalEntry, startDateTime);
		totalData.add(today);
		
	}

	public String toString()
	{
		String output = "abc";
		output.concat(Integer.toString(totalData.size()));
		for (DayEntry de: totalData)
        {
			//System.out.println("Hello world");
			output.concat(de.toString());
			output.concat("\n");
		}
		return output;
	}

}

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.List;


public class MoodTrackerOld 
{
	private String userName;
	
	//int userAge;
	
	private int moodFromUser;
	private int sleepFromUser;
	private String journalEntry;
	private int totalMood;
	private int totalSleep;
	ArrayList <DayEntry> userRecord;
	ArrayList<MoodRecord> userMoodRecords;
	//ArrayList<SleepRecord> userSleepRecords;
	
	
	/**
	 * @method MoodTracker
	 * @param none
	 * Constructor for the class. IT has some default values
	 * 
	 * 
	 */
	
	
	public MoodTrackerOld()
	{
		userName = "Oriane";
		userRecord = new ArrayList <DayEntry>();
	//    userAge = 22;	
		userMoodRecords = new ArrayList <MoodRecord> (); // to store all the user input
		//userSleepRecords = new ArrayList <SleepRecord> ();
	}
	
	
	/**
	 * @param userName
	 */
	public MoodTrackerOld(String userName, int userAge) {
		//super();
		this.userName = userName;
		userAge = 22;	
		userRecord = new ArrayList <DayEntry>();
		//userSleepRecords = new ArrayList <SleepRecord>();
	}

	
	//list for tracking inputs
	
			


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//set up
		//this is a constructor to take input from the user
		MoodTrackerOld myTracker = new MoodTrackerOld();
		Scanner mySc = new Scanner(System.in);
		
		
		//TODO: break into method
		//information about the user
		//takes the name of the user
		System.out.println ("Enter your name");
		myTracker.setUserName(mySc.nextLine());    // this function reads the name of user
		System.out.println(myTracker.getUserName());


		
		//while user has more inputs
		boolean isDone = false;
		while(!isDone) 
		{
			String NO_FLAG = "no";
			System.out.println("Do you have additional input?");
			String userFlag = mySc.nextLine();
			
			if (userFlag.equals(NO_FLAG))
			{
				isDone = true;
				break;
			}
			else
			{
				//getting details about the mood 
				System.out.println ("How is your mood today?");
				System.out.println("1 = excited,2= upbeat, 3= calm, 4= bored, 5=controlled, 6=relaxed, 7=distressed, 8= annoyed, 9=frustated 10= angry");
				//int moodMeasure = myTracker.getMoodMeasures(mySc.nextLine());
				int moodFromUserRaw = myTracker.getMoodFeels(mySc.nextLine());

				//NEW mood RECORD
				MoodRecord sessionMood = new MoodRecord(moodFromUserRaw);
				myTracker.addSession(sessionMood);
				System.out.println("Your mood =" +sessionMood.getMoodFromUser());
				
				//Sleeping
				System.out.println ("How was your sleep?");
				System.out.println ("1 = sleep early, 2= goood sleep, 3= medium sleep, 4=bad sleep");
				int sleepFromUserRaw = myTracker.getSleepFeels(mySc.nextLine());
				
				//NEW sleep RECORD
				SleepRecord sessionSleep = new SleepRecord(sleepFromUserRaw);
			    //myTracker.addSession(sessionSleep);
				
				System. out.println("Your sleep =" +sessionSleep.getSleepFromUser());
				
				//Journal Entries
				System.out.println ("Write entries in your journal");
				String journalEntryRaw = myTracker.checkjournalEntry( mySc.nextLine());
				
				//NEW journal RECORD
				JournalRecord sessionJournal = new JournalRecord(journalEntryRaw);
				
				System.out.println("You wrote in your journal =" +sessionJournal.getJournalEntry());
				
				
			}
			
			//System.out.println(total/moodList.size());
			System.out.println("the Average mood " + myTracker.getAverageMood());
			//inputNextDay = mySc.nextInt();
			
			
			
		}

		mySc.close();
		
		
		}
	
	
 
    //private String getJournalEntry(String nextLine) {
		// TODO Auto-generated method stub
		//return journalEntry;
	//}


// This is the method  

    public int getMoodFeels(String userInput) 
    //This method check the number inputed by the user. 
    {
    	int moodFromUser = Integer.parseInt(userInput);
    	if (moodFromUser  >= 0 && moodFromUser > 10)  
    	{
			System.out.println("Invalid Input, please choose a number from 1 to 10");
    	}
		
		return moodFromUser;
	}
    
    // this is to add the record input into the list
    
    private void addSession (MoodRecord sessionMood) 
    {
    	userMoodRecords.add(sessionMood);
    }
    
    //TODO
    // to calculate the average of mood
    private int getAverageMood() 
    {
    	int totalMood = 0;
    	
    	for (MoodRecord AvgRecord : userMoodRecords) 
    	{
    		totalMood += AvgRecord.getMoodFromUser();
    	}
    	
    	return (totalMood/userMoodRecords.size());		
    }
    
    
    
    public int getSleepFeels(String userInput) 
    {
    	int sleepFromUser = Integer.parseInt(userInput);
    	if (sleepFromUser  >= 0 && sleepFromUser > 4)  
    	{
			System.out.println("Invalid Input, please choose a number from 1 to 4");
    	}
		
		return sleepFromUser;
	}
    
    public String checkjournalEntry(String inputType)
	   {
		   String journalEntry = "my name is";
		   if (!inputType.isBlank())
			{ 
				journalEntry = inputType.toLowerCase();
				
			}
		   
		   return journalEntry;
	   }

    
    
   // private void addSession(SleepRecord sessionSleep) {
		// TODO Auto-generated method stub
		
	//}

    
   // private void addSession (SleepRecord sessionSleep) 
   //{
    	//userSleepRecords.add(sessionSleep);
  // }


// setters and getters 
// the this is if the user wants to change his name only 
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		//check validity of input
		this.userName = userName;
	}


	/**
	 * @param string 
	 * @return the journalEntry
	 */
	public String getJournalEntry() {
		//String journalEntry = String.valueOf(userInput);
		return journalEntry;
	}


	/**
	 * @param journalEntry the journalEntry to set
	 */
	public void setJournalEntry(String journalEntry) {
		this.journalEntry = journalEntry;
	}


	//public int getUserAge() {
	//	return userAge;
	//}


	//public void setAgeUser(int userAge) {
	//	this.userAge = userAge;
	//}

		//TODO: fix to record session into a day
	//private void addDAy(LocalDate dayToAdd) {
		//userRecord.add(new DayEntry(dayToAdd));
	//}
		

}




















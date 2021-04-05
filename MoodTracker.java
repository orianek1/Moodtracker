import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class MoodTracker 
{
	private String userName;
	
	//int userAge;
	
	int moodFromUser;
	int sleepFromUser;
	String journalEntry;
	int totalMood;
	int totalSleep;
	ArrayList<MoodRecord> userMoodRecords;
	//ArrayList<SleepRecord> userSleepRecords;
	
	
	public MoodTracker()
	{
		userName = "Oriane";
	//    userAge = 22;	
		userMoodRecords = new ArrayList <MoodRecord> (); // to store all the user input
		//userSleepRecords = new ArrayList <SleepRecord> ();
	}
	
	
	/**
	 * @param userName
	 */
	public MoodTracker(String userName, int userAge) {
		//super();
		this.userName = userName;
		userAge = 22;	
		userMoodRecords = new ArrayList <MoodRecord>();
		//userSleepRecords = new ArrayList <SleepRecord>();
	}

	
	//list for tracking inputs
	
			


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//set up
		//this is a constructor to take input from the user
		MoodTracker myTracker = new MoodTracker();
		Scanner mySc = new Scanner(System.in);
		
		
		//TODO: break into method
		//information about the user
		//takes the name of the user
		System.out.println ("Enter your name");
		myTracker.setUserName(mySc.nextLine());    // this function reads the name of user
		System.out.println(myTracker.getUserName());


		//System.out.println (" How old are you");
		//myTracker.setUserAge( mySc.nextInt());
		//System.out.println (myTracker.getUserAge());



		//System.out.println ("Where do you work");
		//String student = mySc.nextLine();
		//System.out.println("Your Work:" +student);


		//INFO TO TRACK ON THE APP

		//date of entry

		//To Loop



		//creating an empty list to store moods
		//List<Integer> moodList = new ArrayList<Integer>();
        
		
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
				
				//sleeping
				System.out.println ("How was your sleep?");
				System.out.println ("1 = sleep early, 2= goood sleep, 3= medium sleep, 4=bad sleep");
				int sleepFromUserRaw = myTracker.getSleepFeels(mySc.nextLine());
				
				//NEW sleep RECORD
				SleepRecord sessionSleep = new SleepRecord(sleepFromUserRaw);
				myTracker.addSession(sessionSleep);
				
				
				
				//Journal Entries
				System.out.println ("Write entries in your journal");
				String journalEntryRaw = mySc.nextLine();
				
				//NEW journal RECORD
				


				
				
			}
			
			
			//if (moodMeasure >= 0 && moodMeasure > 10)  {
			//System.out.println("Invalid Input, please choose a number from 1 to 10");

			//}else {
			//	moodList.add(moodMeasure);
			//	System.out.println("Your choice =" +moodMeasure);
			//}

			// new mood record


			
			
			//System.out.println(total/moodList.size());
			System.out.println("the Average mood " + myTracker.getAverageMood());
			//inputNextDay = mySc.nextInt();
			
			
			
			
			
			
			
			
		}

		//DETAILS ABOUT MOOD
		//https://stackoverflow.com/questions/19129416/checking-ifa-users-input-is-in-range-and-is-an-integer-java
		//this code ask for the user mood rate
		
		

		//Daily journal entry

		//boolean isDone = false;
		//while (!isDone) {
		//String NO_FLAG = "n";
		//System.out.println("Add to your journal Entry");
		//String userFlag = mySc.nextLine();

		//if (userFlag.equals(NO_FLAG)) {
		//isDone = true;

		//}else {
		//	break;
		//}}



		//}


		// calculate mood average
		//public int averageMood( List <Integer> moodList) {
		//if (moodList == null || moodList.isEmpty()) {
		//	System.out.println( 0);
		//}

		//int total = 0;

		//for (int Avg: moodList ) {

		//	total += Avg;

		//}
		mySc.close();
		
		
		}
		
	//}
	

		
		
	
	
 
// This is the method to 

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
    
    //private void addSession (SleepRecord sessionSleep) 
   // {
    	//userSleepRecords.add(sessionSleep);
    //}


// setters and getters 
// the this is if the user wants to change his name only 
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		//check validity of input
		this.userName = userName;
	}


	//public int getUserAge() {
	//	return userAge;
	//}


	//public void setAgeUser(int userAge) {
	//	this.userAge = userAge;
	//}

		
	
		

}




















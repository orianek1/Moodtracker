/**
 * 
 */

/**
 * @author Oriane
 * 
 * Text based interface for our app
 * Ot will hold the scanner and move data into the tracker data
 *
 */
public class MoodTracker {
	
	private MoodTrackerData appData;
	
	public MoodTracker()
	{
		appData = new MoodTrackerData();
	}
	
	public void printAllData()
	{
		System.out.println(appData);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoodTracker myTracker = new MoodTracker();
		
		myTracker.printAllData();

	}
	
	

}

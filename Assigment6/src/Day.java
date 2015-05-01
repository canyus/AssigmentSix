/**
 * 
 * @author sefacanagirbasli
 * CSC 200 - Assignment 6
 *
 */
public class Day {
	private String day;
	
	private String [] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
	/**
	 * Initialize to Monday
	 */
		public Day() {
			this.day = "monday" ;
	}
		public Day(String day) {
			super();
			this.day = day;
	}
		/**
		 * get the current day
		 * @return current day
		 */
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 *  To get the next day ((Day Index + 1)%7)
	 * @return next day 
	 */
	public String nextDay() {
		return calculateDay(1);
	}
	/**
	 *  To get the previous day ((Day Index + 6)%7)
	 * @return previous day
	 */
	public String previousDay() {
	return calculateDay(6);
	}
	/**
	 * To jump "x" (3,6,15 etc.) days together.
	 * @param jumpFront
	 * @return x days after the current day.
	 */
	public String calculateDay(int jumpFront) {
		String message = "";
		int dayIndex = getDayIndex(this.day);
		if(dayIndex!=-1) {
			message = days[(dayIndex+jumpFront)%7];
		}else {
			message = "Invalid Day";
		}
		return message;
	}
	/**
	 * 
	 * @param day
	 * @return day index
	 */
	private int getDayIndex(String day) {
		for(int i=0; i<days.length; i++) {
			if (days[i]==this.day) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * To string method
	 */
	public String toString() {
		return day;
	}
}

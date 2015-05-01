
public class DayDriver {
 public static void main(String[] args) {
	 Day day = new Day();
	 System.out.println("Today is "+ day + ".");
	 System.out.println("Tomorrow is " + day.nextDay() + ".");
	 System.out.println("Yesterday was " + day.previousDay() + ".");
	 System.out.println("Four day later, it will be " + day.calculateDay(4) + ".");
 }
}

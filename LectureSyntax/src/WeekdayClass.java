
public class WeekdayClass {
	public static void main(String[] args) {
		WEEKDAY day;
		day = WEEKDAY.MONDAY;
		day = WEEKDAY.TUESDAY;
		
		switch(day) {
		case MONDAY: System.out.println(WEEKDAY.MONDAY.getGermanTranslation());
		case TUESDAY: System.out.println(WEEKDAY.TUESDAY.getGermanTranslation());
		}
	}
}

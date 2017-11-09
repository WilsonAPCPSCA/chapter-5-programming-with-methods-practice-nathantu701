import java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
System.out.println("Give me the hour of the day on a 12 hour clock");
int hour = in.nextInt();
System.out.println("Give me the minutes in that hour");
int minute = in.nextInt();
System.out.print("It is " + getTimeName(hour,minute));
	}
public static String getTimeName(int hours, int minutes){
	String hourString = null;
	if (hours == 1 ){
		hourString = "one";
	}
	if (hours == 2 ){
		hourString = "two";
	}
	if (hours == 3 ){
		hourString = "three";
	}
	if (hours == 4 ){
		hourString = "four";
	}
	if (hours == 5 ){
		hourString = "five";
	}
	if (hours == 6 ){
		hourString = "six";
	}
	if (hours == 7 ){
		hourString = "seven";
	}
	if (hours == 8 ){
		hourString = "eight";
	}
	if (hours == 9 ){
		hourString = "nine";
	}
	if (hours == 10 ){
		hourString = "ten";
	}
	if (hours == 11){
		hourString = "eleven";
	}
	if (hours == 12){
		hourString = "twelve";
	}
	String minuteString=null;
	if (minutes== 0){
		minuteString = " o'clock ";
		return (hourString + minuteString);
	}
	else if (minutes== 30){
		minuteString = " half past ";
		return (minuteString + hourString);
	}
	else if (minutes== 15){
		minuteString = " a quarter past ";
		return (minuteString + hourString);
	}
	else if (minutes== 45){
		minuteString = " a quarter till ";
		if (hours == 1 ){
			hourString = "two";
		}
		if (hours == 2 ){
			hourString = "three";
		}
		if (hours == 3 ){
			hourString = "four";
		}
		if (hours == 4 ){
			hourString = "five";
		}
		if (hours == 5 ){
			hourString = "six";
		}
		if (hours == 6 ){
			hourString = "seven";
		}
		if (hours == 7 ){
			hourString = "eight";
		}
		if (hours == 8 ){
			hourString = "nine";
		}
		if (hours == 9 ){
			hourString = "ten";
		}
		if (hours == 10 ){
			hourString = "eleven";
		}
		if (hours == 11){
			hourString = "twelve";
		}
		if (hours == 12){
			hourString = "one";
		}
		return (minuteString + hourString);
	}
	else if (minutes==1){
		minuteString = minutes + " minute past ";
		return (minuteString + hourString);
	}
	else {
		minuteString = minutes + " minutes past ";
		return (minuteString + hourString);
	}
}
}
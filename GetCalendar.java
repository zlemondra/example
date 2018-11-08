import java.util.*;
import java.util.Calendar;
public class GetCalendar {
	GregorianCalendar date = new GregorianCalendar();
	int year;
	int n;
	private static final int MILLIS_IN_SECOND = 1000;
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int HOURS_IN_DAY = 24;
    private static final int DAYS_IN_YEAR = 365; //I know this value is more like 365.24...
    private static final long yearSec = MILLIS_IN_SECOND * SECONDS_IN_MINUTE *MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
    long daysec =MILLIS_IN_SECOND * SECONDS_IN_MINUTE *MINUTES_IN_HOUR * HOURS_IN_DAY;
    int monthNum;
    int numOfDays;
    public void numD(String month){
    	if(month.equals("January")){
			
			month="January ";
			this.numOfDays=31;
		}
		else if(month.equals("February")){
			
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				this.numOfDays=29;
			}
			else{
				this.numOfDays=28;
			}
		}
		else if(month.equals("March ")){
			
			this.numOfDays=31;
		}
		else if(month.equals("April")){
			this.numOfDays=30;
		}
		else if(month.equals("May")){
			this.numOfDays=31;
		}
		else if(month.equals("June")){
			
			this.numOfDays=30;
		}
		else if(month.equals("July")){
			this.numOfDays = 31;
		}
		else if(month.equals("August")){
			
			this.numOfDays=31;
		}
		else if(month.equals("September")){
			
			this.numOfDays=30;
		}
		else if(month.equals("October")){
			this.numOfDays=31;
		}
		else if(month.equals("November")){
			this.numOfDays=30;
		}
		else if(month.equals("December")){
			this.numOfDays=31;
			
		}

    }
    public int numdd(){
    	return this.numOfDays;
    }
	public int year(int year){
		this.year = year;
		return this.year;
	}
	public int getY(){
		return this.year;
	}
	public void getMonthSec(String month){
	if(month.equals("January")){
			
			month="January ";
			this.monthNum = 1;
		}
		else if(month.equals("February")){
			this.monthNum = 2;
		}
		else if(month.equals("March ")){
			
			this.monthNum = 3;
		}
		else if(month.equals("April")){
			this.monthNum = 4;
		}
		else if(month.equals("May")){
			this.monthNum = 5;
		}
		else if(month.equals("June")){
			
			this.monthNum = 6;
		}
		else if(month.equals("July")){
			this.monthNum = 7;
		}
		else if(month.equals("August")){
			
			this.monthNum = 8;
		}
		else if(month.equals("September")){
			
			this.monthNum = 9;
		}
		else if(month.equals("October")){
			this.monthNum = 10;
		}
		else if(month.equals("November")){
			this.monthNum = 11;
		}
		else if(month.equals("December")){
			this.monthNum = 12;
			
		}
		/**int n = 0;
		if(month == "January"){
			n =0;
		}
		else if(month=="February "){
			n= 31;
		}
		else if(month=="March "){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31;
			}
			else{
				n=28+ 31;
			}
	
		}
		else if(month=="April "){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31 +31;
			}
			else{
				n=28+ 31+31;
			}
	
		}
		else if(month=="May "){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31 +31+30;
			}
			else{
				n=28+ 31+31+30;
			}
		}
		else if(month=="June "){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31 +31+30+31;
			}
			else{
				n=28+ 31+31+30+31;
			}
		}
		else if(month=="July "){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31 +31+30+31+30;
			}
			else{
				n=28+ 31+31+30+31+30;
			}
		}
		else if(month=="August "){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31 +31+30+31+30+31;
			}
			else{
				n=28+ 31+31+30+31+30+31;
			}
		}
		else if(month=="September "){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31 +31+30+31+30+31+31;
			}
			else{
				n=28+ 31+31+30+31+30+31+31;
			}
		}
		else if(month == "October"){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31 +31+30+31+30+31+31+30;
			}
			else{
				n=28+ 31+31+30+31+30+31+31+30;
			}
		}
		else if(month == "November"){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n=29 + 31 +31+30+31+30+31+31+30+31;
			}
			else{
				n=28+ 31+31+30+31+30+31+31+30+31;
			}
		}
		else if(month == "December"){
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				n= 31 +29 + 31 +31+30+31+30+31+31+30+31+30;
			}
			else{
				n= 31 + 28+ 31+31+30+31+30+31+31+30+31+30;
			}
		}
		this.n= n;**/
	
	}
	public int month(){
		return this.n;
	}
	long da = (getY()*yearSec) + (month()*daysec );
	public long da(){
		return this.da;
	}
	
	

}

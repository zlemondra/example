import java.util.*;
import java.util.GregorianCalendar;
public class DisplayCalendar {
	
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Month");
		String month = input.next();
		
		GetCalendar gc = new GetCalendar();
		
		gc.getMonthSec(month);
		gc.year(year);
		gc.numD(month);
		//GregorianCalendar calendar = new GregorianCalendar(year, month,);
		//long y = 1512115200000;
		//Date x = new Date(gc.da());
		Calendar cal = new GregorianCalendar(year, gc.monthNum, 1);
		//cal.setTime(x);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println("here" + day);
		
		int numOfDays = gc.numdd();
		System.out.print(numOfDays);
		//System.out.print(day);
		System.out.println(month + year);
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		//System.out.println(day);
		for (int i=0; i<=day; i++){
			System.out.print("   ");
		}

		for (int j=day, i = 1; i<=numOfDays; j++, i++){ 
			System.out.printf("%3d ", i);
			//day+=1;
			System.out.print(" ");
			if ( j %7==0 && j !=0){
				System.out.println();
				/*System.out.printf("%3d ", j);
				day+=1;
				System.out.print(" ");*/
			}
		}
		//day%=7;
		System.out.print("\n\n");
		
	}
}

/**for (int k=1; k<=12; k++) {
				//String month="";
				
				switch (k)
				{**/
		/**if(month == "January"){
			
			month="January ";
			numOfDays=31;
		}
		else if(month=="February "){
			
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
				numOfDays=29;
			}
			else{
				numOfDays=28;
			}
		}
		else if(month=="March "){
			
			numOfDays=31;
		}
		else if(month=="April "){
			numOfDays=30;
		}
		else if(month=="May "){
			numOfDays=31;
		}
		else if(month=="June "){
			
			numOfDays=30;
		}
		else if(month=="July "){
		}
		else if(month=="August "){
			
			numOfDays=31;
		}
		else if(month=="September "){
			;
			numOfDays=30;
		}
		else if(month == "October"){
			numOfDays=31;
		}
		else if(month == "November"){
			numOfDays=30;
		}
		else if(month == "December"){
			numOfDays=31;
			
		}**/
		
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*; 

public class code{
    public static void main(String[] args) throws ParseException{
        /*try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of days: ");
            int days = sc.nextInt();

            int count = 0, week = 0, startDay = 0, endDay = 0;
            int daysRem = 7 - days % 7;

            for(int i = 1; i <= days; i++){
                count++;
                if(count % 7 == 1){
                    week++;
                    startDay = count;
                    if(days % 7 == 0){
                        endDay = days;
                    }
                    else{
                        endDay = daysRem + days;
                    }
                }
            }
            System.out.println("-----------------------------------------");
            System.out.println("Week "+ week);
            System.out.println("Week start on day " + startDay);
            System.out.println("Week ends on day " + endDay);

            int totalAmount = 0;
            for(int i = startDay;i <= days;i++){
                totalAmount = totalAmount + i;
            }

            System.out.println("-----------------------------------------");
            System.out.println("Amount to save for that week is: " + totalAmount);
        }*/

        /*try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the week you are in: ");
            int week = sc.nextInt();

            List<Integer> weeks = new ArrayList<Integer>();
            for(int i = 1; i <= 366; i++){
                weeks.add(i);
            }

            int count = 0, startDay = 0, endDay = 0, dayInWeek = 0;
            for(int i = 1; i <= weeks.size(); i++){
                count++;
                if(count%7 == 1){
                    dayInWeek++;
                    startDay = count;
                    endDay = startDay + 6;
                    if(week == dayInWeek) {
                        int totalAmount = 0;
                        for(int j = startDay; j <= endDay; j++){
                            totalAmount = totalAmount + j;
                        }
                        System.out.println("This is week " + dayInWeek + " which starts on " + startDay + " and ends on " + endDay);
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Total amount for that week should be: $" + totalAmount);
                    }
                }
            }
        }*/

        // String date_start = " 2024-01-01 00:00:00.0"; 
        // String date_end = "2024-12-31 23:59:59";
        // SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
        // Date date = dt.parse(date_start);
        // Date date2 = dt.parse(date_end);
        // System.out.println(date);
        // System.out.println(date2);

        // for(int i = date;)

    }  
}
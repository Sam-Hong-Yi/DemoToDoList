package sg.edu.rp.c346.id22024848.demotodolist;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {

        // Complete the code here
        if (day==7){
            return "Sunday";
        }
        else if(day==1){
            return "Monday";
        }
        else if(day==2){
            return "Tuesday";
        }
        else if(day==3){
            return "Wednesday";
        }
        else if(day==4){
            return "Thursday";
        }
        else if(day==5){
            return "Friday";
        }
        else if(day==6){
            return "Saturday";
        }
        else{
            return "";
        }


    }
}


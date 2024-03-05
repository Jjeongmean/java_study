package ch12.sec08;

import java.util.Calendar;

public class CalenderExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);

        String strWeek = null;

        switch (week) {
            case Calendar.MONDAY: strWeek = "월";
            case Calendar.TUESDAY: strWeek = "화";
            case Calendar.WEDNESDAY: strWeek = "수";
            case Calendar.THURSDAY: strWeek = "목";
            case Calendar.FRIDAY: strWeek = "금";
            case Calendar.SATURDAY: strWeek = "토";
            default:strWeek = "일";
        }

        System.out.println(year + "년" + month + "월" + day + "일" + strWeek + "요일");

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if (amPm == Calendar.AM) strAmPm = "오전";
        else strAmPm = "오후";

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(strAmPm + hour + "시" + minute + "분" + second + "초");
    }
}

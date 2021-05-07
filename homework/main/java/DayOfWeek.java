import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayOfWeek {

    public void getDays() {

        Map<String, Integer> yearMonthDay = getDate();

        int year = yearMonthDay.get("Year");
        int month = yearMonthDay.get("Month");
        int day = yearMonthDay.get("Day");

        int now = Integer.valueOf(LocalDate.now().getYear());
        int birthYear = Integer.valueOf(LocalDate.of(year, month, day).getYear());

        int minus = now - birthYear;

        int i = 0;
        while (i <= minus) {
            System.out.println(year + " " +LocalDate.of(year, month, day).getDayOfWeek());
            year++;
            i++;
        }


    }

    public Map<String, Integer> getDate() {

        Map<String, Integer> map = new HashMap<String, Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zəhmət olmasa doğum tarixini qeyd edin:");
        int year = scanner.nextInt();
        System.out.println("Zəhmət olmasa doğum ayınızı qeyd edin:");
        int month = scanner.nextInt();
        System.out.println("Zəhmət olmasa doğum gününüzü qeyd edin:");
        int day = scanner.nextInt();

        map.put("Year", year);
        map.put("Month", month);
        map.put("Day", day);

        return map;
    }


}

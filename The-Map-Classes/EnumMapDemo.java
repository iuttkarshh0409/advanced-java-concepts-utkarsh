import java.util.EnumMap;

enum Day { MON, TUE, WED, THU, FRI }

public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Day, String> schedule = new EnumMap<>(Day.class);

        schedule.put(Day.MON, "Math");
        schedule.put(Day.TUE, "Science");

        System.out.println("Subject on Monday: " + schedule.get(Day.MON));
        System.out.println("All entries: " + schedule);
    }
}

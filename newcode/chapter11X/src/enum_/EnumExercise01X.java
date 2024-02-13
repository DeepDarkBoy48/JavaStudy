package enum_;

public class EnumExercise01X {
    public static void main(String[] args) {
        WeekX[] values = WeekX.values();
        for (WeekX arr:values){
            System.out.println(arr);
        }
    }
}

enum WeekX{
    MONDAY("MONDAY"),TUESDAY("TUESDAY"),WEDNESDAY("WEDNESDAY"),THURSDAY("THURSDAY"),FRIDAY("FARDAY")
    ,SATURDAY("SATURDAY"),SUNDAY("SUNDAY");
    private String name;

    WeekX(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}



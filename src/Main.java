import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,InfoAuto> map = new HashMap<>();
        map.put(
                new Car(2000, 99),
                new InfoAuto(11,222,"BMW","Black"));
        map.put( new Car(2002,(22)),
                new InfoAuto(12,333,"Mers","Blue"));
        map.put(new Car(2003,(22)),
                new InfoAuto(13,444,"Tiko","Red"));
        map.put(new Car(2004,(22)),
                new InfoAuto(14,555,"Toyota","White"));
       for( Map.Entry i : map.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }

    }
}
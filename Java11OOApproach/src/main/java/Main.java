import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.List;

public class Main {

    //testare FlightPlan
//    public static void main(String[] args) {
//        FlightPlan berlinToBucharest = new FlightPlan( "BER", "OTP");
//        berlinToBucharest.print();
//        System.out.println();
//        FlightPlan parisToLondon = new FlightPlan(
//                "CDG",
//                "LHR",
//                LocalDateTime.of(2020, 01, 10 ,23,15),
//                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR"));
//        parisToLondon.print();
//    }

    public static void main (String[] args) throws InterruptedException{
        RadarTarget os791 = new RadarTarget(
                "OS791",
                280,
                "B737-800"
        );
        System.out.println(os791.getLabel());
        System.out.println();

        os791.changeAltitude(200);
        for(int i=0; i<5; i++){
            Thread.sleep(1000);
            System.out.println(os791.getLabel());
            System.out.println();
        }

    }

}

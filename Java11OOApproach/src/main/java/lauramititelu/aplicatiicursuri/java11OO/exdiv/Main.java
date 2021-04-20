package lauramititelu.aplicatiicursuri.java11OO.exdiv;


import java.util.List;

public class Main {

    //testare java11OO.FlightPlan
//    public static void main(String[] args) {
//       java11OO.FlightPlan berlinToBucharest = new FlightPlan( "BER", "OTP");
//        berlinToBucharest.print();
//        System.out.println();
//        java11OO.FlightPlan parisToLondon = new FlightPlan(
//                "CDG",
//                "LHR",
//                LocalDateTime.of(2020, 01, 10 ,23,15),
//                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR"));
//        parisToLondon.print();
//    }

//    Testare java11OO.RadarTarget
//    public static void main (String[] args) throws InterruptedException{
//        RadarTarget os791 = new RadarTarget(
//                "OS791",
//                280,
//                "B737-800"
//        );
//        System.out.println(os791.getLabel());
//        System.out.println();
//
//        //change altitude label
//        os791.changeAltitude(200);
//
//        //keep detecting target tp see command executed
//        for(int i=0; i<5; i++){
//            Thread.sleep(1000);
//            System.out.println(os791.getLabel());
//            System.out.println();
//        }
//
//    }

//    Testare FlightDataRecorder
//    public static void main(String[] args) throws InterruptedException{
//        FlightDataRecorder.log("Primul mesaj");
//        for(int i=0; i<5; i++){
//            Thread.sleep(1000);
//            FlightDataRecorder.log("Mesaj la momentul " + i);
//          }
//        FlightDataRecorder.listLog();
//    }

//    Testare ConversionHelper
//    public static void main(String[] args) {
//        int altitudeInFeet = 28_000;
//        double distInNm = 10;
//
//        int altitudeInFl = ConversionHelper.fromFeetToFL(300);
//        System.out.println(altitudeInFeet + " ft -> FL " + altitudeInFl);
//        //fl= flylevel
//        //nm = nautical mile
//
//        double distInMeters = ConversionHelper.fromNmToMeters(10);
//        System.out.println(distInNm+ " Nm -> " + distInMeters + " m");
//
//        Calculators.Distance d = new Calculators.Distance(1, 1, 3,3);
//        System.out.println(String.format("Distance is %.2f ", d.calculate()));
//
//    }


//    Testare LatLon, Route, Shape si Waypoint
    public static void main(String[] args) {
        //Create an airspace
        List<Shape> airspace = List.of(
                new Waypoint(" CREOL", new LatLon(20.3, 40.7)),
                new Waypoint("ZIDCO", new LatLon(87.1, 20.7)),
                new Waypoint("RYTHM", new LatLon(44.5, 23.2)),
                new Route("ROUTE1",
                        new LatLon(41.3, 2.3),
                        new LatLon(41.5, 2.4),
                        new LatLon(41.7, 2.7))
        );

        //print wkt for drawing on screen
        airspace.forEach( s -> {
            System.out.println(s.toWkt());
        });

    }
}

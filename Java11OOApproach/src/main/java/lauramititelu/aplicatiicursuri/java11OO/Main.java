package lauramititelu.aplicatiicursuri.java11OO;



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
    public static void main(String[] args) {
        int altitudeInFeet = 28_000;
        double distInNm = 10;

        int altitudeInFl = ConversionHelper.fromFeetToFL(300);
        System.out.println(altitudeInFeet + " ft -> FL " + altitudeInFl);
        //fl= flylevel
        //nm = nautical mile

        double distInMeters = ConversionHelper.fromNmToMeters(10);
        System.out.println(distInNm+ " Nm -> " + distInMeters + " m");

        Calculators.Distance d = new Calculators.Distance(1, 1, 3,3);
        System.out.println(String.format("Distance is %.2f ", d.calculate()));

    }


}

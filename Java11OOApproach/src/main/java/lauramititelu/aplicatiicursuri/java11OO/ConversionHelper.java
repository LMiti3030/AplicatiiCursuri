package lauramititelu.aplicatiicursuri.java11OO;

public final class ConversionHelper {

    private static final int METERS_IN_ONE_NM = 1852;
//    echiv cu

//    private static int metersInOneNm;
//
//    static{
//        metersInOneNm = 1852;
//    }

    public static int fromFeetToFL(int feet){
        return feet / 100;
    }

    public static double fromNmToMeters(double nm){
        return nm * METERS_IN_ONE_NM;
       // return nm * metersInOneNm;
    }






}

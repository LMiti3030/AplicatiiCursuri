package lauramititelu.aplicatiicursuri.java11OO.airspacedemo.radar;

import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Coordinate;

public class Aircraft {
    private String callSign;
    private Coordinate coordinate;
    private int altitudeFl;

    public Aircraft(String callSign, Coordinate coordinate, int altitudeFl){
        this.callSign = callSign;
        this.coordinate = coordinate;
        this.altitudeFl = altitudeFl;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public int getAltitudeFl() {
        return altitudeFl;
    }

    public void setAltitudeFl(int altitudeFl) {
        this.altitudeFl = altitudeFl;
    }
}

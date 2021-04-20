package lauramititelu.aplicatiicursuri.java11OO.exdiv;

public class LatLon {

    private double lon;
    private double lat;

    public LatLon(double lat, double lon){
        this.setLat(lat);
        this.setLon(lon);
    }

    public double getLon() {
        return lon;
    }

    private void setLon(double lon) {
        if(lon < -180 || lon > 180){
            throw new IllegalArgumentException("Value not valid ");
        }
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    private void setLat(double lat) {
        if(lat < -90 || lat > 90){
            throw new IllegalArgumentException("Value not valid ");
        }
        this.lat = lat;
    }
}

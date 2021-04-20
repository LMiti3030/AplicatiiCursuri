package lauramititelu.aplicatiicursuri.java11OO.airspacedemo.airspace;

import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Circle;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Coordinate;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.DistanceCalculator;

public class TMASector implements AirSector{
    private Circle shape;
    private int upperAltitudeFl;

    public TMASector(Circle shape, int upperAltitudeFl){
        this.shape = shape;
        this.upperAltitudeFl = upperAltitudeFl;
    }


    @Override
    public boolean isInSector(Coordinate x, int altitude) {
        if(altitude > this.upperAltitudeFl){
            return false;
        }
        double distanceToRadius =
                DistanceCalculator.calculate(x, this.shape.getOrigin());
        return distanceToRadius < this.shape.getRadiusNm();
    }
}

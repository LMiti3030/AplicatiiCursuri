package lauramititelu.aplicatiicursuri.java11OO.airspacedemo.airspace;

import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Coordinate;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Rectangle;

public class EnRouteSector implements AirSector{
    private int lowerAltitudeFl;
    private int upperAltitudeFl;
    private Rectangle shape;

    public EnRouteSector(Rectangle shape, int lowerAltitudeFl, int upperAltitudeFl){
        this.shape = shape;
        this.lowerAltitudeFl = lowerAltitudeFl;
        this.upperAltitudeFl = upperAltitudeFl;
    }


    @Override
    public boolean isInSector(Coordinate x, int altitude) {
        if(altitude > this.upperAltitudeFl){
            return false;
        }
        if(altitude < this.lowerAltitudeFl ){
            return false;
        }
        return shape.containsCoordinate(x);
    }
}

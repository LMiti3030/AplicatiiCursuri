package lauramititelu.aplicatiicursuri.java11OO.airspacedemo.airspace;

import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Coordinate;

public interface AirSector {
    boolean isInSector(Coordinate x, int altitude);
}

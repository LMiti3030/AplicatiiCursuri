package lauramititelu.aplicatiicursuri.java11OO.airspacedemo;

import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.airspace.AirSector;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.airspace.EnRouteSector;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.airspace.TMASector;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Circle;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Coordinate;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.geography.Rectangle;
import lauramititelu.aplicatiicursuri.java11OO.airspacedemo.radar.Aircraft;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AirSector> sectorsWithBadWeather = List.of(
                new TMASector(
                        new Circle( new Coordinate(20, 20), 10),
                        100),
                new EnRouteSector(
                        new Rectangle(
                                new Coordinate(0, 0),
                                new Coordinate(10, 20),
                                new Coordinate(0, 20),
                                new Coordinate(10,0)),
                        200, 400) );

        List<Aircraft> flyingAircraft = List.of(
                new Aircraft("OS876", new Coordinate(20,20), 50),
                new Aircraft("RO345", new Coordinate(5,15), 200),
                new Aircraft("TA234", new Coordinate(30,10), 230)
        );

        sectorsWithBadWeather.forEach( s -> {
            flyingAircraft.forEach( a -> {
                if( s.isInSector(a.getCoordinate(), a.getAltitudeFl())){
                    System.out.println("Warning -> " + a.getCallSign() + " in bad weather sector");
                }
            });
        });

    }

}

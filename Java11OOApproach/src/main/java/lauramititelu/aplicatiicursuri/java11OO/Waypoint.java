package lauramititelu.aplicatiicursuri.java11OO;

public class Waypoint extends Shape{

    // A Waypoint is a named point in an airspace. It is used by pilots and air traffic controllers for navigation.. A Waypoint is a named point in an airspace. It is used by pilots and air traffic controllers for navigation


    private final String name;
    private final LatLon position;

    public Waypoint(String name, LatLon position){
        this.name = name;
        this.position = position;
    }

    @Override
    protected String convertToWkt(){
        StringBuilder sb = new StringBuilder();
        sb.append("POINT (")
                .append(this.position.getLon())
                .append(" ")
                .append(this.position.getLat())
                .append(")");
        return sb.toString();
    }

}

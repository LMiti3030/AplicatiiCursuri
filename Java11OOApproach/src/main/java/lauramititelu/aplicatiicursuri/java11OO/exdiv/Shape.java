package lauramititelu.aplicatiicursuri.java11OO.exdiv;

public abstract class Shape {

    protected abstract String convertToWkt();

    public String toWkt(){
        String wkt = this.convertToWkt();

        if(this.isWktValid(wkt)){
            return wkt;
        }
        throw new RuntimeException("Can not draw shape");
    }

    private boolean isWktValid(String wkt){
        if( wkt == null || wkt.length() == 0){
            return false;
        }
        return wkt.startsWith("POINT") ||
                wkt.startsWith("LINESTRING") ||
                wkt.startsWith("POLYGON");

    }



}

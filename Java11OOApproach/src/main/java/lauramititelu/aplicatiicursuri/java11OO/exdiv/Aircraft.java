package lauramititelu.aplicatiicursuri.java11OO.exdiv;

public abstract class Aircraft {

    private String modelId;

    private int altitude;

    public abstract void land();

    public final void takeOff(){
        this.checkSystems();
        this.getClearance();
        this.implementCustomActions();
    }

    protected abstract void checkSystems();
    protected abstract void getClearance();
    protected abstract void implementCustomActions();

    public int getAltitude() {
        return altitude;
    }
}

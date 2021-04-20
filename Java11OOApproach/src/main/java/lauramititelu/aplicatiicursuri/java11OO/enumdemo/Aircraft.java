package lauramititelu.aplicatiicursuri.java11OO.enumdemo;

public class Aircraft {
    private final String model;
    private final WakeTurbulence wakeTurbulence;
    private final int modeADecimal;

    public Aircraft(int modeADecimal, String model, WakeTurbulence wakeTurbulence){
        this.model = model;
        this.wakeTurbulence = wakeTurbulence;
        this.modeADecimal = modeADecimal;
    }

    public String getModel() {
        return model;
    }

    public WakeTurbulence getWakeTurbulence() {
        return wakeTurbulence;
    }

    public int getModeADecimal() {
        return modeADecimal;
    }
}

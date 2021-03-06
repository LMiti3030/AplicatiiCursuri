package lauramititelu.aplicatiicursuri.java11OO.lambdademo;

import java.util.Map;

public class TakeOffDistancingRules {
    private Map<WakeTurbulence, Integer> rules; //wakecateg + wait time delay in sec

    public TakeOffDistancingRules(){
        rules = Map.of(
                WakeTurbulence.LIGHT, 60,
                WakeTurbulence.MEDIUM, 90,
                WakeTurbulence.HEAVY, 110,
                WakeTurbulence.SUPER, 180
        );
    }

    public int calculateWaitTime( Aircraft a){
        return rules.get(a.getWakeTurbulence());
    }

}

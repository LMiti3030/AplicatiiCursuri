package lauramititelu.aplicatiicursuri.java11OO.lambdademo;

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

    public String getModeAOctal(){
        class ModeAClass{
            private String octal;

            public ModeAClass(){
                int decimalValue= modeADecimal ; //Aircraft.this.modeADecimal;

                if(decimalValue < 0 || decimalValue > 7777 ){
                    this.octal = null;
                }

                String octalValue = Integer.toOctalString(decimalValue);

                switch (octalValue.length()){
                    case 4: this.octal = octalValue; break;
                    case 3: this.octal = "0" + octalValue; break;
                    case 2: this.octal = "00" + octalValue; break;
                    case 1: this.octal = "0000" + octalValue; break;
                }


            }

            public String getOctal() {
                return octal;
            }
        }

        ModeAClass modeACode = new ModeAClass();
        return modeACode.getOctal();
    }

//
//    private class ModeAClass{
//        private String octal;
//
//        public ModeAClass(){
//            int decimalValue= modeADecimal ; //Aircraft.this.modeADecimal;
//
//            if(decimalValue < 0 || decimalValue > 7777 ){
//                this.octal = null;
//            }
//
//            String octalValue = Integer.toOctalString(decimalValue);
////
////            if(octalValue.length() == 4){
////                this.octal = octalValue;
////            }
////            if(octalValue.length() == 3){
////                this.octal = "0" + octalValue;
////            }
////            if(octalValue.length() == 2){
////                this.octal = "00" + octalValue;
////            }
////            if(octalValue.length() == 1){
////                this.octal = "000" + octalValue;
////            }
//
//            switch (octalValue.length()){
//                case 4: this.octal = octalValue; break;
//                case 3: this.octal = "0" + octalValue; break;
//                case 2: this.octal = "00" + octalValue; break;
//                case 1: this.octal = "0000" + octalValue; break;
//            }
//
//
//        }
//
//        public String getOctal() {
//            return octal;
//        }
//    }
}

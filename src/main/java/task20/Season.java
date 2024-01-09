package task20;

public enum Season {
    WINTER(-3),SPRING(15){
        @Override
        public String getDescription() {
            return "Прохладное время года";
        }
    },SUMMER(27){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(8);

    private double avgTmp;

    Season(double avgTmp) {
        this.avgTmp = avgTmp;
    }

    public double getAvgTmp() {
        return avgTmp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

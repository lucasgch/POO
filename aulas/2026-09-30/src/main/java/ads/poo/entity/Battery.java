package ads.poo.entity;

public class Battery {
    private final double capacity;
    private final double voltage;
    private double currentCharge;

    public Battery(double capacity, double voltage){
        this.capacity = capacity;
        this.voltage = voltage;
        this.currentCharge = 0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getCurrentCharge() {
        return currentCharge;
    }

    public void chargeBattery(double charge){
        if ( charge>0 ) {
            this.currentCharge = Math.min(currentCharge + charge, capacity);
        }
    }

    public void consumeBattery(double consumption){
        if ( consumption>0 ){
            this.currentCharge = Math.max(0,currentCharge-consumption);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Battery{");
        sb.append("Carga Atual: [").append(currentCharge);
        sb.append("] / [").append(capacity);
        sb.append("] Voltagem: ").append(voltage);
        return sb.toString();
    }
}

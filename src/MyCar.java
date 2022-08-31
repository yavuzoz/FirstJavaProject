public class MyCar
{
    private double drive;
    private double gas;
    private double kmsPerGallon;

    public MyCar(double kmpg)
    {
        kmsPerGallon = kmpg;
        gas = 0;
        drive = 0;
    }
    public void addGas(double amount)
    {
        gas = gas + amount;
    }
    public void drive(double distance)
    {
        drive = drive + distance;
        gas = gas - ((distance / 100) * kmsPerGallon);
    }


    public double getGasInTank()
    {
        return gas;
    }

}
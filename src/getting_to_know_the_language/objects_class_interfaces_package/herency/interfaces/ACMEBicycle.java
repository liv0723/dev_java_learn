package getting_to_know_the_language.objects_class_interfaces_package.herency.interfaces;

public class ACMEBicycle implements IBicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    //the compiler will now require that methods
    //changeCadence ...
    //all be implements. Compilation will fail if those
    //methods are missing from this class


    @Override
    public void changeCadence(int newCadence) {
        cadence = newCadence;

    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;

    }

    @Override
    public void speedUp(int increment) {
        speed += increment;

    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;

    }

    void printStates() {
        System.out.println("cadence:\s" +
                cadence + " speed:\s" +
                speed + " gear:\s" + gear);

    }
}

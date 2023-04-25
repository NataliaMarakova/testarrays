public class Conditioner {
    public int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int newCurrentTemperature) {
        if (newCurrentTemperature < 0) {
            return;
        }
        if (newCurrentTemperature > 30) {
            return;
        }
        currentTemperature = newCurrentTemperature;

    }

    public void increaseTemperature50p() {
        int target = currentTemperature * 3/2;
        currentTemperature = target;
    }

    public void setToMaxTemp() {
        currentTemperature = 30;
    }

}

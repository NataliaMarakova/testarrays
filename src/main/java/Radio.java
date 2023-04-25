public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int numberOfStations) {
        this.maxStation = numberOfStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

        public void prevStation() {
            if (currentStation != 0) {
                currentStation--;
            } else {
                currentStation = maxStation;
            }
    }




    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
            } else {
            currentVolume = 100;
        }
        }

    public void lowerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    // public void maxVolume() {
    //    if (currentVolume == 100) {
     //       return;
   //     }
 //   }

    //    public void minVolume () {
     //       if (currentVolume == 0) {
      //          return;
     //       }


      //  }

    }




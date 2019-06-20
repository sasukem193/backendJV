package tv;

public class TV {

    int chanel=1;
    int volume=1;
    boolean on= false;

    public TV(){
    }

    public void turnOn(){
        on= true;
    }
    public void turnOff(){
        on= false;
    }

    public void setChanel(int newChanel) {
        if(on && newChanel >=1 && newChanel <=100){
            this.chanel=newChanel;
        }
    }

    public void setVolume(int newVolume) {
        if(on && newVolume>=1 && newVolume<=10){
            this.volume= newVolume;
        }
    }

    public void chanelUp(){
        if(on && chanel<100){
            chanel++;
        }
    }
    public void chanelDown(){
        if(on && chanel>1){
            chanel--;
        }
    }

    public void volumeUp(){
        if(on && volume<100){
            volume++;
        }
    }
    public void volumeDown(){
        if(on && volume>1){
            volume--;
        }
    }

}

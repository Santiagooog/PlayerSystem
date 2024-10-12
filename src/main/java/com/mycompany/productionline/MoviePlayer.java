
package com.mycompany.productionline;

public class MoviePlayer extends Product implements MultimediaControl{
    public Screen screen= new Screen("1080x1900", 100, 20);
    public MonitorType monitorT = MonitorType.LCD;
    
    

    @Override
    public void play() {
        System.out.println("Reproduciendo");
    }

    @Override
    public void stop() {
        System.out.println("Pausando");
    }

    @Override
    public void previous() {
        System.out.println("Volver a la anterior");
    }

    @Override
    public void next() {
        System.out.println("Pasar a la siguiente");
    }

    @Override
    public String toString() {
        return "MoviePlayer{" + "creen=" + screen + ", monitorT=" + monitorT + '}';
    }

    
    
    
    
    
    
}


package com.mycompany.productionline;


public class AudioPlayer extends Product implements MultimediaControl{
    private String audioSpecification;
    private ItemType mediaType;
    
    public AudioPlayer(String name, String audioSpecification){
        super();
        this.mediaType = ItemType.AUDIO;
        this.audioSpecification = audioSpecification;
    }

    @Override
    public String toString() {
        return "Product{" + "manufacturer=" + manufacturer + ", serialNumber=" + serialNumber + ", manufacturedOn=" + manufacturedOn + ", name=" + name +", audioSpecification="+ audioSpecification+", typeMedia= "+mediaType+ '}';
    }


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
    
    
}

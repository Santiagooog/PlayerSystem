package com.mycompany.productionline;

public class ControllerAudioPlayer {



    public static void main(String[] args) {
        AudioPlayer audioP = new AudioPlayer("Buenos dias Vietnam", "Stereo");
        System.out.println(audioP.toString());
        
        audioP.play();
        audioP.stop();
        audioP.next();
        audioP.previous();
    }
    
    
    

}

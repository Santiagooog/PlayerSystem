
package com.mycompany.productionline;


public class Screen implements ScreenSpec{

    public Screen() {
    }

    public Screen(String resolution, int frecuenciaActualizacion, int tiempoRespuesta) {
        this.resolution = resolution;
        this.frecuenciaActualizacion = frecuenciaActualizacion;
        this.tiempoRespuesta = tiempoRespuesta;
    }
    
    
    public String resolution;
    public int frecuenciaActualizacion;
    public int tiempoRespuesta;

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return frecuenciaActualizacion;
    }

    @Override
    public int getResponseTime() {
        return tiempoRespuesta;
    }

    @Override
    public String toString() {
        return "Screen{" + "resolution=" + resolution + ", frecuenciaActualizacion=" + frecuenciaActualizacion + ", tiempoRespuesta=" + tiempoRespuesta + '}';
    }
    
    
    
    
}

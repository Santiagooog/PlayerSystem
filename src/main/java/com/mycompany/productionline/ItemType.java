
package com.mycompany.productionline;


public enum ItemType {
    
    AUDIO ("AU"),
    VISUAL("VI"),
    AUDIOMOVIL("AM"),
    VISUALMOBILE("VM");
    
    private final String typeCode;
    
    ItemType(String typeCode){
        this.typeCode = typeCode;
    }
    public String getTypeCode(){
        return typeCode;
    }
    
    
}

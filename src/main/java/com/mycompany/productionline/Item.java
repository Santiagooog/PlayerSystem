
package com.mycompany.productionline;

import java.util.Date;


public interface Item {
    
    public final String fabricante = "OracleProduction";
    public void setProductionNumber(int a);
    public void setName(String a);
    public String setName();
    public Date getManufacturedDate();
    public Integer getSerialNumber();
    
    
    
}

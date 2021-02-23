/**
 * 
 */
package com.ucreativa;


/**
 * 
 *
 */
public class Busqueda extends Bien{
    private String listaBienes;
    
    /**
     * @return the listaBienes
     */
    public String getListaBienes() {
        return listaBienes;
    }

 


    /**
     * @param listaBienes the listaBienes to set
     */
    public void setListaBienes(String listaBienes) {
        this.listaBienes = listaBienes;
    }

 


    @Override
    public String toString() {
        return "Busqueda [listaBienes=" + listaBienes + "]";
    }

 

    /**
     * constructor
     * @param id
     * @param precio
     * @param listaBienes
     */
    public Busqueda(String id, double precio, String listaBienes) {
        super(id, precio);
        this.listaBienes = listaBienes;
    }
    
}
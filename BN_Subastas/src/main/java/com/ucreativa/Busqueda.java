/**
 * 
 */
package com.ucreativa;

/**
 * 
 *
 */
public class Busqueda implements Bien{
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

	/**
	 * constructor
	 * @param listaBienes
	 */
	public Busqueda(String listaBienes) {
		super();
		this.listaBienes = listaBienes;
	}


	@Override
	public String toString() {
		return "Busqueda [listaBienes=" + listaBienes + "]";
	}
	

}

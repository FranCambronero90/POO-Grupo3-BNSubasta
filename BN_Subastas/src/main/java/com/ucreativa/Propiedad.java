package com.ucreativa;

/**
 * Esta es la clase que define la propiedad (un bien inmueble) en el sistema de subastas.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class Propiedad extends Bien{
    
    private String provincia;
    private String canton;
    private String distrito;
    private double descuento;
    private String tipoVenta;
    private double tamanno;
    private boolean estaEnCosta;
    private boolean reciente;
    private boolean aceptaOfertas;
    private boolean destacado;
    private String estado;

    public Propiedad(String provincia, String canton, String distrito, double descuento, String tipoVenta, double tamanno, boolean estaEnCosta, boolean reciente, boolean aceptaOfertas, boolean destacado, String estado, String id, double precio) {
        super(id, precio);
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.descuento = descuento;
        this.tipoVenta = tipoVenta;
        this.tamanno = tamanno;
        this.estaEnCosta = estaEnCosta;
        this.reciente = reciente;
        this.aceptaOfertas = aceptaOfertas;
        this.destacado = destacado;
        this.estado = estado;
    }

    public boolean registrar(){
        try{
            Repo.BienRepo.propiedades.add(this);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public double getTamanno() {
        return tamanno;
    }

    public void setTamanno(double tamanno) {
        this.tamanno = tamanno;
    }

    public boolean isEstaEnCosta() {
        return estaEnCosta;
    }

    public void setEstaEnCosta(boolean estaEnCosta) {
        this.estaEnCosta = estaEnCosta;
    }

    public boolean isReciente() {
        return reciente;
    }

    public void setReciente(boolean reciente) {
        this.reciente = reciente;
    }

    public boolean isAceptaOfertas() {
        return aceptaOfertas;
    }

    public void setAceptaOfertas(boolean aceptaOfertas) {
        this.aceptaOfertas = aceptaOfertas;
    }

    public boolean isDestacado() {
        return destacado;
    }

    public void setDestacado(boolean destacado) {
        this.destacado = destacado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Propiedad: Esta es la propiedad " + super.getId() + ", ubicada en " + provincia + ", " + canton + ", " + distrito + " y tiene un tamannio de " + tamanno + ". Estado actual: " + estado + "." + getId();
    }
}

package cuentas;
/**
 * Esta clase define cuentas bancarias y nos permite operar con ellas
 * 
 * @author Rafael Villa Barrado
 * @version 1.0
 * @since 29/02/2024
 * 
 */


public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de clase sin parametros
     * 
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de clase con parametros:
     * @param nom es el nombre del titular
     * @param cue es el numero de cuenta
     * @param sal es el saldo de la cuenta
     * @param tipo es el tipo de interes de la cuenta
     * 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el nombre del titular
     * @return Nombre del titular
     * 
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Inicializa el nombre del titular
     * @param nombre es el nombre del titular de la cuenta
     * 
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
     * Devuelve el número de cuenta
     * @return número de cuenta
     * 
     */
	public String getCuenta() {
		return cuenta;
	}

	/**
     * Inicializa el número de la cuenta de la cuenta
     * @param cuenta es el número de la cuenta
     * 
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
     * Devuelve el saldo
     * @return saldo
     * 
     */
	public double getSaldo() {
		return saldo;
	}

	/**
     * Inicializa el saldo
     * @param saldo es el saldo de la cuenta
     * 
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
     * Devuelve el tipo de interes
     * @return tipo de interes
     * 
     */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
     * Inicializa el tipo de interes
     * @param tipoInterés es el tipo de interés de la cuenta
     * 
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el saldo de la cuenta
	 * @return Saldo de la cuenta
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * Nos permite ingresar una cantidad a la cuenta
	 * @param cantidad es la cantidad a ingresar en la cuenta
	 * @exception Exception Cuando la cantidad es menor que 0
	 * 
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Nos permite retirar una cantidad de la cuenta
     * @param cantidad es la cantidad a retirar
     * @exception Exception Cuando la cantidad es menor que 0
     * @exception Exception Cuando la cantidad es mayor que el saldo
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
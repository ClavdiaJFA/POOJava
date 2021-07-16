
public class Cuentabancaria {
	
	//Atributos de la clase
	private String institucion = "";
	private String beneficiario = "";
	private float saldo = 0;
	private long cuenta = 0;
	private String producto = "";
	private String dirección = "";
	private String RFC= "";
	
	Cuentabancaria(String beneficiario, float saldo){
		this.beneficiario = beneficiario; //this: referencia a los atributos propios de la clase
		this.saldo = saldo;
	}
	
	//getter y setter
	//get obtengo el valor
	//set: escribo el valor
	
	public String getInstitucion () {
		return this.institucion;
	}
	
	public void setInstitucion (String institucion) {
		this.institucion = institucion;
	}
	
	
	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo > 0) {
		this.saldo = saldo;
		} else {
		throw new IllegalArgumentException("El saldo ingresado es inválido");
		}
	}

	public long getCuenta() {
		return cuenta;
	}

	public void setCuenta(long cuenta) {
		this.cuenta = cuenta;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	//Métodos de la claase
	public void depositos(float monto) {
		//saldo declarado dentro de la clase
		this.saldo = this.saldo + monto; //saldo actual + monto a depositar
		
	}
	
	public void retiros(float monto) { 
		// se especifica que el retiro debe ser igual o menor a monto de saldo actual
		if(monto < this.saldo && monto > 0 ) {
		   this.saldo = this.saldo - monto;
		}
		
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}
	
	public String estadoDeCuenta() {
		return "";
	}

}

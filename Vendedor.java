package Vendedores;

public class Vendedor {
	
	public Vendedor(String Nombre, String Saldo, String Balance) {
        this.nombre = Nombre;
        this.saldo = Saldo;
        this.balance = Balance;
    }
	
	    
	  String nombre;
	  String saldo;
	  String balance;
	  
	  public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getSaldo() {
			return saldo;
		}
		public void setSaldo(String saldo) {
			this.saldo = saldo;
		}
		public String getBalance() {
			return balance;
		}
		public void setBalance(String balance) {
			this.balance = balance;
		}
		
	  
	
}

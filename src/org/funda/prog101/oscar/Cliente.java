package exam;

import java.util.ArrayList;

public class Cliente extends Person {
	
	public int nroTarjeta;
	ArrayList<Cliente> cliente;	
	public Cliente(int nroTarjeta) {
		super(name, fname, idPerson);
		this.nroTarjeta=nroTarjeta; 
	}
	
	public boolean buscar(int id){
		//System.out.println("Hola usuario bienvenido");;
		boolean existe = cliente.contains(id);
		return existe;
		
	}
	
	public void addCliente(Cliente c) {
		cliente.add(c);
	}

	public void modifyCliente(Cliente c, int id) {
		cliente.set(0, c);
	}
}

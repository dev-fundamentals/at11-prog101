package PersonCounter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		System.out.println("(" + person1.localCount + ", " + person1.instanceCount + ")");
		System.out.println("(" + person2.localCount + ", " + person2.instanceCount + ")");
		
		//Imprime (1, 5) 1 porque la variable localCount no es static y se destruye despues de cada instanciacion,
		//mientras que la variable instanceCount es static y esta se mantiene e incrementa con cada instanciacion.
	}

}

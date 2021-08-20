
class A{
	
	public String nome  ="A";
}

class B extends A{
	
	public String nome  ="B";
}

class C extends B{

	public void imprimir(String nome) {
		System.out.println(super.nome);
	}
}

class Teste{
	public static void main(String[] args) {
		C	c = new C();
		c.imprimir("Saci");
	}
}


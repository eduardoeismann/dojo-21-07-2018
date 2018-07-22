
public enum ValoresRomanos{
		
	M(1000,100,"M","C"),
	D(500,100,"D","C"),
	C(100,10,"C","X"),
	L(50,10,"L","X"),
	X(10,1,"X","I"),
	V(5,1,"V","I"),
	I(1,0,"I",null);
	
	public int valor;
	public int valorMenor;
	public String valorRomano;
	public String valorRomanoMenor;
	
	private ValoresRomanos(int valor, int valorMenor, String valorRomano, String valorRomanoMenor) {
		this.valor = valor;
		this.valorMenor = valorMenor;
		this.valorRomano = valorRomano;
		this.valorRomanoMenor = valorRomanoMenor;	
	}		
}


public class NumerosRomanos {
	
	public static void main( String args[] ){
		ConverteValorParaRomano convertorRomano = new ConverteValorParaRomano();
		ConverteValorParaArabico convertorArabico = new ConverteValorParaArabico();
		
		System.out.println(convertorRomano.converteValor( new ArabicoRomano(1984) ).getRomano() );
		System.out.println(convertorRomano.converteValor( new ArabicoRomano(3477) ).getRomano() );
		System.out.println(convertorRomano.converteValor( new ArabicoRomano(1444) ).getRomano() );
		System.out.println(convertorRomano.converteValor( new ArabicoRomano(999) ).getRomano() );
		
		System.out.println(convertorArabico.converteValor( new ArabicoRomano("MCMLXXXIV") ).getArabico() );
		System.out.println(convertorArabico.converteValor( new ArabicoRomano("MMMCDLXXVII") ).getArabico() );
		System.out.println(convertorArabico.converteValor( new ArabicoRomano("MCDXLIV") ).getArabico() );
		System.out.println(convertorArabico.converteValor( new ArabicoRomano("CMXCIX") ).getArabico() );
	}
}

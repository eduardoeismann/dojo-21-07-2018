
public class ConverteValorParaRomano implements ConverteValor {

	private int decrementaNumero;
	private String valorRomano;
	
	@Override
	public ArabicoRomano converteValor(ArabicoRomano valorParaConverter) {
		decrementaNumero = valorParaConverter.getArabico();
		valorRomano = "";		
		
		for(ValoresRomanos v : ValoresRomanos.values()){
			verificaNumero(v.valor, v.valorMenor, v.valorRomano, v.valorRomanoMenor);
		}
		
		valorParaConverter.setRomano(valorRomano);
		
		return valorParaConverter;
	}

	public void verificaNumero(int valorCalculado, int valorMenor, String numeroRomanoCalculado, String numeroRomanoMenor){
		int contadorRepeticoes = 0;
		
		while(decrementaNumero - valorCalculado >= 0 && contadorRepeticoes < 3 ){
			contadorRepeticoes++;
			decrementaNumero -= valorCalculado;
			valorRomano += numeroRomanoCalculado;
		}
		
		if(valorMenor > 0){
			if(decrementaNumero >= valorCalculado - valorMenor){
				valorRomano += numeroRomanoMenor;
				valorRomano += numeroRomanoCalculado;
				decrementaNumero = decrementaNumero - (valorCalculado-valorMenor);
			}
		}
		
		contadorRepeticoes = 0;		
	}
}

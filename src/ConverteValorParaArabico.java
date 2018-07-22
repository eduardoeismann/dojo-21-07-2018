
public class ConverteValorParaArabico implements ConverteValor {

	private Integer somatorioArabico;
	private String valorRomano;
	private ValoresRomanos[] valores;
	
	@Override
	public ArabicoRomano converteValor(ArabicoRomano valorParaConverter) {
		somatorioArabico = 0;
		valorRomano = valorParaConverter.getRomano();
		valores = ValoresRomanos.values();
		
		String par = "";
		Integer valorPar = 0;
		
		for(ValoresRomanos v : valores){
			if(v.valorMenor > 0){
				par = v.valorRomanoMenor + v.valorRomano;
				valorPar = v.valor - v.valorMenor;
				
				if(valorRomano.contains(par)){
					somatorioArabico += valorPar;
					valorRomano = valorRomano.replaceAll(par, "");
				}
			}
		}
			
		for(String letra : valorRomano.split("")){
			for(ValoresRomanos v : valores){
				if(letra.equals(v.valorRomano)){
					somatorioArabico += v.valor;
				}
			}
		}
		
		valorParaConverter.setArabico(somatorioArabico);
		return valorParaConverter;
	}
}

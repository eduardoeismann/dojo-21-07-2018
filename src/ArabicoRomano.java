
public class ArabicoRomano {

	private Integer arabico;
	private String romano;
	
	public ArabicoRomano(String romano) {
		this.romano = romano;
	}	
	
	public ArabicoRomano(Integer arabico) {
		this.arabico = arabico;
	}

	public Integer getArabico() {
		return arabico;
	}

	public void setArabico(Integer arabico) {
		this.arabico = arabico;
	}

	public String getRomano() {
		return romano;
	}

	public void setRomano(String romano) {
		this.romano = romano;
	}
}

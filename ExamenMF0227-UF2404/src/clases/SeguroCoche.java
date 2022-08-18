package clases;

import java.util.Calendar;

public class SeguroCoche extends Poliza {

	protected String matricula;
	protected int anyoCarnet;
	
	

	public SeguroCoche() {
		super();
	}

	public SeguroCoche(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistorico, String matricula, int anyoCarnet) {
		super(idPoliza, nombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestrosHistorico);
		this.matricula = matricula;
		this.anyoCarnet = anyoCarnet;
	}




	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public int getAnyoCarnet() {
		return anyoCarnet;
	}



	public void setAnyoCarnet(int anyoCarnet) {
		this.anyoCarnet = anyoCarnet;
	}

	
	
	

	@Override
	public String toString() {
		return "SeguroCoche [idPoliza=" + idPoliza + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", dni=" + dni + ", anyo=" + anyo + ", formaPago="
				+ formaPago + ", primaBase=" + primaBase + ", numSiniestrosHistorico=" + numSiniestrosHistorico
				+ ", matricula=" + matricula + ", anyoCarnet=" + anyoCarnet + "]";
	}

	@Override
	public double calcularPrima() {
		double prima = this.getPrimaBase();
		int anyo = this.getAnyo();
		
		int anyoCarnet = this.getAnyoCarnet()-Calendar.getInstance().get(Calendar.YEAR);
		
		int siniestros = this.getNumSiniestrosHistorico();
		
		if(anyo>=1) {
			for(int i=1;i<=10;i++) {
				prima=prima-((prima*1.5)/100);
			}
			
		}
		
		if(anyoCarnet<5) {
			prima=prima+75;
		}
		
		if(siniestros>=1) {
			for(int i=1; i<=siniestros; i++) {
				prima=prima+((prima*3)*100);
			}
		}
		
		return prima;
	}

}

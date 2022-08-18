package clases;

public class PruebaSeguro {

	public static void main(String[] args) {
		SeguroCoche sc = new SeguroCoche();
		
		System.out.println(sc);
		
		SeguroCoche sc1 = new SeguroCoche("111", "David", "Apruebame", "101010", 2022, "Mensual", 5, 0, "123456A", 2010);
		
		System.out.println(sc1);
		
		System.out.println(sc1.calcularPrima());
		
		sc1.setNumSiniestrosHistorico(5);
		sc1.setPrimaBase(2);
		sc1.setAnyoCarnet(2020);
		
		System.out.println(sc1.calcularPrima());

	}

}

package validAPP;

public final class Loja {
	private String cnpj;
	private Estoque estoque;
	private static Loja instanciaLoja;
	
	private Loja(String cnpj, Estoque estoque) {
		this.cnpj = cnpj;
		this.estoque = estoque;
	}
	
	public static Loja getLoja() {
		if (instanciaLoja != null)
			return instanciaLoja;
		
		Estoque E = new Estoque();
		
		E.criar_e_adicionar_lote_ao_estoque("limao", 15.50, "frutas", 7, "10/10/2022", "C0D09", "setor 10");
		E.criar_e_adicionar_lote_ao_estoque("uva", 15.50, "frutas", 5, "10/10/2024", "C0D010", "setor 10");
		E.criar_e_adicionar_lote_ao_estoque("maca", 5.00, "frutas", 5, "10/07/2023", "C0D011", "setor 10");

		instanciaLoja = new Loja("00220000", E);

		return instanciaLoja;
	}
	
	public Estoque getEstoque() {
		return this.estoque;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
}

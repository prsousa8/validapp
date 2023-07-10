 package validAPP;

public final class Loja {
	//ATRIBUTOS
	private String cnpj;
	private Estoque estoque;
	private static Loja instanciaLoja;
    private AdapterSetter adapterSetter;
	
	//METODO CONSTRUTOR
	private Loja(String cnpj, Estoque estoque) {
		this.cnpj = cnpj;
		this.estoque = estoque;
	}
	
	//MÉTODOS
	public static Loja getLoja() {
		if (instanciaLoja != null)
			return instanciaLoja;
		
		Estoque estoque = new Estoque();
		
		estoque.criar_e_adicionar_lote_ao_estoque("limao", 15.50, "frutas", 7, "10/10/2022", "C0D09", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("uva", 15.50, "frutas", 5, "10/10/2024", "C0D010", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("maca", 5.00, "frutas", 5, "13/07/2023", "C0D011", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("arroz", 5.50, "alimentos", 7, "10/10/2021", "C0D08", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("feijao", 5.00, "alimentos", 7, "10/12/2022", "C0D07", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("leite", 5.50, "alimentos", 7, "10/10/2023", "C0D08", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("milho", 5.00, "alimentos", 7, "10/12/2023", "C0D07", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("macarao", 5.50, "alimentos", 7, "30/07/2023", "C0D08", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("refrigerante", 5.00, "bebidas", 7, "02/08/2023", "C0D07", "setor 10");
		estoque.criar_e_adicionar_lote_ao_estoque("pao", 5.00, "alimentos", 7, "01/08/2023", "C0D07", "setor 10");
		
		instanciaLoja = new Loja("00220000", estoque);

		return instanciaLoja;
	}
	
	public Estoque getEstoque() {
		return this.estoque;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setEstoque(Estoque estoque) {
		adapterSetter.instanciarClasse();
	}	
}

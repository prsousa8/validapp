package validAPP;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Lote implements Comparable<Lote>{
	//ATRIBUTOS
	public int qtdProdutos;
	public String numero;
	public String validade;
	public String localidade;
	public ArrayList<Produto> produtos;
	public long diasRestantes;
	
	//METODO CONSTRUTOR
	public Lote(ArrayList<Produto> produtos, String validade, String numeroLote, String localidade, int qtdProdutos) {
		this.produtos = produtos;
		this.numero = numeroLote;
		this.validade = validade;
		this.localidade = localidade;
		this.qtdProdutos = qtdProdutos;
		DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataAtual = LocalDate.now();
		LocalDate validadeDoLote = LocalDate.parse(this.validade, formatacaoData);
		this.diasRestantes = ChronoUnit.DAYS.between(dataAtual, validadeDoLote);
	}
	
	//MÉTODOS
	
	@Override
	public int compareTo(Lote lote) {
		if (this.diasRestantes > lote.diasRestantes){ 
			return 1; 
		}if (this.diasRestantes < lote.diasRestantes){ 
			return -1; 
		}
		return 0; 
	}
	
}
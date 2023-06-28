package validAPP;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Lote {
	
	//ATRIBUTOS
	public String nome;
	public String validade;
	public String localidade;
	public int quantidade;
	
	public Lote(String nome, String validade, String localidade, int quantidade) {
		this.nome = nome;
		this.validade = validade;
		this.localidade = localidade;
		this.quantidade = quantidade;
	}
	
	public long quantDeDiasRestantes(String validade) {
		DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataAtual = LocalDate.now();
		LocalDate validadeDoLote = LocalDate.parse(validade, formatacaoData);
		long quantDiasRestantes = ChronoUnit.DAYS.between(dataAtual, validadeDoLote);
		return quantDiasRestantes; 
	}
	
}


public enum Commands {

	REGISTA(" - regista um novo colaborador\n"),
	STAFF(" - lista os colaboradores registados\n"),
	CENARIO(" - regista um novo local para gravacoes\n"),
	CENARIOS(" - lista os locais para gravacoes registados\n"),
	MARCA(" - marca uma nova gravacao\n"),
	AMUA(" - vedeta deixa de trabalhar com colaborador\n"),
	RECONCILIA(" - vedeta faz as pazes com colaborador\n"),
	REALIZADOS(" - lista as gravacoes realizadas\n"),
	PREVISTAS(" - lista as gravacoes previstas\n"),
	LOCAL(" - lista as gravacoes previstas para um local\n"),
	COLABORADOR(" - lista as gravacoes previstas para um colaborador\n"),
	GRAVA(" - executa a proxima gravacao agendada\n"),
	AMUANCOS(" - lista os colaboradores com quem uma vedeta esta amuada\n"),
	AJUDA(" - Mostra a ajuda\n"),
	SAI(" - Termina a execucao do programa\n");
	
	private String c;
	
	private Commands(String c) {
		this.c = c;
	}
	
	public String getString() {
		return c;
	}
	
	
	
}

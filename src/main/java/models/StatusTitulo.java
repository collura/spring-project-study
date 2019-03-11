package models;

public enum StatusTitulo {
	PENDENTE ("Pendente"),
	RECEBIDO ("Recebido");
	
	private String descricao;
	
	StatusTitulo(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescrição() {
		return descricao;
	}

}

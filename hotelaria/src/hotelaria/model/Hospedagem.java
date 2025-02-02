package hotelaria.model;

import java.sql.Date;

public class Hospedagem {
	private Integer codHospedagem;
	private Integer codChale;
	private Integer codCliente;
	private String estado;
	private Date dataInicio;
	private Date dataFim;
	private Integer qtdPessoas;
	private Double desconto;
	private Double valorFinal;
	public Integer getCodHospedagem() {
		return codHospedagem;
	}
	public void setCodHospedagem(Integer codHospedagem) {
		this.codHospedagem = codHospedagem;
	}
	public Integer getCodChale() {
		return codChale;
	}
	public void setCodChale(Integer codChale) {
		this.codChale = codChale;
	}
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Integer getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(Integer qtdePessoas) {
		this.qtdPessoas = qtdePessoas;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
}

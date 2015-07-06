package br.edu.iftm.simuladorDeFinanciamento;

public class Financiamento {
	
	private  Double valorVeiculo;
	private Double entrada;
	private int numPrestacoes;
	private Double taxaJuros, rendaMensal;
	
	public Double getValorVeiculo() {
		return valorVeiculo;
	}
	public void setValorVeiculo(Double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}
	
	public Double getEntrada() {
		return entrada;
	}
	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}
	public int getNumPrestacoes() {
		return numPrestacoes;
	}
	public void setNumPrestacoes(int numPrestacoes) {
		this.numPrestacoes = numPrestacoes;
	}
	public Double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public Double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	
	public Double valorASerFinanciado()
	{
		Double valorFinanciado  = valorVeiculo - entrada;
		return valorFinanciado ;
	}
	
	public Double valorDasPrestacoes()
	{
		Double aux =  ( 1 + taxaJuros );
		Double aux2 = Math.pow(aux, numPrestacoes);
		
		Double prestacao = (valorASerFinanciado() * taxaJuros)/(1-(1/aux2));
						
		return prestacao;
	}
	
	public Double totalASerPago()
	{
		Double total = 0.0;
		if (valorDasPrestacoes() < (rendaMensal*0.4)) 
		{
			
			for (int i = 0; i < numPrestacoes; i++) 
			{
				total = total + valorDasPrestacoes();
				
			}
			System.out.println("FINANCIAMENTO APROVADO!");
		}
		else 
		{
			System.out.println("FINANCIAMENTO NEGADO! "
					+ "\nAs prestações são mais altas que 40 % do salário do cliente ");
		}
		return total;
		
	}
	
	public void informacoes()
	{
		System.out.println("\nValor do Veículo: " + getValorVeiculo());
		System.out.println("Entrada: " + getEntrada());
		System.out.println("Número das prestações: " + getNumPrestacoes());
		System.out.println("Taxa de juros: " + getTaxaJuros());
		System.out.println("Renda Mensal: " + getRendaMensal());
		System.out.println("\nValor a ser Financiado: " + valorASerFinanciado());
		System.out.println("Valor das Prestações: " + valorDasPrestacoes());
		System.out.println("Valor total a ser pago: " + totalASerPago());
		
	}

}

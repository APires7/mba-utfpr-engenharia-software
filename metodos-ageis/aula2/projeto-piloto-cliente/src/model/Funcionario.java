/**
 * 
 */
package model;

/**
 * @author allan
 *
 */
public class Funcionario {

	private Integer codigo;
	private String nome;
	private String endereco;
	private String cidade;
	private String cep;
	private String email;
	private Double salario;

	public Funcionario(Integer codigo, String nome, String endereco, String cidade, String cep, String email,
			Double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.email = email;
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionário - [codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade
				+ ", cep=" + cep + ", email=" + email + ", salario=" + salario + "]";
	}

}

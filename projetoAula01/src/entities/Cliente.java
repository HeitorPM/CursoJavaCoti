//definição do pacote
package entities;

//definição da classe
public class Cliente {

	// atributos privados
	private Integer idCliente;
	private String nome;
	private String email;
	private String cpf;
	// alt + shift +s > r (source > getters e setters)

	// atalho para organizar o conteudo do codigo-fonte ctrl+shift+f

	// método construtor
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	// sobrecarga de construtores (overloading)
	public Cliente(Integer idCliente, String nome, String email, String cpf) {
		// esse super é implícito
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + "]";
	}

}

package projeto.lsi.pojo;

public class Usuario {
	
	private Integer idUsuario;
	private String nome;;
	private String email;
	private String login;
	private String senha;
	
	
		
		
	@Override
	public String toString() {
		return "Usuario [idUsuario: " + idUsuario + ", nome: " + nome + ", email: " + email + ", login: " + login + "]";
	}

	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}
	
	
	
	
	
	
	
	
	

}

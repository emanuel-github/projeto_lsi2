package projeto.lsi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import projeto.lsi.Exception.PersistenciaException;
import projeto.lsi.pojo.Usuario;

public class UsuarioDAO implements GenericoDAO<Usuario>{
	
	private final Connection connection;

	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}

	
	
	

	public void cadastrar(Usuario obj) throws PersistenciaException {
		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement(
					"insert into TB_USUARIO(nome, email, login, senha) values (?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, obj.getNome());
			stmt.setString(2, obj.getEmail());
			stmt.setString(3, obj.getLogin());
			stmt.setString(4, obj.getSenha());
			stmt.execute();
			ResultSet keys = stmt.getGeneratedKeys();
			keys.next();
			int id = keys.getInt("idUsuario");
			obj.setIdUsuario(id);

			connection.close();
			stmt.close();
			keys.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenciaException("Erro de Persistencia");
		}
	}



		
	

	public void atualizar(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	public void deletar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void buscarPorId(Integer id) throws PersistenciaException{
		Usuario usuario;		
		try {
			PreparedStatement stmt =  connection.prepareStatement("select nome, email, login from TB_USUARIO where idUsuario = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				usuario = new Usuario();
				usuario.setIdUsuario(id);
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setLogin(rs.getString("login"));
				System.out.println(usuario);
				connection.close();
				stmt.close();
				rs.close();
			}else{
				throw new PersistenciaException("Erro na busca");
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
			
		
	}
	
	
	

	public void listar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}

package empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.Conexao;

public class Funcionario extends Pessoa {
	private String matricula;
	private String departamento;

	public Funcionario() {
	}

	public Funcionario(int id, String nome, String email, String matriculaFun, String departamentoFun) {
		super(id, nome, email);
		this.matricula = matriculaFun;
		this.departamento = departamentoFun;
	}

	public boolean incluirFuncionario() throws ClassNotFoundException {
		String sql = "INSERT INTO funcionario (id, nome, email, matricula, departamento) VALUES (?, ?, ?, ?, ?)";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, getId());
			stm.setString(2, getNome());
			stm.setString(3, getEmail());
			stm.setString(4, getMatricula());
			stm.setString(5, getDepartamento());
			stm.executeUpdate();
			return true;
		} catch (SQLException erro) {
			System.err.println("Ocorreu um erro ao inserir os dados! " + erro.getMessage());
			return false;
		}

	}

	private String getDepartamento() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getMatricula() {
		// TODO Auto-generated method stub
		return null;
	}
}


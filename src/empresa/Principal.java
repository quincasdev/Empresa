package empresa;

public class Principal {
	public static void main(String[] args) throws ClassNotFoundException {
		Funcionario func = new Funcionario(11, "Richard", "yalberto123@gmail.com", "F011", "TI");
		if (func.incluirFuncionario()) {
			System.out.println("");
			System.out.println("Funcionário inserido com sucesso!");
		}

	}
}

package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.FuncionarioRepository;

public class FuncionarioRepositoryCsv implements FuncionarioRepository {
	
	@Override
	public void exportarDados(Funcionario funcionario) {

		try {
			
			var printWriter = new PrintWriter("funcionario " + funcionario.getId() + ".csv");

			
			printWriter.write("ID, Nome, CPF, Matrícula, Salário, Setor ID, Setor Descrição, Função ID, Função Nome\n");

			printWriter.write(funcionario.getId() + ",");
			printWriter.write(funcionario.getNome() + ",");
			printWriter.write(funcionario.getCpf() + ",");
			printWriter.write(funcionario.getMatricula() + ",");
			printWriter.write(funcionario.getSalario() + ",");
			printWriter.write(funcionario.getSetor().getId() + ",");
			printWriter.write(funcionario.getSetor().getDescricao() + ",");
			printWriter.write(funcionario.getFuncao().getId() + ",");
			printWriter.write(funcionario.getFuncao().getNome() + "\n");

			printWriter.close();

			System.out.println("\nARQUIVO CSV GRAVADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nERRO: " + e.getMessage());
		}
	}
}

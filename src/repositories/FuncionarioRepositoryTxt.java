package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.FuncionarioRepository;


public class FuncionarioRepositoryTxt implements FuncionarioRepository{
	
	@Override
	public void exportarDados(Funcionario funcionario) {
		
		try {
			var printWriter = new PrintWriter("funcionario " + funcionario.getId() + ".txt");
			
			printWriter.write("\n" + funcionario.getId());
			printWriter.write("\n" + funcionario.getNome());
			printWriter.write("\n" + funcionario.getCpf());
			printWriter.write("\n" + funcionario.getMatricula());
			printWriter.write("\n" + funcionario.getSalario());
			printWriter.write("\n" + funcionario.getSetor().getId());
			printWriter.write("\n" + funcionario.getSetor().getDescricao());
			printWriter.write("\n" + funcionario.getFuncao().getId());
			printWriter.write("\n" + funcionario.getFuncao().getNome());
			
			printWriter.close();
			
			System.out.println("\nARQUIVO TXT GRAVADO COM SUCESSO!");
		}
		catch(Exception e) {
			
			System.out.println("\nERRO: " + e.getMessage());
		}
	}
}

package controllers;

import javax.swing.JOptionPane;

import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import interfaces.FuncionarioRepository;
import repositories.FuncionarioRepositoryCsv;
import repositories.FuncionarioRepositoryTxt;

public class FuncionarioController {

	public void cadastrarFuncionario() {

		var funcionario = obterDadosFuncionario();

		funcionario.setSetor(obterDadosSetor());
		funcionario.setFuncao(obterDadosFuncao());

		FuncionarioRepository funcionarioRepository = null;

		var tipo = JOptionPane.showInputDialog("ESCOLHA (1)TXT ou (2)CSV:");
		switch (tipo) {
		case "1":
			funcionarioRepository = new FuncionarioRepositoryTxt(); // POLIMORFISMO
			break;
		case "2":
			funcionarioRepository = new FuncionarioRepositoryCsv(); // POLIMORFISMO
			break;
		}
		funcionarioRepository.exportarDados(funcionario);

	}

	private Funcionario obterDadosFuncionario() {

		var funcionario = new Funcionario();

		funcionario.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do funcionário")));
		funcionario.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário:"));
		funcionario.setCpf(JOptionPane.showInputDialog("Informe o CPF do funcionário:"));
		funcionario.setMatricula(JOptionPane.showInputDialog("Informe a matrícula do funcionário:"));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário:")));

		return funcionario;
	}

	private Setor obterDadosSetor() {

		var setor = new Setor();

		setor.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do setor do funcionário")));
		setor.setDescricao(JOptionPane.showInputDialog("Informe a descrição do setor do funcionário"));

		return setor;
	}

	private Funcao obterDadosFuncao() {

		var funcao = new Funcao();

		funcao.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da função do funcionário")));
		funcao.setNome(JOptionPane.showInputDialog("Informe o nome da função do funcionário"));

		return funcao;
	}
}

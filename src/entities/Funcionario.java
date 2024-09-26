package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Funcionario extends Pessoa{
	
	private String cpf;
	private String Matricula;
	private Double salario;
	private Setor setor;
	private Funcao funcao;

}

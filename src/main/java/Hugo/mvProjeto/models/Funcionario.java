package Hugo.mvProjeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Funcionario {
	
//	nome , cpf , alimento
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_funcionario;
	
	@Column(nullable = false, length = 14 , unique = true )
	private String func_cpf;
	
	@Column(nullable = false, length = 60)
	private String func_nome;
	
	@Column(nullable = false, length = 60 , unique = true)
	private String func_alimento;

	

	public Integer getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Integer id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getFunc_cpf() {
		return func_cpf;
	}

	public void setFunc_cpf(String func_cpf) {
		this.func_cpf = func_cpf;
	}

	public String getFunc_nome() {
		return func_nome;
	}

	public void setFunc_nome(String func_nome) {
		this.func_nome = func_nome;
	}

	public String getFunc_alimento() {
		return func_alimento;
	}

	public void setFunc_alimento(String func_alimento) {
		this.func_alimento = func_alimento;
	}
	
	
	
	


}

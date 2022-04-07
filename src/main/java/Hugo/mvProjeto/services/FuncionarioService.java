package Hugo.mvProjeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hugo.mvProjeto.models.Funcionario;
import Hugo.mvProjeto.repositorys.FuncionarioRepository;
import Hugo.mvProjeto.services.exceptions.ObjectNotFoundException;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
//	GET todos funcionários
	public List<Funcionario> mostrarTodosFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	
//	Get de um só funcionário

	public Funcionario buscarUmFuncionario(Integer id_funcionario) {
		Optional<Funcionario> funcionario = funcionarioRepository.findById(id_funcionario);
		return funcionario.orElseThrow(()-> new ObjectNotFoundException("Funcionário não encontrado!"));

	}
	
	
// 	Cadastrar funcionário
	public Funcionario cadastrarFuncionario(Funcionario funcionario) {
		funcionario.setId_funcionario(null);
		return funcionarioRepository.save(funcionario);
	}
	
		
//	DELETE funcionário
	public void deletarUmFuncionario(Integer id_funcionario) {
		funcionarioRepository.deleteById(id_funcionario);
	}
	
	
	
//	PUT funcionário
	public Funcionario editarFuncionario(Funcionario funcionario) {
		buscarUmFuncionario(funcionario.getId_funcionario());
		return funcionarioRepository.save(funcionario);
	}
	
	


}

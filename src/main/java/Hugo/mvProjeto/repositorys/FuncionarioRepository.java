package Hugo.mvProjeto.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import Hugo.mvProjeto.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {

}

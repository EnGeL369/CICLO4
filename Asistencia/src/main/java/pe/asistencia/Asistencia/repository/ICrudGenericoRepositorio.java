package pe.asistencia.Asistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean

public interface ICrudGenericoRepositorio<T,ID> extends JpaRepository<T,ID> {

}

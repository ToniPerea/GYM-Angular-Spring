package apigym.springapigym.models.dao;

import apigym.springapigym.models.entity.TableExercise;
import org.springframework.data.repository.CrudRepository;

public interface ITableExercise extends CrudRepository<TableExercise, Long> {
}

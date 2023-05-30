package apigym.springapigym.models.dao;

import apigym.springapigym.models.entity.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface IExerciseDao extends CrudRepository<Exercise, Long> {

}

package apigym.springapigym.models.dao;

import apigym.springapigym.models.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<User, Long> {
}

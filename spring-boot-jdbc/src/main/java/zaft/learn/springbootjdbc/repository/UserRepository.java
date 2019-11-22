package zaft.learn.springbootjdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zaft.learn.springbootjdbc.domain.User;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.Collections;

/**
 *user 仓储
 * @CLASS UserRepository
 * @Description: TODO 
 * @Author zaft_x
 * @Date 2019/11/22 0022
 * @Version V1.0
**/
@Repository
public class UserRepository {

  /*  @Autowired
    private DataSource dataSource;*/

    /*
    构造器注入
     */
    private final DataSource dataSource;

    @Autowired
    public UserRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }


    public boolean save(User user){
        return true;
    }

    public Collection<User> findAll(){
        return Collections.emptyList();
    }
}

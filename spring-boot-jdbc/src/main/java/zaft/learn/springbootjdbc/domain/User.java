package zaft.learn.springbootjdbc.domain;

/**
 *用户模型
 * @ClassName User
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/22 0022
 * @Version V1.0
 **/
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

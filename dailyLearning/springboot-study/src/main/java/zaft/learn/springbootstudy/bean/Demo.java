package zaft.learn.springbootstudy.bean;

/**
 * @ClassName Demo
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/21 0021
 * @Version V1.0
 **/
public class Demo {
    private long id;//主键.
    private String name;//测试名称.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

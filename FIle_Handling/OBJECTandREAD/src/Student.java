import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public String get_name(){
        return this.name;
    }
    public Integer get_id(){
        return this.id;
    }
}

package org.example;

public class Author {
    private String first_name;
    private String last_name;
    private String mid_name;
    private Integer id;
    private String phone_no;

    public Author(String first_name,String mid_name,String last_name,Integer id,String phone_no) {
        setId(id);
        setFirst_name(first_name);
        setMid_name(mid_name);
        setLast_name(last_name);
        setPhone_no(phone_no);
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMid_name() {
        return mid_name;
    }

    public void setMid_name(String mid_name) {
        this.mid_name = mid_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }


}

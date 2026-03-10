package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AUTHOR {
    @Id
    private int id;
    private String f_name;
    private String m_name;
    private String l_name;
    private String phone_no;
    public AUTHOR(){}

    public AUTHOR(int id, String f_name, String m_name, String l_name, String phone_no) {
        this.id = id;
        this.f_name = f_name;
        this.m_name = m_name;
        this.l_name = l_name;
        this.phone_no = phone_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}

package br.com.springjsf.entity;

import br.com.springjsf.internal.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "usuario")
public class Usuario extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 7102680807687025966L;

    public String nome;
    private String login;
    private String password;
    private List<Role> roles;

Usuario(){

}


    @Override
    public Integer getId() {
        return id;
    }
}

package br.com.springjsf.entity;

import br.com.springjsf.internal.base.BaseEntity;

import java.io.Serializable;

public class Role extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -5279859219121793645L;





    @Override
    public Integer getId() {
        return id;
    }
}

package com.july.springboot.model.entity;

import java.io.Serializable;

/**
 * 2017/1/3.
 */
public class Entity implements Serializable {

    /**
     * 主键ID
     */
    protected long id;

    public Entity() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}

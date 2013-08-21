package com.SIWE.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class NewsType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5238116003588756956L;

	
	/** 定义id */
	@Id
	@GeneratedValue
    private int id;
    /** 定义新闻类别名*/
	
	@Column(length = 32)
    private String name;
	/** 默认的构造函数 */
    public NewsType() {
    }
    /** 设定id的相关属性
     */
    public int getId() {
        return this.id ;
    }
    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }
    /** 设定新闻类别的名称的相关属性
     */
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

package com.SIWE.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2489739224080006740L;

	
	@Id
	@GeneratedValue
    private int id;
	
	
	@Column(length = 20)
    private String username;
	
	@Column(length = 20)
    private String password;
	
	@Column(length = 20)
    private String siwegroup;
	
	@Column(length = 20)
	private String userSex;
	
	@Column(length = 20)
	private String userPhone;
	
	@Column(length = 20)
	private String userOICQ;
	
	@Column(length = 20)
	private String userEmail;	

	@Column(length = 20)
	private String userFrom;
	
	   /** 构造函数*/
    public User(int id, String username, String password, String siwegroup) {
        this.id = id;
    	this.username = username;
        this.password = password;
        this.siwegroup =siwegroup;
    }
    /** 默认的构造函数 */
    public User() {
    	
    }
	
    /** 设定id的相关属性
     */
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    /** 设定用户名的相关属性
     */
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    /** 设定密码的相关属性 
     */
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    /** 设定群组相关属性
     */
    public String getSiwegroup() {
        return this.siwegroup;
    }
    public void setSiwegroup(String siwegroup) {
        this.siwegroup = siwegroup;
    }
    
    
    /*
     * 
     * 后加的属性
     * 
     * */
    
    public String getUserSex() {
        return this.userSex;
    }
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    
    public String getUserPhone() {
        return this.userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    
    public String getUserOICQ() {
        return this.userOICQ;
    }
    
    public void setUserOICQ(String userOICQ) {
        this.userOICQ = userOICQ;
    }
    
    public String getUserEmail() {
        return this.userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public String getUserFrom() {
        return this.userFrom;
    }
    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

	
}

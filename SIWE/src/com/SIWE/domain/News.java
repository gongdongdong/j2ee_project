package com.SIWE.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;


@Entity
public class News implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4521446009436541132L;
	
	/** 定义id */
	@Id
	@GeneratedValue
    private int id;
    /** 定义新闻的标题*/
	
	@Column(length = 200)
    private String title;
	/** 定义新闻的正文*/
	
	@Column(length = 7000)
    private String content;
	/** 定义新闻的发布日期*/
	@Column(length = 20)
    private String releaseDate;
	@Column(length = 20)
	private String newsClass;
/*	*//** 定义作者*//*
	@ManyToOne
	@JoinColumn(name="user_Id")
    private int userId;
	*//** 定义新闻类别*//*
	@ManyToOne
	@JoinColumn(name="newsType_Id")
    private int newsTypeId;*/
	
	
	@ManyToOne
	@JoinColumn(name="newsType_Id")
	private NewsType newsType;
	
	
	@ManyToOne
	@JoinColumn(name="user_Id")
	private User user;
	/** 默认的构造函数 */
    public News() {
    }
    /** 设定id的相关属性
     */
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
	//设定该新闻的正文
	public void setContent(String content) {
		this.content = content;
	}
	//获取该新闻的正文
	public String getContent() {
		return content;
	}
	//设定该新闻的标题
	public void setTitle(String title) {
		this.title = title;
	}
	//获取该新闻的标题
	public String getTitle() {
		return title;
	}
	//设定该新闻的发布日期
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	//获取该新闻的发布日期
	public String getReleaseDate() {
		return releaseDate;
	}
	//设定该新闻的作者
/*	public void setUserId(int userId) {
		this.userId = userId;
	}
	//获取该新闻的作者
	public int getUserId() {
		return userId;
	}
		
	//设定该新闻的类别
	public void setNewsTypeId(String newsTypeId) {
		this.newsTypeId = Integer.parseInt(newsTypeId);
	}
	//获取该新闻的类别
	public int getNewsTypeId() {
		return newsTypeId;
	}
	*
	*
	*
	*/
	
	public void setNewsClass(String newsClass){
		this.newsClass = newsClass;
	}
	
	public String getNewsClass(){
		return this.newsClass;
	}
	
	//设定该新闻的类别
	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}
	//获取该新闻的类别
	public NewsType getNewsType() {
		return newsType;
	}
	
	
	public void setUser(User user) {
		this.user = user;
	}
	//获取该新闻的类别
	public User getUser() {
		return user;
	}
	
	
}

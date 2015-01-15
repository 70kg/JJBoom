package com.example.Util;

import java.io.Serializable;
import java.util.ArrayList;

import android.graphics.Bitmap;

public class Entity implements Serializable {
	String name;
	String content;
	ArrayList<String> weibo_pic;
	String user_pic;
	Entity2 entity2;
	String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<String> getWeibo_pic() {
		return weibo_pic;
	}
	public void setWeibo_pic(ArrayList<String> weibo_pic) {
		this.weibo_pic = weibo_pic;
	}
	public String getUser_picl() {
		return user_pic;
	}
	public void setUser_picl(String user_picl) {
		this.user_pic = user_picl;
	}
	public Entity2 getEntity2() {
		return entity2;
	}
	public void setEntity2(Entity2 entity2) {
		this.entity2 = entity2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}

package com.eyeieye.melody.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * SNA架构中,此对象表示在cookie中持久化的会员,此对象只包含了最常使用的会员数据,并且在结构上一个扁平的简单对象
 * 
 * @author fish
 * 
 */
public class UserAgent implements Serializable {
	private static final long serialVersionUID = -1830859706881331312L;

	public static final String UserAgentTag = "userAgent";

	private String realName;// 姓名
	private String province;// User.NativePlace.province
	private String city;// //User.NativePlace.city
	private Date loginTime;// 登录时间

	public UserAgent() {
		super();
	}

	public UserAgent(User u) {
		super();
		this.setRealName(u.getRealName());
		this.setProvince(u.getNativePlace().getProvince());
		this.setCity(u.getNativePlace().getCity());
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	private static final char Seq = '|';

	/**
	 * 把自己持久化成string串
	 */
	public String lieDown() {
		// 注意,此demo假设用户名,地区的字符串中不会出现 | 这个字符,所有简单的使用作为分隔符
		StringBuilder sb = new StringBuilder();
		sb.append(this.realName).append(Seq);
		sb.append(this.province).append(Seq);
		sb.append(this.city).append(Seq);
		sb.append(Long.toString(this.loginTime.getTime(), 32));// 32进制表示long,长度比较短
		return sb.toString();
	}
}

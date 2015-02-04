package com.jb.cdjj.email.kknd713.entity;

import java.util.Date;

public class MailUser {
	private int id;
	private String realName;
	private String loginName;
	private String password;
	private Position position;
	private boolean enabled;
	private boolean activated;
	private String safeMail;
	private String safeMailTemp;
	private String safeMailCode;
	private Date safeMailCodeTime;
	private String signature;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public String getSafeMail() {
		return safeMail;
	}
	public void setSafeMail(String safeMail) {
		this.safeMail = safeMail;
	}
	public String getSafeMailTemp() {
		return safeMailTemp;
	}
	public void setSafeMailTemp(String safeMailTemp) {
		this.safeMailTemp = safeMailTemp;
	}
	public String getSafeMailCode() {
		return safeMailCode;
	}
	public void setSafeMailCode(String safeMailCode) {
		this.safeMailCode = safeMailCode;
	}
	public Date getSafeMailCodeTime() {
		return safeMailCodeTime;
	}
	public void setSafeMailCodeTime(Date safeMailCodeTime) {
		this.safeMailCodeTime = safeMailCodeTime;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public MailUser(int id, String realName, String loginName, String password,
			Position position, boolean enabled, boolean activated,
			String safeMail, String safeMailTemp, String safeMailCode,
			Date safeMailCodeTime, String signature) {
		super();
		this.id = id;
		this.realName = realName;
		this.loginName = loginName;
		this.password = password;
		this.position = position;
		this.enabled = enabled;
		this.activated = activated;
		this.safeMail = safeMail;
		this.safeMailTemp = safeMailTemp;
		this.safeMailCode = safeMailCode;
		this.safeMailCodeTime = safeMailCodeTime;
		this.signature = signature;
	}
	public MailUser() {
		super();
	}
	
	
}

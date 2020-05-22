package com.huangwenbo.bean;

public class Info {
	private Integer inid;
	private String iname;
	private String uptime;
	private Integer status;
	private Integer tid;
	private String tname;
	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Info(Integer inid, String iname, String uptime, Integer status, Integer tid, String tname) {
		super();
		this.inid = inid;
		this.iname = iname;
		this.uptime = uptime;
		this.status = status;
		this.tid = tid;
		this.tname = tname;
	}
	public Integer getInid() {
		return inid;
	}
	public void setInid(Integer inid) {
		this.inid = inid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Info [inid=" + inid + ", iname=" + iname + ", uptime=" + uptime + ", status=" + status + ", tid=" + tid
				+ ", tname=" + tname + "]";
	}
	
}

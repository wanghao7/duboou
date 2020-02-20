package com.wanghao.entity;

public class Condition {

	private String dt1;
	private String dt2;
	private String tj;
	
	public String getDt1() {
		return dt1;
	}
	public void setDt1(String dt1) {
		this.dt1 = dt1;
	}
	public String getDt2() {
		return dt2;
	}
	public void setDt2(String dt2) {
		this.dt2 = dt2;
	}
	public String getTj() {
		return tj;
	}
	public void setTj(String tj) {
		this.tj = tj;
	}
	public Condition(String dt1, String dt2, String tj) {
		super();
		this.dt1 = dt1;
		this.dt2 = dt2;
		this.tj = tj;
	}
	public Condition() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Condition [dt1=" + dt1 + ", dt2=" + dt2 + ", tj=" + tj + "]";
	}
	
	
	
	
}

package com;

public class Dept {
	private transient String dName;
	private transient String dLoc;
	private int deptNo;

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Dept(int deptNo, String dName, String dLoc) {
		super();
		this.deptNo = deptNo;
		this.dName = dName;
		this.dLoc = dLoc;

	}
}

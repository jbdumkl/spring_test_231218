package com.mkl.test.inout;

public class JoinMember {

	private String joinID;
	private String joinPw;
	private String joinName;
	private String joinEmail;
	
	public JoinMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JoinMember(String joinId, String joinPw, String joinName, String joinEmail) {
		super();
		this.joinID = joinId;
		this.joinPw = joinId;
		this.joinName = joinName;
		this.joinEmail = joinEmail;
		
	}
	
	public String getJoinID() {
		return joinID;
	}
	public void setJoinID(String joinID) {
		this.joinID = joinID;
	}
	public String getJoinPw() {
		return joinPw;
	}
	public void setJoinPw(String joinPw) {
		this.joinPw = joinPw;
	}
	public String getJoinName() {
		return joinName;
	}
	public void setJoinName(String joinName) {
		this.joinName = joinName;
	}
	public String getJoinEmail() {
		return joinEmail;
	}
	public void setJoinEmail(String joinEmail) {
		this.joinEmail = joinEmail;
	}
	
}
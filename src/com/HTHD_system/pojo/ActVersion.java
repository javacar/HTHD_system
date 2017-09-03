package com.HTHD_system.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ActVersion implements Serializable {

	private int avid;
	private Date start;
	private Date end;
	private Date appStart;
	private Date appEnd;
	private Date voteStart;
	private Date voteEnd;
	private Date guessStart;
	private Date guessEnd;
	private String avversion;
	private Integer baseVote;
	private Integer maxVote;
	private String trailer;

	private TVProgarm progarm;

	public ActVersion() {

	}
	public String getAvversion() {
		return avversion;
	}
	public void setAvversion(String avversion) {
		this.avversion = avversion;
	}

	
	public int getAvid() {
		return avid;
	}
	public void setAvid(int avid) {
		this.avid = avid;
	}
	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}

	public Date getAppStart() {
		return appStart;
	}

	public Date getAppEnd() {
		return appEnd;
	}

	public Date getVoteStart() {
		return voteStart;
	}

	public Date getVoteEnd() {
		return voteEnd;
	}

	public Date getGuessStart() {
		return guessStart;
	}

	public Date getGuessEnd() {
		return guessEnd;
	}

	
	public Integer getBaseVote() {
		return baseVote;
	}

	public Integer getMaxVote() {
		return maxVote;
	}

	public String getTrailer() {
		return trailer;
	}

	public TVProgarm getProgarm() {
		return progarm;
	}



	public void setStart(Date start) {
		this.start = start;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public void setAppStart(Date appStart) {
		this.appStart = appStart;
	}

	public void setAppEnd(Date appEnd) {
		this.appEnd = appEnd;
	}

	public void setVoteStart(Date voteStart) {
		this.voteStart = voteStart;
	}

	public void setVoteEnd(Date voteEnd) {
		this.voteEnd = voteEnd;
	}

	public void setGuessStart(Date guessStart) {
		this.guessStart = guessStart;
	}

	public void setGuessEnd(Date guessEnd) {
		this.guessEnd = guessEnd;
	}



	public void setBaseVote(Integer baseVote) {
		this.baseVote = baseVote;
	}

	public void setMaxVote(Integer maxVote) {
		this.maxVote = maxVote;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public void setProgarm(TVProgarm progarm) {
		this.progarm = progarm;
	}

}

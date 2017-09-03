package com.HTHD_system.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class TVProgarm  implements Serializable {
 private Integer tvpId;
     private String tvpName;
     private Integer tvpStatus;
     private String description;
     private String tvpPic;
     private int tvpSN;
 
	public TVProgarm() {
		
	}

	public int getTvpSN() {
		return tvpSN;
	}

	public void setTvpSN(int tvpSN) {
		this.tvpSN = tvpSN;
	}

	public String getTvpPic() {
		return tvpPic;
	}

	public void setTvpPic(String tvpPic) {
		this.tvpPic = tvpPic;
	}

	public Integer getTvpId() {
        return this.tvpId;
    }
    
    public void setTvpId(Integer tvpId) {
        this.tvpId = tvpId;
    }

    public String getTvpName() {
        return this.tvpName;
    }
    
    public void setTvpName(String tvpName) {
        this.tvpName = tvpName;
    }

    public Integer getTvpStatus() {
        return this.tvpStatus;
    }
    
    public void setTvpStatus(Integer tvpStatus) {
        this.tvpStatus = tvpStatus;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

   








}
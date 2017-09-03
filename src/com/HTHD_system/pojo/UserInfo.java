package com.HTHD_system.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class UserInfo implements Serializable {
	private Integer id;// 用户ID
	private String name;// 用户名
	private String trueName;// 姓名
	private String move; // 用户迁移码
	private Integer sex;// 用户性别（0：女 1：男）
	private Integer age;// 用户年龄
	private String identity;// 身份证号
	private String phone;// 联系电话
	private String address;// 地址
	private Date login;//最后登录时间
	private Date exit;//最后退出时间
	private Date register;//注册时间
	private Integer integral;//积分
	private String mobile;//手机号码
	private String sequence;//序列号
	private String mac;//mac地址
	private String password;//用户密码，序列号和mac地址的拼接
	private String system;//操作系统版本
	private String nickName;//用户昵称
	private String headAddress;//头像地址
	private String mobileBrand;//用户手机品牌
	private String modelNumber;//用户手机型号
	private String changeCode;//用户最后一次改变积分的随机号
	private String apnUsername;//对应apn_user.username字段（起到外键的作用）
	private Date date;//服务器当前时间
	private int dateDiffDay;//时间差
	

	public int getDateDiffDay() {
		return dateDiffDay;
	}
	public void setDateDiffDay(int dateDiffDay) {
		this.dateDiffDay = dateDiffDay;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTrueName() {
		return trueName;
	}
	public String getMove() {
		return move;
	}
	public Integer getSex() {
		return sex;
	}
	public Integer getAge() {
		return age;
	}
	public String getIdentity() {
		return identity;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public Date getLogin() {
		return login;
	}
	public Date getExit() {
		return exit;
	}
	public Date getRegister() {
		return register;
	}
	public Integer getIntegral() {
		return integral;
	}
	public String getMobile() {
		return mobile;
	}
	public String getSequence() {
		return sequence;
	}
	public String getMac() {
		return mac;
	}
	public String getPassword() {
		return password;
	}
	public String getSystem() {
		return system;
	}
	public String getNickName() {
		return nickName;
	}
	public String getHeadAddress() {
		return headAddress;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public String getChangeCode() {
		return changeCode;
	}
	public String getApnUsername() {
		return apnUsername;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setLogin(Date login) {
		this.login = login;
	}
	public void setExit(Date exit) {
		this.exit = exit;
	}
	public void setRegister(Date register) {
		this.register = register;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setHeadAddress(String headAddress) {
		this.headAddress = headAddress;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public void setChangeCode(String changeCode) {
		this.changeCode = changeCode;
	}
	public void setApnUsername(String apnUsername) {
		this.apnUsername = apnUsername;
	}
	
//	<result property="logUid" column="Log_Uid" />
//	<result property="loginTime" column="Login_Time" />
//	<result property="logoutTime" column="Logout_Time" />
//	<result property="ip" column="IP" />
//	<result property="account.accountUid" column="Account_Uid" />
//	<result property="account.name" column="Name" />
//	<result property="account.password" column="Password" />
	
	
	
}

package com.HTHD_system.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class UserInfo implements Serializable {
	private Integer id;// �û�ID
	private String name;// �û���
	private String trueName;// ����
	private String move; // �û�Ǩ����
	private Integer sex;// �û��Ա�0��Ů 1���У�
	private Integer age;// �û�����
	private String identity;// ���֤��
	private String phone;// ��ϵ�绰
	private String address;// ��ַ
	private Date login;//����¼ʱ��
	private Date exit;//����˳�ʱ��
	private Date register;//ע��ʱ��
	private Integer integral;//����
	private String mobile;//�ֻ�����
	private String sequence;//���к�
	private String mac;//mac��ַ
	private String password;//�û����룬���кź�mac��ַ��ƴ��
	private String system;//����ϵͳ�汾
	private String nickName;//�û��ǳ�
	private String headAddress;//ͷ���ַ
	private String mobileBrand;//�û��ֻ�Ʒ��
	private String modelNumber;//�û��ֻ��ͺ�
	private String changeCode;//�û����һ�θı���ֵ������
	private String apnUsername;//��Ӧapn_user.username�ֶΣ�����������ã�
	private Date date;//��������ǰʱ��
	private int dateDiffDay;//ʱ���
	

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

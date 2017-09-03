package com.HTHD_system.dao;

import java.util.List;

import com.HTHD_system.pojo.IOSToken;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.pojo.UserInfo;

public interface IOSTokenDao 
{
	//�˺�(����û�֮����Ӣ��;�ָ� 
List<IOSToken> getUserIDSByUserName(List<String> list);
int getTokensCountByUserName(List<String> list);
//����ʱѡ��Prize���еļȷ���AVID�ַ���PrizeType��UserID��Ӧ��iT_Token
List<IOSToken> getUserIDSByPrize(Prize prize);
//����ʱѡ��Userinfo����UserLogin-��ǰʱ�䣾N��UserID��Ӧ��iT_Token
List<IOSToken> getUserIDSByUserInfo(UserInfo userInfo);
int  updateToken(Object object);
List<IOSToken> getAllTokens();
int getTokensCount();
int getTokensCountByPrize(Prize prize2);
int getTokensCountByUserInfo(UserInfo userInfo);


}

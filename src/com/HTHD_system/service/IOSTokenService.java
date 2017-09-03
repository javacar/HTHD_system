package com.HTHD_system.service;

import java.util.List;

import com.HTHD_system.pojo.IOSNotification;
import com.HTHD_system.pojo.IOSToken;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.pojo.UserInfo;

public interface IOSTokenService {
int	getTokensCount();
int updateToken(String token);
List<IOSToken> getAllTokens();
//�˺�(����û�֮����Ӣ��;�ָ� 
List<IOSToken> getUserIDSByUserName(String[] values);
int getTokensCountByUserName(String[] values);
//����ʱѡ��Prize���еļȷ���AVID�ַ���PrizeType��UserID��Ӧ��iT_Token
List<IOSToken> getUserIDSByPrize(Prize prize);
int getTokensCountByPrize(Prize prize2);
//����ʱѡ��Userinfo����UserLogin-��ǰʱ�䣾N��UserID��Ӧ��iT_Token
List<IOSToken> getUserIDSByUserInfo(UserInfo userInfo);
int getTokensCountByUserInfo(UserInfo userInfo);



}

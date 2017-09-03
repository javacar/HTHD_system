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
//账号(多个用户之间用英文;分隔 
List<IOSToken> getUserIDSByUserName(String[] values);
int getTokensCountByUserName(String[] values);
//发送时选择Prize表中的既符合AVID又符合PrizeType的UserID对应的iT_Token
List<IOSToken> getUserIDSByPrize(Prize prize);
int getTokensCountByPrize(Prize prize2);
//发送时选择Userinfo表中UserLogin-当前时间＞N的UserID对应的iT_Token
List<IOSToken> getUserIDSByUserInfo(UserInfo userInfo);
int getTokensCountByUserInfo(UserInfo userInfo);



}

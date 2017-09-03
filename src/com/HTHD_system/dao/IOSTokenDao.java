package com.HTHD_system.dao;

import java.util.List;

import com.HTHD_system.pojo.IOSToken;
import com.HTHD_system.pojo.Prize;
import com.HTHD_system.pojo.UserInfo;

public interface IOSTokenDao 
{
	//账号(多个用户之间用英文;分隔 
List<IOSToken> getUserIDSByUserName(List<String> list);
int getTokensCountByUserName(List<String> list);
//发送时选择Prize表中的既符合AVID又符合PrizeType的UserID对应的iT_Token
List<IOSToken> getUserIDSByPrize(Prize prize);
//发送时选择Userinfo表中UserLogin-当前时间＞N的UserID对应的iT_Token
List<IOSToken> getUserIDSByUserInfo(UserInfo userInfo);
int  updateToken(Object object);
List<IOSToken> getAllTokens();
int getTokensCount();
int getTokensCountByPrize(Prize prize2);
int getTokensCountByUserInfo(UserInfo userInfo);


}

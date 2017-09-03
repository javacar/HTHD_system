package com.HTHD_system.dao;

import java.util.List;

import com.HTHD_system.pojo.Prize;

public interface PrizeDao {
List<Prize> getAllPrizes(int avid);

Prize getPrize(int prizeID);
}

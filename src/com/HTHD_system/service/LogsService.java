package com.HTHD_system.service;

import com.HTHD_system.pojo.Account;

public interface LogsService {
int login(Account account, String ip);
  int logout(Account account, String ip);
}

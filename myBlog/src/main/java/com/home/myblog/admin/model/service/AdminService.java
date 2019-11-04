package com.home.myblog.admin.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.home.myblog.member.model.vo.LoginRequest;

public interface AdminService {

	ArrayList<LoginRequest> selectLoginLogList();

}

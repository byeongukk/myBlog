package com.home.myblog.history.model.service;

import java.util.ArrayList;

import com.home.myblog.history.model.vo.VisitCount;

public interface HistoryService {

	ArrayList<VisitCount> selectVisitLogList();

}

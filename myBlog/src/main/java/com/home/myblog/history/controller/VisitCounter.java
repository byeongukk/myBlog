package com.home.myblog.history.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.home.myblog.common.ClientUtils;
import com.home.myblog.history.model.dao.VisitCountDao;
import com.home.myblog.history.model.vo.VisitCount;

public class VisitCounter implements HttpSessionListener{
	
			
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(session.getServletContext());
		HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();

		//request를 파라미터에 넣지 않고도 사용할수 있도록 설정
		VisitCountDao vd = (VisitCountDao)wac.getBean("visitCountDao");
        VisitCount vc = new VisitCount();
		vc.setClIp(ClientUtils.getRemoteIP(req));
		vc.setClUserAgent(req.getHeader("User-Agent"));
		vc.setReferer(req.getHeader("referer"));
		//방문이력 insert
		int result = vd.insertVisitor(vc);
		
		int today = vd.getVisitTodayCount();
		int total = vd.getVisitTotalCount();
		
        session.setAttribute("totalCount", today); 
        session.setAttribute("todayCount", total);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
	
	}
	
	
}

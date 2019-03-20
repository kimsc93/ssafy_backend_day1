package com.ssafy.listener;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextListener
 *
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyServletContextListener() {
    	
    }
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("애플리케이션이 종료되기 직전입니다. DB 연결 종료합니다.");
    	
    }
	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("애플리케이션이 실행되기 직전입니다...DB 접속 준비 하겠습니다.");
		// ServletContext 획득
		ServletContext ctx = sce.getServletContext();
		//초기화 변수에 대한 읽기 전용의 접근
		String param = ctx.getInitParameter("dbconfig");
		System.out.println("초기화 파라미터 :"+param);
		//application level 파일에 대한 접근
		InputStream input = ctx.getResourceAsStream(param);
		Properties props = new Properties();
		try {
			props.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(props);
    }
}

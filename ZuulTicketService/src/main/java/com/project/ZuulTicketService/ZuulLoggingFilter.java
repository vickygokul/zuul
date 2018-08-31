package com.project.ZuulTicketService;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
@Component
public class ZuulLoggingFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;   //any rqst will go through this zuul filter
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		java.util.Date d1 = new java.util.Date();
		logger.info("Zuul Filter intercepted @:" + d1);
		System.err.println("This is log....");
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write("Writing some Log to file....");
			file.write("Request intercepts here...@" + d1);
			file.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		
		}
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre"; //type of filter pre post  and error
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1; //to specify the order of filter
	}

}


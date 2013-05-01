package com.avihs.csignup.locater;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.avihs.csignup.service.IUserMgmtService;

public class CommonServiceLocater implements ApplicationContextAware {

	private static final CommonServiceLocater INSTANCE = new CommonServiceLocater();

	private ApplicationContext applicationContext;

	private IUserMgmtService userMgmtService;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {

		this.applicationContext = applicationContext;
	}

	private CommonServiceLocater() {

	}

	public static CommonServiceLocater getInstance() {
		return INSTANCE;
	}

	public IUserMgmtService getUserMgmtService() {
		return userMgmtService;
	}

	public void setUserMgmtService(IUserMgmtService userMgmtService) {
		this.userMgmtService = userMgmtService;
	}

}

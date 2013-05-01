package com.avihs.csignup.serviceimpl;

import com.avihs.csignup.dao.IUserMgmtDAO;
import com.avihs.csignup.entity.UserDetailsEntity;
import com.avihs.csignup.service.IUserMgmtService;

public class UserMgmtServiceImpl implements IUserMgmtService {

	private IUserMgmtDAO userMgmtDAO;

	@Override
	public void save(UserDetailsEntity userDetailsEntity) {
		userMgmtDAO.save(userDetailsEntity);
	}

	public IUserMgmtDAO getUserMgmtDAO() {
		return userMgmtDAO;
	}

	public void setUserMgmtDAO(IUserMgmtDAO userMgmtDAO) {
		this.userMgmtDAO = userMgmtDAO;
	}

}

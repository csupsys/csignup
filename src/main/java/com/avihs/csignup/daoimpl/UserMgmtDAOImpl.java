package com.avihs.csignup.daoimpl;

import com.avihs.csignup.dao.IUserMgmtDAO;
import com.avihs.csignup.entity.UserDetailsEntity;

public class UserMgmtDAOImpl extends CommonDAO implements IUserMgmtDAO {

	@Override
	public void save(UserDetailsEntity userDetailsEntity) {

		getJdoTemplate().makePersistent(userDetailsEntity);

	}

}

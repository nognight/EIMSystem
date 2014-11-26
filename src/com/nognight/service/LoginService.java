package com.nognight.service;

import com.nognight.dao.ManagerDao;
import com.nognight.entily.Manager;

public class LoginService {
	public Manager login(String username, String password) {
		Manager manager = null;
		ManagerDao dao = new ManagerDao();

		if (dao.find(username) == null) {
			return null;
		} else {
			manager = dao.find(username);
			if (manager.getManager_password() == password) {
				return manager;
			} else {
				return null;
			}

		}
	}
}

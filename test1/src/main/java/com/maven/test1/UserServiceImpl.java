package com.maven.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service("userService")


public class UserServiceImpl implements UserService {
	private static final AtomicLong counter = new AtomicLong();

	private static List<User> users = new ArrayList<User>();
	static {
		users = populateDummyUser();
	}

	@Override
	public User findByID(long id) {
		for (User user : users) {
			if (user.getID() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User findbyName(String userName) {
		for (User u : users) {
			if (u.getUserName() == userName) {
				return u;
			}
		}
		return null;
	}
		

	@Override
	public void updateUser(long id, User user) {
		
		
	}

	@Override
	public void deleteUserbyId(long iD) {
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = iterator.next();
			if (user.getID() == iD) {
				iterator.remove();
			}
		}
		
	}
	
	public void saveUser(User user) {
		users.add(user);

	}

	public List<User> findAllUsers() {
		return users;
	}

	public void deleteAllUsers() {
		users.clear();
	}

	public boolean isUserExist(User user) {

		boolean b = users.contains(user);
		return false;
	}

	private static List<User> populateDummyUser() {
		List<User> user = new ArrayList<User>();
		user.add(new User(counter.incrementAndGet(), "pra", "alpha", "@gmail"));
		user.add(new User(counter.incrementAndGet(), "aj", "dlth", "@gmail"));
		return user;
	}
	
}

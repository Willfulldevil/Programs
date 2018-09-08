package com.maven.test1;

import java.util.List;

public interface UserService {

	public User findByID(long id);

	public User findbyName(String userName);

	public void saveUser(User user);

	public void updateUser(long id,User user);

	public void deleteUserbyId(long iD);

	public List<User> findAllUsers();

	public void deleteAllUsers();

	public boolean isUserExist(User user);

}
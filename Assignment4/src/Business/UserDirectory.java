/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

public class UserDirectory {
    ArrayList<User> userList ;

    public UserDirectory() {
        userList = new ArrayList<>();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public User addUser(){
        User user = new User();
        userList.add(user);
        return user;
    }
    
    public void deleteUser(User user){
        userList.remove(user); 
    }
    
}

package com.tutorialspoint;  

import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/UserServiceJson") 

public class UserServiceJson {  
   UserDao userDao = new UserDao();  
   @GET 
   @Path("/usersjson") 
   @Produces(MediaType.APPLICATION_JSON) 
   public List<UserJson> getUsers(){ 
      return userDao.getAllUsersJson(); 
   }  
   
   
   
}
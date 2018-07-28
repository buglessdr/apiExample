package com.tutorialspoint;  

import java.io.Serializable;  
import javax.json.bind.annotation.JsonbProperty;

public class UserJson implements Serializable { 


   private static final long serialVersionUID = 2L; 
   private int id; 
   private String name; 
   private String profession;  
   public UserJson(){} 
    
   public UserJson(int id, String name, String profession){  

      this.id = id; 
      this.name = name; 
      this.profession = profession; 
   }  
   public int getId() { 
      return id; 
   }
   
   @JsonbProperty("id")
   public void setId(int id) { 
      this.id = id; 
   } 
   public String getName() { 
      return name; 
   }
   
   @JsonbProperty("name")
   public void setName(String name) { 
      this.name = name; 
   } 
   public String getProfession() { 
      return profession; 
   } 
   
   @JsonbProperty("profession")
   public void setProfession(String profession) { 
      this.profession = profession; 
   }   
   


   
} 
package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.beans.LoginBean;

@Controller
//@RequestMapping("/login")
public class LoginController{
 
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	   static final String DB_URL = "jdbc:oracle:thin:@DELL:1521:xe";

	   //  Database credentials
	   static final String USER = "hr";
	   static final String PASS = "divya";
	   Connection conn = null;
	   Statement stmt = null;
   /*@RequestMapping(method = RequestMethod.GET)
   public String login(ModelMap model) 
   {
	   return "login";
   }
   */
	
//   @RequestMapping(value = "/login", method = RequestMethod.GET)
//   public ModelAndView login() {
//      return new ModelAndView("login", "command", new LoginBean());
//  }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String display(ModelMap model)
	{
		System.out.println("Divya");
		model.addAttribute("mylogin", new LoginBean());
		//model.addAttribute("message", "Hi Spring MVC Framework here :)!");
		return "login";
	}
   
   @RequestMapping(value = "loginInto" , method = RequestMethod.POST)
   public String login_check(@ModelAttribute("mylogin") LoginBean loginBean) throws ClassNotFoundException, SQLException 
   {
	   if(loginBean.getCustomerId()==123)
	   {
		   Class.forName(JDBC_DRIVER);
		   conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   stmt = conn.createStatement();
		   String sql;
		      sql = "SELECT id, name FROM test";
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         String name = rs.getString("name");
		         
		         System.out.print(", id: " + id);
		         System.out.println(", name: " + name);
		      }
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
			return("success");
			
	   }
			else
			return("error");
   }
}

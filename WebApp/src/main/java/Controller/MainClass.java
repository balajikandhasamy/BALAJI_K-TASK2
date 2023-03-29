package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



import Dao.AdminDao;
import Dto.Customer1;
import Dto.Operator;

@Controller
public class MainClass {
	@RequestMapping("/sign")
	public ModelAndView operatorlogin() {
		ModelAndView modelAndView = new ModelAndView("sign.jsp");
		Operator op = new Operator();
		modelAndView.addObject("key", op);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("/loginoperator")
	public void singup(Operator operator) {

		AdminDao adminDao = new AdminDao();
		 adminDao.sign(operator);
	}
	@RequestMapping("/clogin")
	public ModelAndView create() {
		ModelAndView modelAndView = new ModelAndView("create.jsp");
		Customer1 customer = new Customer1();
		modelAndView.addObject("customerkey", customer);
		return modelAndView;

	}

	@ResponseBody
	@RequestMapping("/customer")
	public void save(Customer1 s) {
		AdminDao adminDao = new AdminDao();
		adminDao.create(s);
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login.jsp");
		Operator op = new Operator();
		modelAndView.addObject("loginkey", op);
		return modelAndView;

	}
@ResponseBody
	@RequestMapping("/login1")
	public ModelAndView operator(Operator operator) {
		System.out.println("login");
		String s1 = operator.getOperator_UserName();
		String s2 = operator.getOperator_Password();
		
		System.out.println(s1);
		System.out.println(s2);
		
		AdminDao adminDao = new AdminDao();
		Operator operator2=adminDao.login(s1);
		
		if (operator2 != null) {
			if (operator2.getOperator_Password().equals(s2)) {
		    ModelAndView andView=new ModelAndView("home.jsp");
		    return andView;
			}
			 else {
				System.out.println("enter correct password");
			}
		}

		else {
			System.out.println("no data founds");
		}
		return null;
	}
	@RequestMapping("/update")
	public ModelAndView update() {
		ModelAndView mav2 = new ModelAndView("edit.jsp");
		Customer1 customer1=new Customer1();
		mav2.addObject("editkey",customer1);
		return mav2;
    }
    @ResponseBody
    @RequestMapping("/edit")
	public String edit(Customer1 dto) {
    	AdminDao dao=new AdminDao();
    	Customer1 dto2=dao.find(dto.getCustomer_id());
    	dao.delete( dto2);
		
		return "edit the data" + dto2.getCustomer_id();
}
    @RequestMapping("/fetch1")
   	public ModelAndView fetch() {
   		ModelAndView mav2 = new ModelAndView("fetch1.jsp");
   		Customer1 customer1=new Customer1();
   		mav2.addObject("key1",customer1);
   		return mav2;
       }
       @ResponseBody
      	@RequestMapping("/fetch")
      	public ModelAndView fetch(int customer_id ){
    	   AdminDao adminDao=new AdminDao();
      		Customer1 customer1=adminDao.fetch( customer_id);
      		ModelAndView mav1 = new ModelAndView("fetch2.jsp");
   		mav1.addObject("key1",customer1);
   		return mav1;
       }
	@RequestMapping("/delete")
	public ModelAndView delete() {
		ModelAndView mav2 = new ModelAndView("delete.jsp");
		Customer1 customer1=new Customer1();
		mav2.addObject("deletekey",customer1);
		return mav2;
    }
    @ResponseBody
    @RequestMapping("/delete1")
	public String delete1(Customer1 dto) {
    	AdminDao dao=new AdminDao();
    	Customer1 dto2=dao.findbyId(dto.getCustomer_id());
    	dao.delete( dto2);
		
		return "delete the data" + dto2.getCustomer_id();
}
    
}

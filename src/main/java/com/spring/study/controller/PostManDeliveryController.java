package com.spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.study.model.CustomerModel;

@Controller
public class PostManDeliveryController {
	
	@RequestMapping(value="/postManDelivery", method = RequestMethod.POST, produces="text/html; charset=UTF-8")
	@ResponseBody
	public String postdeliveryResponse(CustomerModel customerModel) {
		String customer_name = customerModel.getCustomer_name();
		String customer_addr = customerModel.getCustomer_addr();
		String customer_phone = customerModel.getCustomer_phone();
		String customer_etc = customerModel.getCustomer_etc();
		return "이름 : "+customer_name+" 주소 : "+customer_addr+" 전화번호 : "+customer_phone+" 요청사항 : "+customer_etc;
	}
	
}

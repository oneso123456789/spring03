package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCalculator myCalculator = ctx.getBean("mycalculator",MyCalculator.class); //getBean의 첫번째 객체엔 xml에서 선언한 bean의  id가 들어가야함;
																					//아니 근대 이거 당연한건대 내가 멍청했음;
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mult();
		myCalculator.div();
		
		
		
	}

}

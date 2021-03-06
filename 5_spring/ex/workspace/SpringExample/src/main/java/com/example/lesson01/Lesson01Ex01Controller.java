package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller
public class Lesson01Ex01Controller {

	// request URL : http://localhost:8080/lesson01/ex01/1
	@ResponseBody
	@RequestMapping("/1")
	public String ex01_1() {
		String text = "ex 01 <br> 문자열을 response body 로 보내는 예제";
		return text;
	}
	
	// request URL : http://localhost:8080/lesson01/ex01/2
	// @RequestMapping("/lesson01/ex01/2")
	// 중복되니까 클래스 밖에서 중첩되는 부분 선언 가능 @RequestMapping("/lesson01/ex01")
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() {
		// {"key": value, ...}
		Map<String, Object> map = new HashMap<>();
		
		map.put("apple", 4);
		map.put("banana", 6);
		map.put("orange", 8);
		map.put("grape", 10);
		
		// @Controller + @ResponseBody return 타입이 Map이거나 List이거나 객체일 때
		// Json 으로 변환됨
		// Web starter 에 jackson 이라는 라이브러리가 포함되어 있음!
		return map;
	}

}

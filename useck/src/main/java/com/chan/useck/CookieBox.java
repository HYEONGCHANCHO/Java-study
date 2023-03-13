package com.chan.useck;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieBox {
	private Map<String, Cookie> cookieMap = new HashMap<>();
	
	//생성시 기존에 쿠키가 존재하면 cookieMap에 모든 쿠키를 저장한다.
	public CookieBox(HttpServletRequest request) { 
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i=0;i<cookies.length;i=i+1) {
				cookieMap.put(cookies[i].getName(),cookies[i]);
			}
		}
	}
	//아래 3가지 방법중 하나 사용하면 된다.
	
	//쿠키 생성(쿠키명과 쿠키값만을 이용한 쿠키 생성)
	public static Cookie createCookie(String cookieName, String cookieValue) {
		return new Cookie(cookieName, cookieValue);
	}
	
	//쿠키 생성(쿠키명과 쿠키, 경로와 유지 시간을 지정한 쿠키 생성)
	public static Cookie createCookie(String cookieName, String cookieValue, String path, int maxAge) {
		Cookie cookie = new Cookie(cookieName, cookieValue);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
		
	}
	//쿠키 생성(쿠키명과 쿠키,도메인, 경로와 유지 시간을 지정한 쿠키 생성)
	public static Cookie createCookie(String cookieName, String cookieValue, String domain, String path, int maxAge) {
		Cookie cookie = new Cookie(cookieName, cookieValue);
		cookie.setDomain(domain);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}

	public Cookie cookieValueAppend(Cookie cookie, String appenedValue) {
		cookie.setValue(cookie.getValue()+"/" +appenedValue); // <= 기존의 쿠키값 , / 구분자 , 새로 추가할 상품명		
		return cookie;
	}
	
	public Cookie getCookie(String name) {
		return cookieMap.get(name);
	}

	public String getValue(String name) {
		Cookie cookie = cookieMap.get(name);
		if(cookie == null) return null;
		return cookie.getValue();
	}
	public boolean existCookie(String name) {
		return cookieMap.get(name) != null;
		}
}

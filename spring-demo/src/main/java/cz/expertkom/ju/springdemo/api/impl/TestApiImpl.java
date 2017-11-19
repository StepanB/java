package cz.expertkom.ju.springdemo.api.impl;

import java.io.IOException;

import javax.ws.rs.core.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;

import cz.expertkom.ju.interfaces.UserService;
import cz.expertkom.ju.springdemo.api.TestApi;

public class TestApiImpl implements TestApi {
	
	@Autowired
	private UserService userService;

	@Override
	public Response test(String param) throws IOException {
//		 User user = userService.getUser(param);
//		 return Response.ok(user).build();
		
		String url = "https://www.softcom.cz/eshop/" + param + ".html";
        Document document = Jsoup.connect(url).get();

        String question = document.select("tr.wvat td.price").text();
        
        return Response.ok(question).build();
	}

}

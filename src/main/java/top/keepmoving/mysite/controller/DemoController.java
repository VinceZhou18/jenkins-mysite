package top.keepmoving.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>@Author:Vince
 * <p>@Date:2019-04-30
 * <p>@Description:
 */
@Controller
@RequestMapping("/")
public class DemoController {

	@RequestMapping({"/index", "/"})
	public String index() {
		return "index";
	}
}

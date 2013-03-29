package com.yskts.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.yskts.web.controller
 *
 * @author nwong
 * @todo Add Javadoc
 * @since 3/29/13
 */
@Controller
public class WebAppController {

	@RequestMapping("/test")
	public String test() {

		return "test";
	}
}

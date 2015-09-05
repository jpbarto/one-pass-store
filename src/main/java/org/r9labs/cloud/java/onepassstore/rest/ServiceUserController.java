package org.r9labs.cloud.java.onepassstore.rest;

import org.r9labs.cloud.java.onepassstore.data.RecordGroup;
import org.r9labs.cloud.java.onepassstore.data.ServiceUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceUserController {
	@RequestMapping(value="/user", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
	public ServiceUser getUserInfo () {
		ServiceUser su = new ServiceUser ();
		su.setDefaultGroup(new RecordGroup ());
		su.setEmail("bob@larry");
		su.setFirstName("bob");
		su.setLastName("larry");
		su.setUsername("boblar");
		return su;
	}
}

package com.community.palteform.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.community.palteform.community.entity.Contributor;
import com.community.palteform.community.service.ContributorService;
import com.community.palteform.community.vo.ContributorVO;

@RestController
public class ContributorController {
	@Autowired
	private ContributorService contributorService;

	@RequestMapping(value = "/contributors", method = RequestMethod.GET)
	public List<Contributor> getContributors() {
		return contributorService.getContributors();

	}

	@RequestMapping(value = "/createContributor", method = RequestMethod.POST)
	public Boolean addContributor(@RequestBody ContributorVO contributorVO) {
		return contributorService.createContributor(contributorVO);
	}

	@RequestMapping(value = "/deleteContributor", method = RequestMethod.POST)
	public Boolean deleteContributor(@RequestBody String id) {
		Boolean isDeleted = false;
		return isDeleted;
	}

	@RequestMapping(value = "/updateContributor", method = RequestMethod.POST)
	public ContributorVO updateContributor(@RequestBody ContributorVO contributorVO) {
		return new ContributorVO();
	}

}

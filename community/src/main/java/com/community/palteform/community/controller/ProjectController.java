package com.community.palteform.community.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.community.palteform.community.vo.ProjectVO;

@RestController
public class ProjectController {

	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public List<ProjectVO> getProjects() {

		return null;
	}

	@RequestMapping(value = "/updateProject", method = RequestMethod.POST)
	public ProjectVO updateProject(@RequestBody ProjectVO projectVO) {

		return null;
	}

	@RequestMapping(value = "/createProject", method = RequestMethod.POST)
	public Boolean createProject(@RequestBody ProjectVO projectVO) {

		return false;
	}

	@RequestMapping(value = "/deleteProject", method = RequestMethod.POST)
	public Boolean deleteProject(@RequestBody Integer id) {

		return false;
	}

}

package com.community.palteform.community.service;

import java.util.List;

import com.community.palteform.community.entity.Contributor;
import com.community.palteform.community.vo.ContributorVO;

public interface ContributorService {

	List<Contributor> getContributors();

	ContributorVO updateContributor(ContributorVO ContributorVO);

	Boolean createContributor(ContributorVO ContributorVO);

	Boolean deleteContributor(Integer id);
}

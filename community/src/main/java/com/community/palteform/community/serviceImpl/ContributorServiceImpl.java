package com.community.palteform.community.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.palteform.community.entity.Contributor;
import com.community.palteform.community.repository.ContributorRepository;
import com.community.palteform.community.service.ContributorService;
import com.community.palteform.community.vo.ContributorVO;

@Service
public class ContributorServiceImpl implements ContributorService {

	@Autowired
	private ContributorRepository contributorRepository;

	@Override
	public List<Contributor> getContributors() {
		// TODO Auto-generated method stub
		List<Contributor> contributors = (List<Contributor>) contributorRepository.findAll();
//		ArrayList<ContributorVO> contributorVOs = new ArrayList<>();
//		
//		contributors.forEach(c ->{
//			final ContributorVO vo = new ContributorVO();
//			// vo.setName(c.getName());
//
//			BeanUtils.copyProperties(c, vo, new String[] { "projects", "authorities" });
//			contributorVOs.add(vo);
//		});
//		

		return contributors;
	}

	@Override
	public ContributorVO updateContributor(ContributorVO ContributorVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean createContributor(ContributorVO ContributorVO) {
		// TODO Auto-generated method stub
		final Contributor contributor = new Contributor();
		BeanUtils.copyProperties(ContributorVO, contributor, new String[] { "projects", "authorities" });

		return contributorRepository.save(contributor) == null ? false : true;
	}

	@Override
	public Boolean deleteContributor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.akbas.springboot.PribasProject.TimelineService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.akbas.springboot.PribasProject.Entity.Timeline;
import com.akbas.springboot.PribasProject.TimelineRepository.TimelineRepository;

@Service
public class TimelineService {

	@Autowired
	TimelineRepository timelineRepository;

	public Timeline createTimeline(Timeline timeline) {
		return timelineRepository.save(timeline);
	}

	public List<Timeline> getAllTimeline() {
		return timelineRepository.findAll();
	}

	public void deleteUser(String id) {
		timelineRepository.deleteById(id);
	}

	public Timeline updateTimeline(Timeline timeline) {
		return timelineRepository.save(timeline);
	}

	public Timeline getByTitleAndDescription(String title, String description) {
		return timelineRepository.getByTitleAndDescription(title, description);
	}

	public List<Timeline> getByTitleOrDescription(String name, String mail) {
		return timelineRepository.getByTitleOrDescription(name, mail);
	}

	public List<Timeline> allRecordSorting() {
		Sort sort = Sort.by(Sort.Direction.DESC, "description");
		return timelineRepository.findAll(sort);
		/*
		 * Sort class'ı spring library'de var olan bir class!. description'a göre azalan
		 * sırada kayıt döner. Sort.Direction.ASC artan sırada döner
		 */

	}

	public List<Timeline> getByMomentsTitle(String title) {
		return timelineRepository.getByMomentsTitle(title);
	}

	public List<Timeline> getByUserUserName(String name) {
		return timelineRepository.getByUserUserName(name);
	}

	public Timeline getByUserUserid(String id) {
		return timelineRepository.getByUserUserid(id);

	}

	public List<Timeline> getByDescriptionIsLike(String dsr) {
		return timelineRepository.getByDescriptionIsLike(dsr);
	}

}

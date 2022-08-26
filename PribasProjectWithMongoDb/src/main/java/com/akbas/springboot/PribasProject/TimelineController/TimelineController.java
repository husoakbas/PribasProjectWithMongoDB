package com.akbas.springboot.PribasProject.TimelineController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akbas.springboot.PribasProject.Entity.Timeline;
import com.akbas.springboot.PribasProject.TimelineService.TimelineService;

@RestController
@RequestMapping("/api/pribasUser")
public class TimelineController {

	@Autowired
	TimelineService timelineService;

	@PostMapping("/create")
	public Timeline createTimeline(@RequestBody Timeline timeline) {
		return timelineService.createTimeline(timeline); /* yeni kayıt atar. SQL karşılığı: insert işlemi */

	}

//-----------------------------------------------------------------------------------------------------------------------

	@GetMapping("/all")
	public List<Timeline> getAllTimeline() { /* bütün kayıtları döner. SQL karşılığı: select * from users */
		return timelineService.getAllTimeline();
	}

//-----------------------------------------------------------------------------------------------------------------------

	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable String id) {
		timelineService.deleteUser(id); /* id'ye göre kayıt siler. SQL karşılığı: delete users where id = ? */
	}

//-----------------------------------------------------------------------------------------------------------------------	

	@PutMapping("/update")
	public Timeline updateTimeline(@RequestBody Timeline timeline) {
		return timelineService.updateTimeline(timeline); /* update */
	}

//-----------------------------------------------------------------------------------------------------------------------

	@GetMapping("/findByTitleAndDescription")
	public Timeline getByTitleAndDescription(@RequestParam String title, @RequestParam String description) {
		return timelineService.getByTitleAndDescription(title, description); /* title AND description'a göre arama. */

	}

//-----------------------------------------------------------------------------------------------------------------------

	@GetMapping("/findByTitleOrDescription")
	public List<Timeline> getByTitleOrDescription(@RequestParam String title, @RequestParam String description) {
		return timelineService.getByTitleOrDescription(title, description);
	}

//-----------------------------------------------------------------------------------------------------------------------

	@GetMapping("/findAllRecordDESC")
	public List<Timeline> allRecordSorting() {
		return timelineService.allRecordSorting(); /* Azalan sırada data döner */

	}

//----------------------------------------------------------------------------------------------------------------------

	@GetMapping("/findByMomentsTitle")
	public List<Timeline> getByMomentsTitle(@RequestParam String title) {
		return timelineService.getByMomentsTitle(title); /*
															 * moments.title'a göre kayıt döner. SQL karşılığı select
															 * moments from users where title = ?
															 */
	}

//-----------------------------------------------------------------------------------------------------------------------	

	@GetMapping("/findByUserUserName")
	public List<Timeline> getByUserUserName(@RequestParam String name) {
		return timelineService.getByUserUserName(name);

	}

//-----------------------------------------------------------------------------------------------------------------------	

	@GetMapping("/findByUserUserid")
	public Timeline getByUserUserid(@RequestParam String id) {
		return timelineService.getByUserUserid(id); /*
													 * user id'ye göre kayıt döner
													 */

	}

//-----------------------------------------------------------------------------------------------------------------------	

	@GetMapping("/findAsDescription")
	public List<Timeline> getByDescriptionIsLike(@RequestParam String dsr) {
		return timelineService.getByDescriptionIsLike(dsr); /* like query: %abc% */
	}

}

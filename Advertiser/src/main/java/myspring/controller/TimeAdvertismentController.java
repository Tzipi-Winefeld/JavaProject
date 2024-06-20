package myspring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myspring.model.TimeAdvertisement;
import myspring.service.TimeAdvertisementService;

@RequestMapping("/TimeAdvertisement")//זוהי הכתובת היחסית ההתחלתית לכל הפונקציות במחלקה
@RestController //הגדרת קונטרולר

public class TimeAdvertismentController {

//	@Autowired
//	private TimeAdvertisementService ts;
//	
//	@GetMapping //get מתודת
//	public List<TimeAdvertisement> getAll()
//	{
//		return ts.getAll();
//	}
//	
//	@GetMapping("/{code}")
//	public Optional<TimeAdvertisement> getByCode(@PathVariable int code)
//	{
//		return ts.getByCode(code);
//	}
//	
//	@PostMapping
//	public void add(@RequestBody TimeAdvertisement a)
//	{
//		ts.add(a);
//	}
//	
//	
//	@PutMapping
//	public void update(TimeAdvertisement a)
//	{
//		
//	}
//	
//	@DeleteMapping("/{code}")
//	public void delete(@PathVariable int code)
//	{
//		
//	}
}

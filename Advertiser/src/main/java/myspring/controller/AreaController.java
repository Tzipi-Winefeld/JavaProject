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

import myspring.model.Area;
import myspring.service.AreaService;
//import myspring.service.AreaService;

@RequestMapping("/area")//זוהי הכתובת היחסית ההתחלתית לכל הפונקציות במחלקה
@RestController //הגדרת קונטרולר
public class AreaController {

	@Autowired
	private AreaService ar;
	
	@GetMapping //get מתודת
	public List<Area> getAll()
	{
		return ar.getAll();
	}
	
	@GetMapping("/{code}")
	public Optional<Area> getByCode(@PathVariable int code)
	{
		return ar.getByCode(code);
	}
	
	@PostMapping
	public void add(@RequestBody Area a)
	{
		ar.add(a);		
	}
	
	
	@PutMapping
	public void update(Area a)
	{
		
	}
	
	@DeleteMapping("/{code}")
	public void delete(@PathVariable int code)
	{
		ar.delete(code);
	}
}

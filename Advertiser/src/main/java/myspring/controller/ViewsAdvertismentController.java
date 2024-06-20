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

import myspring.model.ViewsAdvertisement;
import myspring.service.ViewsAdvertisementService;

@RequestMapping("/ViewsAdvertisement")//זוהי הכתובת היחסית ההתחלתית לכל הפונקציות במחלקה
@RestController //הגדרת קונטרולר


public class ViewsAdvertismentController {

//	@Autowired
//	private ViewsAdvertisementService vs;
//	
//	@GetMapping //get מתודת
//	public List<ViewsAdvertisement > getAll()
//	{
//		return vs.getAll();
//	}
//	
//	@GetMapping("/{code}")
//	public Optional<ViewsAdvertisement> getByCode(@PathVariable int code)
//	{
//		return vs.getByCode(code);
//	}
//	
//	@PostMapping
//	public void add(@RequestBody ViewsAdvertisement a)
//	{
//		vs.add(a);
//	}
//	
//	
//	@PutMapping
//	public void update(ViewsAdvertisement a)
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

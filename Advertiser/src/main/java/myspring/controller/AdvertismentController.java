package myspring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import myspring.dto.AdvertisementDto;
import myspring.dto.TimeAdvertisementDto;
import myspring.dto.ViewsAdvertisementDto;
import myspring.model.Advertisement;
import myspring.service.AdvertismentService;
import myspring.service.ViewsAdvertisementService;
import myspring.service.TimeAdvertisementService;

@RequestMapping("/advs") // זוהי הכתובת היחסית ההתחלתית לכל הפונקציות במחלקה
@RestController // הגדרת קונטרולר

public class AdvertismentController {

//	@Autowired
//	private AdvertismentService as;

	@Autowired
	public ViewsAdvertisementService v;
	@Autowired
	public TimeAdvertisementService t;

	@PostMapping("/getAndUpdateWebSite")
	public List<AdvertisementDto> updateViewsAndGetActiveAdvertisements() {

		List<AdvertisementDto> newAdverts = new ArrayList<>();
		for (int i = 0; i < v.updateAndGetAll().size(); i++) {
			newAdverts.add(v.updateAndGetAll().get(i));
		}

		for (int i = 0; i < t.updateAndGetAll().size(); i++)
			newAdverts.add(t.updateAndGetAll().get(i));

		for (int j = 0; j < newAdverts.size(); j++) {
			try (FileInputStream in = new FileInputStream(
					"D:\\java-heilbron\\javaServer\\myfolder\\pic" + newAdverts.get(j).getCode() + ".png")) {
				;
				newAdverts.get(j).setFile(org.springframework.util.StreamUtils.copyToByteArray(in));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("wow");
		return newAdverts;
	}

	@PostMapping("/addTimeAdv")
	public boolean addAdv(@RequestPart("adv") String ta, @RequestPart("file") MultipartFile f) throws IOException {
		TimeAdvertisementDto tt = t.Add(ta, f);
		System.out.println(tt.getAreaCode());
		System.out.println(tt.getCode());
		System.out.println(tt.isActive());
		int code = tt.getCode();
		String s = "D:\\java-heilbron\\javaServer\\myfolder\\pic2\\" + code + ".png";
		f.transferTo(new File(s));
		return true;
	}

	@PostMapping("/addViewsAdv")
	public boolean addAdvV(@RequestPart("adv") String ta, @RequestPart("file") MultipartFile f) throws IOException {
		ViewsAdvertisementDto tt = v.Add(ta, f);
		int code = tt.getCode();
		String s = "D:\\java-heilbron\\javaServer\\myfolder\\pic2\\" + code + ".png";
		f.transferTo(new File(s));
		return true;
	}

//	===================================================

//	@GetMapping //get מתודת
//	public List<Advertisement> getAll()
//	{
//		return as.getAll();
//	}

//	@PostMapping("/getAndUpdateWebSite")
//	public List<AdvertisementDto> updateViewsAndGetActiveAdvertisements()
//	{
//		for (int i = 0; i < getAll().size(); i++) {
//			if(getAll().get(i).isActive())
//				getAll().get(i).setCode(getAll().get(i).getCode()+1);
//				
//		}
//		return as.getAll();
//	}
//	@GetMapping("/{code}")
//	public Optional<Advertisement> getByCode(@PathVariable int code)
//	{
//		return as.getByCode(code);
//	}
//	
//	@PostMapping
//	public void add(@RequestBody Advertisement a)
//	{
//		as.add(a);
//	}
//	
//	
//	@PutMapping
//	public void update(Advertisement a)
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

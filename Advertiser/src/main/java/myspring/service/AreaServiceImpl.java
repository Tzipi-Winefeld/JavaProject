package myspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.dao.AreaRepository;
import myspring.model.Area;
@Service // service//מחלקה ששיכת לשכבת ה

public class AreaServiceImpl implements AreaService{

	@Autowired // יודע להזריק את המופע המתאים //IoC //באופן זה ה
	private AreaRepository areaRep;
	
	@Override
	public void add(Area a) {
		System.out.println(a.getCode());
		System.out.println(a.getName());
		System.out.println(a.getPricePerMinute());
		System.out.println(a.isFree());

		if (areaRep.existsById(a.getCode()))// כבר קיים מוצר עם אותו מפתח
			throw new RuntimeException("כבר קיים מוצר עם מפתח " + a.getCode());
		areaRep.save(a);
		
	}

	@Override
	public void delete(int code) {
         areaRep.deleteById(code);
	}

	@Override
	public void update(Area a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Area> getAll() {
		return areaRep.findAll();
	}

	@Override
	public Optional<Area> getByCode(int code) {
		return areaRep.findById(code);
	}

}

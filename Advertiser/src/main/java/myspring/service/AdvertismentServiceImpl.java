package myspring.service;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.dao.AdvertisementRepository;
import myspring.dto.AdvertisementDto;

@Service // service//מחלקה ששיכת לשכבת ה

public class AdvertismentServiceImpl implements AdvertismentService{

	@Autowired // יודע להזריק את המופע המתאים //IoC //באופן זה ה
	private AdvertisementRepository advertisementRep;
	
	
	@Autowired
	private ModelMapper mapper;
	
	
	@Override
	public List<AdvertisementDto> getAll() {
		TypeToken t=new TypeToken<List<AdvertisementDto>>() {};
		return mapper.map(advertisementRep.findAll(),t.getType());
	}

	@Override
	public void updateViewsAndGetActiveAdvertisements() {
		List<AdvertisementDto> list = getAll();	
	}
	
//	@Override
//	public void add(Advertisement a) {
//		
//		if (advertisementRep.existsById(a.getCode()))// כבר קיים מוצר עם אותו מפתח
//			throw new RuntimeException("כבר קיים מוצר עם מפתח " + a.getCode());
//		advertisementRep.save(a);
//	}
//
//	@Override
//	public void delete(int code) {
//		advertisementRep.deleteById(code);
//	}
//
//	@Override
//	public void update(Advertisement a) {
//		
//	}
//
//	@Override
//	public List<Advertisement> getAll() {
//		return advertisementRep.findAll();
//	}
//
//	@Override
//	public Optional<Advertisement> getByCode(int code) {
//		return advertisementRep.findById(code);
//	}

}

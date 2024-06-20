package myspring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import myspring.dao.ViewAdvertisementRepository;
import myspring.dto.ViewsAdvertisementDto;
import myspring.model.ViewsAdvertisement;
@Service
public class ViewsAdvertisementServiceImpI implements ViewsAdvertisementService{

//	======================================================
	
	@Autowired // יודע להזריק את המופע המתאים //IoC //באופן זה ה
	private ViewAdvertisementRepository viewAdvertisentRep;
	
	@Autowired
	private ModelMapper mapper;

	@Autowired
	private ObjectMapper ObjMapper;


	@Override
	public List<ViewsAdvertisementDto> getAll() {
		TypeToken t = new TypeToken<List<ViewsAdvertisementDto>>() {
		};
		return mapper.map(viewAdvertisentRep.findAll(), t.getType());
	}

	public List<ViewsAdvertisementDto> updateAndGetAll() {		
		List<ViewsAdvertisementDto> adverts = this.getAll();
		List<ViewsAdvertisementDto> newAdverts = new ArrayList<>();
		
		for (int i = 0; i < adverts.size(); i++) {
			if(adverts.get(i).isActive() && adverts.get(i).getWantedViews() > (adverts.get(i).getAmountViews()+1)) {
				adverts.get(i).setAmountViews(adverts.get(i).getAmountViews()+1);			
				newAdverts.add(adverts.get(i));				
			}
			else {
				adverts.get(i).setActive(false);
				adverts.get(i).getArea().setFree(true);
			}
		}
		return newAdverts;
	}
	@Override
	public ViewsAdvertisementDto Add(String ta, MultipartFile f) {
		try {
			ViewsAdvertisementDto da = ObjMapper.readValue(ta, ViewsAdvertisementDto.class);
			if (da.getArea().isFree()) {
				da.setOrderDate(new Date());
				viewAdvertisentRep.save(da);
				return da;
			}
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	
//	==========================================================
//	@Override
//	public void add(ViewsAdvertisement a) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(int code) {
//		viewAdvertisementRep.deleteById(code);
//		
//	}
//
//	@Override
//	public void update(ViewsAdvertisement a) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<ViewsAdvertisement> getAll() {
//		return viewAdvertisementRep.findAll();
//	}
//
//	@Override
//	public Optional<ViewsAdvertisement> getByCode(int code) {
//		return viewAdvertisementRep.findById(code);
//	}

}

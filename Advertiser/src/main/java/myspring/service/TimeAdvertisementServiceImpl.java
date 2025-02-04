package myspring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import myspring.dao.AreaRepository;
import myspring.dao.TimeAdvertisementRepository;
import myspring.dto.TimeAdvertisementDto;
import myspring.model.Area;
import myspring.model.Customer;
import myspring.model.TimeAdvertisement;

@Service
public class TimeAdvertisementServiceImpl implements TimeAdvertisementService {

//	@Autowired // יודע להזריק את המופע המתאים //IoC //באופן זה ה
//	private TimeAdvertisementRepository timeAdvertisementRep;
//======================================================================
	@Autowired
	private AreaRepository areaRep;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private ObjectMapper ObjMapper;

	@Autowired // יודע להזריק את המופע המתאים //IoC //באופן זה ה
	private TimeAdvertisementRepository TimeAdvertismentRep;

	@Override
	public List<TimeAdvertisementDto> getAll() {
		TypeToken t = new TypeToken<List<TimeAdvertisementDto>>() {
		};
		return mapper.map(TimeAdvertismentRep.findAll(), t.getType());
	}

	public List<TimeAdvertisementDto> updateAndGetAll() {
		List<TimeAdvertisementDto> adverts = this.getAll();
		List<TimeAdvertisementDto> newAdverts = new ArrayList<>();
		for (int i = 0; i < adverts.size(); i++) {
			if (adverts.get(i).isActive())
				newAdverts.add(adverts.get(i));
		}
		return newAdverts;
	}

	public void scheduleAdExpiry(TimeAdvertisementDto ad) {
		// ad.getOrderDate().setMinutes(ad.getOrderDate().getMinutes() +
		// ad.getMinutes());
		;
		// Date endTime = ad.getOrderDate();

		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		// long delay = Duration.between(LocalDateTime.now(), endTime).toMillis();

		executor.schedule(() -> {
			ad.setActive(false);
			areaRep.findById(ad.getCode()).get().setFree(true);
			// TimeAdvertismentRep.save(ad);
		}, ad.getMinutes(), TimeUnit.MINUTES);// מתזמן בעוד כמות הדקות המצוינת את המשימה הרצויה
	}
//	@Bean
	@Override
	public TimeAdvertisementDto Add(String ta, MultipartFile f) {
		try {
			
			//TimeAdvertisementDto da = ObjMapper.readValue(ta, TimeAdvertisementDto.class);

			TimeAdvertisement da = ObjMapper.readValue(ta, TimeAdvertisement.class);

			System.out.println("time:");
			System.out.println(da.getCustomerCode());
			System.out.println(da.getAreaCode());

			if (areaRep.findById(da.getAreaCode()).get().isFree()) {
				da.setOrderDate(new Date());
//				System.out.println(da.getOrderDate());
//				שורות בעיתיות
				da.setCode(0);
				da.setArea_(new Area());
				da.setCustomer_(new Customer());
				TimeAdvertismentRep.save(mapper.map(da, TimeAdvertisement.class));
				//this.scheduleAdExpiry(da);
				//return da;
				return null;
			}
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update(TimeAdvertisementDto t) {

	}

//	===================================================================
//	@Override
//	public void add(TimeAdvertisement t) {
//		
//	}
//
//	@Override
//	public void delete(int code) {
//		timeAdvertisementRep.deleteById(code);
//		
//	}
//
//	@Override
//	public void update(TimeAdvertisement t) {
//		
//	}
//
//	@Override
//	public List<TimeAdvertisement> getAll() {
//		return timeAdvertisementRep.findAll();
//	}
//
//	@Override
//	public Optional<TimeAdvertisement> getByCode(int code) {
//		return timeAdvertisementRep.findById(code);
//	}

}

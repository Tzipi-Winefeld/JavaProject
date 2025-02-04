package myspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import myspring.dto.TimeAdvertisementDto;
import myspring.model.TimeAdvertisement;

public interface TimeAdvertisementService {

//	void add(TimeAdvertisement t);
//	void delete(int code);
//	void update(TimeAdvertisement t);
//	List<TimeAdvertisement> getAll();
//	Optional<TimeAdvertisement> getByCode(int code);
	
	void update(TimeAdvertisementDto t);

	List<TimeAdvertisementDto> getAll();
	
	TimeAdvertisementDto Add(String ta, MultipartFile f);
	List<TimeAdvertisementDto> updateAndGetAll();
}

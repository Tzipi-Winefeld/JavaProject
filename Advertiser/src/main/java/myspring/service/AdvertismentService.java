package myspring.service;
import java.util.List;
import java.util.Optional;

import myspring.dto.AdvertisementDto;
import myspring.model.Advertisement;

public interface AdvertismentService {

//	void add(Advertisement a);
//	void delete(int code);
//	void update(Advertisement a);
//	List<Advertisement> getAll();
//	Optional<Advertisement> getByCode(int code);
	
    List<AdvertisementDto> getAll();
	
	void updateViewsAndGetActiveAdvertisements();
}

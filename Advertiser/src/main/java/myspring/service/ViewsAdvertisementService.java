package myspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import myspring.dto.ViewsAdvertisementDto;
import myspring.model.ViewsAdvertisement;

public interface ViewsAdvertisementService {

//	void add(ViewsAdvertisement a);
//	void delete(int code);
//	void update(ViewsAdvertisement a);
//	List<ViewsAdvertisement> getAll();
//	Optional<ViewsAdvertisement> getByCode(int code);
	
	
	
	
	List<ViewsAdvertisementDto> getAll();

	ViewsAdvertisementDto Add(String ta, MultipartFile f);
	List<ViewsAdvertisementDto> updateAndGetAll();	
}

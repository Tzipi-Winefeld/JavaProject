package myspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import myspring.dto.TimeAdvertisementDto;
import myspring.model.TimeAdvertisement;

public interface TimeAdvertisementRepository extends JpaRepository<TimeAdvertisement, Integer>{

	void save(TimeAdvertisementDto da);
}

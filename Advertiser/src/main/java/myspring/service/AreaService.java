package myspring.service;

import java.util.List;
import java.util.Optional;

import myspring.model.Area;

public interface AreaService {
	void add(Area a);
	void delete(int code);
	void update(Area a);
	List<Area> getAll();
	Optional<Area> getByCode(int code);
}

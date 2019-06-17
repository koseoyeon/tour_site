package com.tour.common.arrange;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.tour.model.gallery.domain.Gallery;

import org.springframework.stereotype.Component;

@Component
public class ListArrange {
	public List ArrangeList(List list, List<Gallery> galleryList) {
		for(int i = 0; i<list.size(); i++) {
			Gallery gallery=(Gallery)list.get(i);
			galleryList.add(gallery);
		}
		return galleryList;
	}
}

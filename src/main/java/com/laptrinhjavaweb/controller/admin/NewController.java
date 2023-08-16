package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.service.CategoryService;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.NewService;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller(value = "newControllerOfAdmin")
public class NewController {
	
	@Autowired
	private NewService newService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private MessageUtils messageUtils;

	
	@RequestMapping(value = "/quan-tri/bai-viet/danh-sach", method = RequestMethod.GET)
	public ModelAndView showList(@RequestParam("page") int page, @RequestParam("limit") int limit, HttpServletRequest request) {
		NewDTO model = new NewDTO();
		ModelAndView mav = new ModelAndView("admin/new/list");
		model.setPage(page);
		model.setLimit(limit);
		Pageable pageable = new PageRequest(page - 1, limit);
		model.setListResult(newService.findAll(pageable));
		model.setTotalItem(newService.getTotalItem());
		model.setTotalPage((int)Math.ceil(model.getTotalItem() * 1.0 / model.getLimit()));
		Map<String, String> message = messageUtils.getMessage(request);
		mav.addObject("message", message.get("message"));
		mav.addObject("alert",message.get("alert"));
		mav.addObject("model", model);
		return mav;
	}
	@RequestMapping(value = "/quan-tri/bai-viet/chinh-sua", method = RequestMethod.GET)
	public ModelAndView editNew(@RequestParam(value = "id", required = false) Long id, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("admin/new/edit");
		NewDTO newDTO = new NewDTO();
		if(id != null) {
			newDTO = newService.findById(id);
		}
		Map<String, String> message = messageUtils.getMessage(request);
		mav.addObject("message", message.get("message"));
		mav.addObject("alert",message.get("alert"));
		mav.addObject("categories", categoryService.findAll());
		mav.addObject("model", newDTO);
		return mav;
	}
}
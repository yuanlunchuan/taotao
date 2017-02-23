package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
@RequestMapping("/")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/item/{itemId}", method=RequestMethod.GET)
	@ResponseBody
	public TbItem getTbItemById(@PathVariable("itemId") Long itemId){
		return itemService.getItemById(itemId);
	}
	

}

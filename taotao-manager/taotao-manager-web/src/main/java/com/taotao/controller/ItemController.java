package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	@Qualifier("itemService")
	private ItemService itemService;

	@RequestMapping(value="item/{itemId}", method=RequestMethod.GET)
	@ResponseBody
	public TbItem getTbItemById(@PathVariable(value="itemId") Long itemId){
		System.out.println("------itemId: "+itemId);
		return itemService.getItemById(itemId);
	}
	
	@RequestMapping(value="users", method=RequestMethod.GET)
	@ResponseBody
	public TbItem getAllTbItem(){
		return new TbItem();
	}
}

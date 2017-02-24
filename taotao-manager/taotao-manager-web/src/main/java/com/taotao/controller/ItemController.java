package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import com.taotao.service.impl.ItemServiceImpl;

@Controller
@RequestMapping("/")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="item/{itemId}", method=RequestMethod.GET)
	@ResponseBody
	public TbItem getTbItemById(@PathVariable(value="itemId") Long itemId){
		System.out.println("------itemId: "+itemId);
		System.out.println("---------type: "+ (itemService instanceof ItemServiceImpl));
		System.out.println("--------itemService: "+itemService);
		return itemService.getItemById(itemId);
	}
	
	public static void main(String[] args) {
		new ItemServiceImpl().getItemById(33333L);
	}
	
	@RequestMapping(value="users", method=RequestMethod.GET)
	@ResponseBody
	public TbItem getAllTbItem(){
		return new TbItem();
	}
}

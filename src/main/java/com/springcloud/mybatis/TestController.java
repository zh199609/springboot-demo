/**
 * 
 */
package com.springcloud.mybatis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author	zhanglei
 * @date	2018年9月4日
 * @Description	
 */
@RestController
public class TestController {

	@Autowired
	private CoreCategoryMapper categoryMapper;
	  
	@RequestMapping("/findById/{id}")
	public Map<Object, Object> findById(@PathVariable(value="id")String id){
		Map<Object, Object> map = categoryMapper.findGategoryById(id);
		for(Entry<Object, Object> obj:map.entrySet()) {
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
		}
		return categoryMapper.findGategoryById(id);
	}
	
	@RequestMapping("/findPage/{page}/{row}")
	public List<CoreCategory> findPages(@PathVariable("page")Integer page,@PathVariable("row")Integer row){
		PageHelper.startPage(page, row);
		List<CoreCategory> list = categoryMapper.findGategory();
		PageInfo<CoreCategory> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo.getPages());
		return pageInfo.getList();
	}
	
	
	@RequestMapping("/save")
	public String save(){
		List<CoreCategory> list = new ArrayList<>();
		for(int i=1;i<100;i++) {
			CoreCategory coreCategory = new CoreCategory();
			coreCategory.setParentId(27L+i);
			coreCategory.setName("框架名字"+i);
			coreCategory.setShowName("showName"+i);
			list.add(coreCategory);
		}
		categoryMapper.save(list);
		return "SUCCESS";
	}
}

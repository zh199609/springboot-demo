/**
 * 
 */
package com.springcloud.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



/**
 * @author zhanglei
 * @date 2018年9月4日
 * @Description
 */
@Mapper
public interface CoreCategoryMapper{

	@Select({
			"SELECT id,parent_id,name,en_name,show_name,en_show_name,description,en_description,priority,db_code,code,code_name,published,status,level",
			" FROM core_category", "where id=#{id}" })
	Map<Object,Object> findGategoryById(String id);

	@Select({
			"SELECT id,parent_id,name,en_name,show_name,en_show_name,description,en_description,priority,db_code,code,code_name,published,status,level",
			" FROM core_category" })
	List<CoreCategory> findGategory();
	
	//批量进行插入 使用foreach   删除，查询也可以，
	@Insert({"<script>",
			"insert into core_category (parent_id, name," +
			" show_name)" +
			"    values "
			+ "<foreach item='obj' index='index' collection='list' separator=','> ("+
				"#{obj.parentId},#{obj.name},#{obj.showName}"
			+ ") </foreach>",
			"</script>"})
	void save(List<CoreCategory> list);
	
	
	void update(List<CoreCategory> list);
}

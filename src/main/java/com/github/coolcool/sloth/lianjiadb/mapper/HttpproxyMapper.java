package com.github.coolcool.sloth.lianjiadb.mapper;
import javax.annotation.Generated;

import com.github.coolcool.sloth.lianjiadb.model.Httpproxy;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Generated(
	value = {
		"https://github.com/coolcooldee/sloth",
		"Sloth version:1.0"
	},
	comments = "This class is generated by Sloth"
)
public interface HttpproxyMapper{

	@Select("SELECT COUNT(*) FROM httpproxy ")
	Integer count();


	@Select("SELECT * FROM httpproxy WHERE id = #{id} LIMIT 1 ")
	@Results({
			@Result(property="id",column="id")
			,@Result(property="ip",column="ip")
			,@Result(property="port",column="port")
			,@Result(property="username",column="username")
			,@Result(property="password",column="password")
			,@Result(property="createtime",column="createtime")
			,@Result(property="updatetime",column="updatetime")
			,@Result(property="status",column="status")
	})
	Httpproxy getById(@Param("id") Integer id);


	@Delete("DELETE FROM httpproxy WHERE id = #{id} ")
	Integer deleteById(@Param("id") Integer id);

	@Update({
		"UPDATE httpproxy SET ip=#{ip}, port=#{port}, username=#{username}, password=#{password}, createtime=#{createtime}, updatetime=#{updatetime}, status=#{status} where id = #{id}"
	})
	Integer update(Httpproxy httpproxy);

	@Insert({
		"INSERT IGNORE INTO httpproxy (`ip`, `port`, `username`, `password`, `createtime`, `updatetime`, `status`) VALUE (#{ip}, #{port}, #{username}, #{password}, #{createtime}, #{updatetime}, #{status})"
	})
	Integer save(Httpproxy httpproxy);


	@Select("SELECT * FROM httpproxy LIMIT 10 ")
@Results({
	@Result(property="id",column="id")
	,@Result(property="ip",column="ip")
	,@Result(property="port",column="port")
	,@Result(property="username",column="username")
	,@Result(property="password",column="password")
	,@Result(property="createtime",column="createtime")
	,@Result(property="updatetime",column="updatetime")
	,@Result(property="status",column="status")
})
	List<Httpproxy> list();


	@Select("SELECT * FROM httpproxy LIMIT #{start}, #{step}")
@Results({
	@Result(property="id",column="id")
	,@Result(property="ip",column="ip")
	,@Result(property="port",column="port")
	,@Result(property="username",column="username")
	,@Result(property="password",column="password")
	,@Result(property="createtime",column="createtime")
	,@Result(property="updatetime",column="updatetime")
	,@Result(property="status",column="status")
})
	List<Httpproxy> page(@Param("start") int start, @Param("step") int step);
	
}
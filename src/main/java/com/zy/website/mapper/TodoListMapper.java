package com.zy.website.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zy.website.model.TodoList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoListMapper extends BaseMapper<TodoList> {
}

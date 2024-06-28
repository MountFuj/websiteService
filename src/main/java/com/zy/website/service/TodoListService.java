package com.zy.website.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.website.model.TodoList;
import com.zy.website.response.TodoListResp;

import java.util.List;

public interface TodoListService extends IService<TodoList> {
    // 获取当前用户代办列表
    // todo 等用户表出来后，需按用户id查询
    List<TodoListResp> getUserTodoList();
}

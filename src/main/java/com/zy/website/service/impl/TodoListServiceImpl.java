package com.zy.website.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.website.mapper.TodoListMapper;
import com.zy.website.model.TodoList;
import com.zy.website.response.TodoListResp;
import com.zy.website.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoListServiceImpl extends ServiceImpl<TodoListMapper, TodoList> implements TodoListService {

    @Autowired
    TodoListMapper todoListMapper;

    @Override
    public List<TodoListResp> getUserTodoList() {
        List<TodoListResp> res = new ArrayList<>();
        for (TodoList todoList : todoListMapper.selectList(null)) {
            res.add(new TodoListResp(todoList.getId(), todoList.getName()));
        }
        return res;
    }
}

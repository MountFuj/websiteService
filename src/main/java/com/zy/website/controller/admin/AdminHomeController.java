package com.zy.website.controller.admin;

import com.alibaba.fastjson.JSON;
import com.zy.website.model.TodoList;
import com.zy.website.response.TodoListResp;
import com.zy.website.result.CommonResult;
import com.zy.website.service.TodoListService;
import com.zy.website.utils.RedisUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
@Api(tags = "后台管理首页接口")
public class AdminHomeController {

    @Autowired
    TodoListService todoListService;

    @Autowired
    RedisUtils redisUtils;

    @GetMapping("/getTodoList")
    @ApiOperation(value = "获取待办列表")
    public CommonResult<TodoListResp> getTodoList(){
        List<TodoListResp> userTodoList = todoListService.getUserTodoList();
        // 缓存实例
//        if(redisUtils.getKey("todoList")!=null){
//            String todoList = redisUtils.getKey("todoList");
//            List<TodoListResp> todoListResps = JSON.parseArray(todoList, TodoListResp.class);
//            return CommonResult.success(todoListResps);
//        }
        String jsonString = JSON.toJSONString(userTodoList);
//        redisUtils.setKey("todoList",jsonString);
        return CommonResult.success(userTodoList);
    }
}

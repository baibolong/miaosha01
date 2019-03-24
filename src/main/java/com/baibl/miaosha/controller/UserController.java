package com.baibl.miaosha.controller;


import com.baibl.miaosha.entity.VO.ResultSet;
import com.baibl.miaosha.entity.VO.UserVO;
import com.baibl.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public ResultSet getUser(@RequestParam(name = "id") Integer id){

        UserVO userVO = userService.findUserById(id);



        return ResultSet.create(userVO);
    }
}

package com.baibl.miaosha.service.impl;

import com.baibl.miaosha.dao.UserMapper;
import com.baibl.miaosha.dao.UserPasswordMapper;
import com.baibl.miaosha.entity.User;
import com.baibl.miaosha.entity.VO.UserVO;
import com.baibl.miaosha.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserPasswordMapper userPasswordMapper;


    @Override
    public UserVO findUserById(Integer id) {
        UserVO userVO = new UserVO();
        User user = userMapper.selectByPrimaryKey(id);

        return convertFromUser(user,userVO);
    }


    public UserVO convertFromUser(User user,UserVO userVO){
        BeanUtils.copyProperties(user,userVO);
        userVO.setEncrptPassword(userPasswordMapper.selectByUserId(user.getId()).getEncrptPassword());

        return userVO;
    }
}

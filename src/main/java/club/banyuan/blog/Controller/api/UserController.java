package club.banyuan.blog.Controller.api;

import club.banyuan.blog.common.CommonResult;
import club.banyuan.blog.dto.UserParam;
import club.banyuan.blog.mapper.UserMapper;
import club.banyuan.blog.model.User;
import club.banyuan.blog.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import java.util.Collections;
import java.util.List;

/**
 * @author HanChao
 * @date 2020-06-17 17:04
 * 描述信息：
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping(value = "/login")
    public CommonResult login (@RequestBody UserParam userParam, HttpSession session) {

        // 用户在不在
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(userParam.getUsername());
        List<User> userList = userMapper.selectByExample(example);

        if (CollectionUtils.isEmpty(userList)) {
            return CommonResult.failed("用户不存在");
        }

        User tempUser = userList.get(0);

        // 密码对不对
        if (!tempUser.getPassword().equals(userParam.getPassword())) {
            return CommonResult.failed("密码不对");
        }
        // 存进Session
        session.setAttribute("user",tempUser);
        return CommonResult.success("OK");
    }

    @PostMapping(value = "/create")
    public CommonResult create (@RequestBody User user) {
        userMapper.insertSelective(user);
        return CommonResult.success("OK");
    }

}

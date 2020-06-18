package club.banyuan.blog.Controller.api;

import club.banyuan.blog.common.CommonResult;
import club.banyuan.blog.dto.AnswerParam;
import club.banyuan.blog.mapper.AnswerMapper;
import club.banyuan.blog.model.Answer;
import club.banyuan.blog.model.AnswerExample;
import club.banyuan.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author HanChao
 * @date 2020-06-17 20:32
 * 描述信息：
 */
@RestController
@RequestMapping(value = "/api/answer")
public class AnswerController {

    @Autowired
    private AnswerMapper answerMapper;

    @PostMapping(value = "/create")
    public CommonResult create (@RequestBody AnswerParam answerParam, HttpSession session) {

        // 判断用户是否登录
        User user = (User) session.getAttribute("user");

        if (user == null) {
            return CommonResult.failed("用户未登录");
        }

        // 判断用户是否已经回答过该问题

        AnswerExample answerExample = new AnswerExample();
        answerExample.createCriteria()
                .andQuestionIdEqualTo(answerParam.getQuestionId())
                .andUserIdEqualTo(user.getId());
        long count = answerMapper.countByExample(answerExample);

        if (count > 0) {
            return CommonResult.failed("已经回答过了");
        }

        Answer answer = new Answer();
        answer.setContent(answerParam.getContent());
        answer.setQuestionId(answerParam.getQuestionId());
        answer.setUserId(user.getId());
        answerMapper.insertSelective(answer);

        return CommonResult.success("OK");
    }

    // 问题回答修改
    @PostMapping(value = "/update")
    public CommonResult update (@RequestBody Answer answer,HttpSession session) {

        // 回去修改答案的用户
        User user = (User) session.getAttribute("user");

        if (user == null) {
            return CommonResult.failed("用户未登录");
        }

        // 修改回答的内容
        answerMapper.updateByPrimaryKeySelective(answer);

        return CommonResult.success("OK");
    }
}

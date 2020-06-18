package club.banyuan.blog.Controller.api;

import club.banyuan.blog.common.CommonResult;
import club.banyuan.blog.dto.QuestionCreateParam;
import club.banyuan.blog.mapper.QuestionMapper;
import club.banyuan.blog.mapper.TagMapper;
import club.banyuan.blog.mapper.TagQuestionRelationMapper;
import club.banyuan.blog.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HanChao
 * @date 2020-06-17 19:04
 * 描述信息：
 */
@RestController
@RequestMapping(value = "api/question")
public class QuestionController {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private TagQuestionRelationMapper tagQuestionRelationMapper;

    @PostMapping(value = "/create")
    public CommonResult create (@RequestBody QuestionCreateParam questionCreateParam, HttpSession session) {

        // 判断用户是否登录
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return CommonResult.failed("用户未登录");
        }

        Question question = new Question();
        question.setTitle(questionCreateParam.getTitle());
        question.setContent(questionCreateParam.getContent());
        question.setUserId(user.getId());

        questionMapper.insertSelective(question);

        // 标签
        if (!CollectionUtils.isEmpty(questionCreateParam.getTagIds())) {
            for (Integer tagId : questionCreateParam.getTagIds()) {
                TagQuestionRelation relation = new TagQuestionRelation();
                relation.setQuestionId(question.getId());
                relation.setTagId(tagId);
                tagQuestionRelationMapper.insertSelective(relation);
            }
        }

        return CommonResult.success("OK");
    }





    @Autowired
    private TagMapper tagMapper;

    @GetMapping(value = "/getTags/{questionId}")
    public CommonResult getTags(@PathVariable("questionId") Integer questionId) {

        TagQuestionRelationExample example1 = new TagQuestionRelationExample();
        example1.createCriteria().andQuestionIdEqualTo(questionId);
        List<TagQuestionRelation> relations = tagQuestionRelationMapper.selectByExample(example1);

        List<Integer> tagIds = new ArrayList<>();
        for (TagQuestionRelation relation : relations) {
            tagIds.add(relation.getTagId());
        }

        // tag
        TagExample example2 = new TagExample();
        example2.createCriteria().andIdIn(tagIds);
        List<Tag> tags = tagMapper.selectByExample(example2);

        return CommonResult.success(tags);
    }
}


package club.banyuan.blog.Controller.api;

import club.banyuan.blog.common.CommonResult;
import club.banyuan.blog.mapper.TagMapper;
import club.banyuan.blog.model.Tag;
import club.banyuan.blog.model.TagExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author HanChao
 * @date 2020-06-17 19:41
 * 描述信息：
 */
@RestController
public class TagController {

    @Autowired
    private TagMapper tagMapper;

    @GetMapping(value = "/api/tag/query")
    public CommonResult query(@RequestParam(value = "kw", required = false) String kw) {

        TagExample example = new TagExample();
        example.createCriteria().andLabelLike("%" + kw + "%");
        List<Tag> tags = tagMapper.selectByExample(example);
        return CommonResult.success(tags);
    }
}

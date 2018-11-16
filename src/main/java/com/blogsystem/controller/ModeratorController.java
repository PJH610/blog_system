package com.blogsystem.controller;

import com.blogsystem.bean.Moderator;
import com.blogsystem.bean.MyPageInfo;
import com.blogsystem.service.ModeratorService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by SX-503 on 2018/10/30.
 */
@RestController
@RequestMapping("/api/moderator")
public class ModeratorController extends BaseApiController {

    @Autowired
    ModeratorService moderatorService;

    @PostMapping("/add")
    public Map<String,Object> insert(@RequestParam Integer forum_id,@RequestParam String moderator_level) {
        if (moderator_level == null || moderator_level.trim().length() == 0)return onBadResp("不能为空");

        Moderator moderator = new Moderator();
        moderator.setForumId(forum_id);
        moderator.setModeratorLevel(moderator_level.trim());
       if (moderatorService.insert(moderator) > 0) return onSuccessRep("添加成功");
       return onBadResp("添加失败");
    }

    @GetMapping("/selectById")
    public Map<String, Object> selectById(@RequestParam Long id) {
        return onDataResp(moderatorService.selectById(id));
    }


    @GetMapping("/show/{id}")
    public Map<String,Object> show (@PathVariable Long id) {
        return onDataResp(moderatorService.selectById(id));
    }

    // 删
    @PostMapping("/delete")
    public Map<String,Object> delete( @RequestParam Long[] id) {
        moderatorService.deleteBatch(id);
        return onSuccessRep("删除成功");

    }

    // 改
    @PostMapping("/update")
    public Map<String,Object> update(@RequestParam Long id,String moderator_level) {

        if (moderator_level != null && moderator_level.trim().length() == 0) return onBadResp("不能为空");

        Moderator moderator = new Moderator();
        moderator.setId(id);
        if (moderator_level != null) moderator.setModeratorLevel(moderator_level.trim());
        if (moderatorService.update(moderator) > 0) {
            return onSuccessRep("修改成功");
        }
        return onBadResp("修改失败");
    }

    // 分页显示，查询用户
    @GetMapping("/list")
    public Map<String, Object> list(@RequestParam(defaultValue = "1") Integer page_num, @RequestParam(defaultValue = "10") Integer page_size){
        PageHelper.startPage(page_num, page_size);
        return onDataResp(new MyPageInfo<Moderator>(moderatorService.list()));
    }

}

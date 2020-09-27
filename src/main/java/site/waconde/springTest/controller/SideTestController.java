package site.waconde.springTest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import site.waconde.springTest.entity.SideTest;
import site.waconde.springTest.service.ISideTestService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author side.wang
 * @since 2020-09-23
 */
@RestController
@RequestMapping("/springTest/side-test")
public class SideTestController {
    @Autowired
    private ISideTestService sideTestService;

    @GetMapping("selectById/{id}")
    public SideTest selectById(@PathVariable String id) {
        return sideTestService.getById(id);
    }

    @PostMapping("insertOne")
    public boolean insertOne(@RequestBody SideTest sideTest) {
        return sideTestService.save(sideTest);
    }

    @PostMapping("updateById")
    public boolean updateById(@RequestBody SideTest sideTest) {
        return sideTestService.updateById(sideTest);
    }

    @GetMapping("deleteById/{id}")
    public Boolean deleteById(@PathVariable String id) {
        return sideTestService.removeById(id);
    }
}

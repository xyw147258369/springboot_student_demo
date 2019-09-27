package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @DATE 2019/9/25
 */
@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> students = stuService.list();
        model.addAttribute("students", students);
        return "stulist";
    }
    /**
     * 删除学生
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Integer id){

        stuService.removeById(id);

        return "redirect:/stu/list";
    }
}

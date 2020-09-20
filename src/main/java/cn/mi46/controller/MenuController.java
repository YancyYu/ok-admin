package cn.mi46.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class MenuController {

    @RequestMapping("/{pathName}/{fileName}")
    public String toMenu(@PathVariable("pathName") String pathName,@PathVariable("fileName") String fileName){
        return "admin/"+pathName+"/"+fileName;
    }

    @RequestMapping("/pages/{pathName}/{fileName}")
    public String toMenuPages(@PathVariable("pathName") String pathName,@PathVariable("fileName") String fileName){
        return "admin/pages/"+pathName+"/"+fileName;
    }

    @RequestMapping("/{fileName}")
    public String toMenu(@PathVariable("fileName") String fileName){
        return "admin/pages/"+fileName;
    }
    @RequestMapping("/index")
    public String toIndex(){
        return "admin/index";
    }
}

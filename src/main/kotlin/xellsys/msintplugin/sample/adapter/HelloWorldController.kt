package xellsys.msintplugin.sample.adapter

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloWorldController {
    @GetMapping("/hello")
    @ResponseBody
    fun sayHello(): String {
        return "Hello World!"
    }
}
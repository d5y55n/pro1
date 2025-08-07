package edu.mit.p1;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Log4j2
@Controller
public class QuizController
{
    @GetMapping("/test1")
    public void test1()
    {

    }

    @PostMapping("/test2")
    public void result(int num1,
                          int num2, Model model)
    {
        int sum=0;
        for(int a=num1; a<=num2; a++)
        {
            sum=sum+a;
        }
        model.addAttribute("sum", sum);
    }
}

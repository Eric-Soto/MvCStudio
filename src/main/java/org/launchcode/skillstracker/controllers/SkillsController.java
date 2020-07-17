package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTrack(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Javascript</li>" +
                "<li>VBA</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "<form method = 'get' action = 'form'>" +
                "<input type='submit' value='form'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "form/skill", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String skillRet(String name, String firstLanguage, String secondLanguage, String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" + name + "'s Top 3 favorite languages</h2>" +
                "<ol>" +
                "<li>"+ firstLanguage + "</li>" +
                "<li>"+ secondLanguage + "</li>" +
                "<li>"+ thirdLanguage + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String langForm(){
        return "<html>" +
                "<body>" +
                "<form method = 'post' action = 'form/skill'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label for='firstLanguage'>1st programming language:</label><br>" +
                "<select name='firstLanguage'>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='VBA'>VBA</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<label for='secondLanguage'>2nd programming language:</label><br>" +
                "<select name='secondLanguage'>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='VBA'>VBA</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<label for='thirdLanguage'>3rd programming language:</label><br>" +
                "<select name='thirdLanguage'>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='VBA'>VBA</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<input type='submit' value='submit!'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}

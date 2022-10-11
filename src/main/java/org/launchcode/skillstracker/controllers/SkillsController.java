package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

//@GetMapping()
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String welcomeInfo(@RequestParam String name, String firstLang,String secLang, String thirdLang){
        String withoutData =
                "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> Here's a list of programs to learn! </h2>" +
                "<ol>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "<li> Java </li>" +
                "</ol>" +
                "<a href='/form'>Form</a>" +
                "</html>";
        String withData =
                "<html>" +
                "<h1>" + name + "'s fav programs! </h1>" +
                "<h2> Here's the list! </h2>" +
                "<ol>" +
                "<li>"+ firstLang + " </li>" +
                "<li>"+ secLang + "</li>" +
                "<li>"+ thirdLang + "</li>" +
                "</ol>" +
                "<a href='/form'>Form</a>" +
                "</html>";

        if (name != null || firstLang != null || secLang != null || thirdLang != null){
            return withoutData;
        } else {
            return withData;
        }
    }

    @GetMapping("form")
    public String formInfo(){
        return "<html>" +
                "<body>" +
                "<label> Enter your name</label>" +
                "<form action='/' method='post'>" + //submits a request
                "<input type='text' name='name'>" +
                "<input type='submit'>" +
                "<br><br>" +

                "<label > Select your favorite programming language" +
                "<br><br>" +
                "<select name=firstLang>" +
                "<option> JavaScript" +
                "<option> Python" +
                "<option> Java" +
                "<option> C++" +
                "<option> HTMLOL" +
                "</select>" +
                "</label>" +

                "<br><br>" +

                "<label> Select your second favorite programming language" +
                "<br><br>" +
                "<select name=secLang>" +
                "<option> JavaScript" +
                "<option> Python" +
                "<option> Java" +
                "<option> C++" +
                "<option> HTMLOL" +
                "</select>" +
                "</label>" +

                "<br><br>" +

                "<label> Select your third favorite programming language" +
                "<br><br>" +
                 "<select name=thirdLang>" +
                "<option> JavaScript" +
                "<option> Python" +
                "<option> Java" +
                "<option> C++" +
                "<option> HTMLOL" +
                "</select>" +
                "</label>" +
                "</form>" +
                "</body>" +
                "<a href='/'>Home</a>" +
                "</html>";
    }



}

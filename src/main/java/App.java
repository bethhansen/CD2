
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.CD;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    private static String success;

    public static void main(String[] args) { //type “psvm + tab” to autocreate this :)
        staticFileLocation("/public");

        get("/",(req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<CD> cd = CD.getAll();
            model.put("hotel", cd);

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

    post("/cd/new", (request, response) -> { //URL to make new post on POST route
        Map<String, Object> model = new HashMap<String, Object>();
        String content = request.queryParams("content");
        CD newPost = new CD(content);
        return new ModelAndView(model, "success.hbs");
    }, new HandlebarsTemplateEngine());
}
}
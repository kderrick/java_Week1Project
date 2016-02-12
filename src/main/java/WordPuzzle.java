import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    get("/", (request, response) -> {
      HashMap model = new HashMap();

    model.put("template", "templates/index.vtl");
    return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      String userString = request.queryParams("inputString");
      String createdPuzzle = WordPuzzle.vowelRemover(userString);

      model.put("createdPuzzle", createdPuzzle);
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String vowelRemover(String inputString) {
    return inputString.replaceAll("[aeiouAEIOU]", "-");
    }
}

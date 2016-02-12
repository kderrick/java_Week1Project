import java.util.HashMap;

import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] args) {
    // staticFileLocation("/public");
    // String layout = "templates/layout.vtl";
    // get("/", (request, response) -> {
    //   HashMap model = new HashMap();
    //
    // model.put("template", "templates/index.vtl");
    // return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    //
    // get("/results", (request, response) -> {
    //   HashMap model = new HashMap();
    //   String userNumber = request.queryParams("numberInput");
    //   Integer intUserNumber = Integer.parseInt(userNumber);
    //   Integer[] userCoinArray = coinCounter(intUserNumber);
    //   Integer pennies = userCoinArray[0];
    //   Integer nickels = userCoinArray[1];
    //   Integer dimes = userCoinArray[2];
    //   Integer quarters = userCoinArray[3];
    //
    //   model.put("pennies", pennies);
    //   model.put("nickels", nickels);
    //   model.put("dimes", dimes);
    //   model.put("quarters", quarters);
    //
    //   model.put("template", "templates/results.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }

public static String vowelRemover(String inputString) {
  return inputString.replaceAll("[ae]", "-");
  }
}

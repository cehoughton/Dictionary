
 import java.util.Map;
 import java.util.HashMap;
 import java.util.ArrayList;

 import spark.ModelAndView;
 import spark.template.velocity.VelocityTemplateEngine;
 import static spark.Spark.*;

 public class App {
   public static void main(String[] args){
     staticFileLocation("/public");
    String layout = "templates/layout.vtl";

   get("/", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     model.put("template", "templates/index.vtl");
     return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  get("/word-form", (request, response) -> {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/word-form.vtl");
    return new ModelAndView(model, layout);
 }, new VelocityTemplateEngine());


   post("/words", (request,response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     Word word = new Word(request.queryParams("inputWord"));

     model.put("words", Word.all());
     model.put("template", "templates/words.vtl");
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());

  //  get("/words/new", (request,response) -> {
  //    Map<String, Object> model = new HashMap<String, Object>();
   //
   //
   //
  //    model.put("template", "templates/words.vtl");
  //    return new ModelAndView(model, layout);
  //  }, new VelocityTemplateEngine());

   get("/words/:id", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     Word word = Word.find(Integer.parseInt(request.params(":id")));
     model.put("word", word);
     model.put("template", "templates/individualword.vtl");
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());

   get("/words/:id/new-word-def-form", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     Word word = Word.find(Integer.parseInt(request.params(":id")));
     ArrayList<Definition> definitions = word.getDefinitions();

     model.put("word", word);
     model.put("definitions", definitions);
     model.put("template", "templates/word-def-form.vtl");
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());

  //  get("/individualword",(request, response) -> {
  //    Map<String, Object> model = new HashMap<String, Object>();
  //    model.put("words", Word.all());
  //    model.put("template", "templates/individualword.vtl");
  //    return new ModelAndView(model, layout);
  //  }, new VelocityTemplateEngine());
   //
   //
  //  get("/word-def-form", (request, response) -> {
  //    Map<String, Object> model = new HashMap<String, Object>();
   //
   //
  //    model.put("template", "templates/word-def-form.vtl");
  //    return new ModelAndView(model, layout);
  //  }, new VelocityTemplateEngine());

   post("/words/:id", (request,response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     Definition definition = new Definition(request.queryParams("inputDef"));

     model.put("words", Word.all());
     model.put("definitions", Definition.all());
     model.put("template", "templates/individualword.vtl");
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());




  }
}
   //
  //     String description = request.queryParams("description");
  //     Definition newDef = new Definition(description);
  //     request.session().attribute("description", newDef);
   //
  //     model.put("description", request.session().attribute("newDef"));
  //     model.put("template", "templates/output.vtl");
  //     return new ModelAndView(model, layout);
  //  }, new VelocityTemplateEngine());
 //   get("/output", (request, response) -> {
 //     Map<String, Object> model = new HashMap<String, Object>();
 //     model.put("template", "templates/output.vtl");
 //
 //     String inputString = request.queryParams("word");
 //     String puzzleOut = puzzleConverter(inputString);
 //
 //     model.put("word", inputString);
 //     model.put("pword", puzzleOut);
 //    return new ModelAndView(model, layout);
 // }, new VelocityTemplateEngine());

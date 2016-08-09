package com.company;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

public class CalculatorSpark {


    public static void runOnSpark(String [] args) {

        Spark.staticFileLocation("/templates");

        String port = System.getenv("PORT");
        if (port != null) {
            int portInt = Integer.parseInt(port);
            Spark.port(portInt);
        }
//        Spark.port(80);

        Spark.get("/calculator",
                (request, response) -> {
                    String number1 = request.queryParams("number1");
                    String number2 = request.queryParams("number2");
                    String operation = request.queryParams("operation");

                    int result;
                    int number1a = Integer.parseInt(number1);
                    int number2a = Integer.parseInt(number2);

                    if(operation.equals("+")){
                        result = Calculator.add(number1a, number2a);
                    } else {
                        result = Calculator.subtract(number1a,number2a);
                    }


                    Map<String, Object> model = new HashMap();
                    model.put("result", result);
//                    model.put("number1", number1);
//                    model.put("number2", number2);
                    model.put("atrybut1", "tralala");

                    return new ModelAndView(model, "result.ftl");
                }, new FreeMarkerEngine());


        Spark.get("/participant", (request, response) -> {
            String name = request.queryParams("name");
            String surname = request.queryParams("surname");

                    Map<String, Object> model = new HashMap();
                    model.put("name", name);
                    model.put("surname", surname);

                    return new ModelAndView(model, "participant.ftl");
                }, new FreeMarkerEngine());


        Spark.get("/user_query", (request, response) -> {
            return "<html>" +
                    "<form action=\"/participant\">" +
                    "<input name=\"name\">" +
                    "<input name=\"surname\">" +
                    "<input type=\"submit\">" +
                    "</form></html>";
        });
        }

}

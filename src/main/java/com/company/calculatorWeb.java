package com.company;

import spark.Spark;

import java.util.function.BiFunction;

public class calculatorWeb {


    public static void main(String [] args) {

        String port = System.getenv("PORT");
        if (port !=null){
            int portInt = Integer.parseInt(port);
            Spark.port(portInt);
        }

        Spark.get("/calculator",
                (request, response) -> {
                    String number1 = request.queryParams("number1");
                    String number2 = request.queryParams("number2");


            return "<html><b>hey</b> buddy! Your numbers:
                    +number1
                    +", "
                    +number2
                    +"</html>";
                    ;
        });

        Spark.get("/contact", ((request, response) -> {
            return "<html>" +
                    "<form action=\"/calculator\">" +
                    "<input name=\"number1\">" +
                    "<input name=\"number2\">" +
                    "<input type=\"submit\">" +
                    "</form></html>";
        }));

    }
}





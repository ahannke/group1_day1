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
            return "<html>hey <b>buddy</b></html>";
        });

        Spark.get("/contact", ((request, response) -> {
            return "<html>" +
                    "<form action=\"/calculator\">" +
                    "<input name=\"number1\">" +
                    "<input name=\"number2\">" +
                    "<input name=\"submit\">" +
                    "</form></html>";
        }));

    }
}





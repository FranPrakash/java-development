package com.pluralsight;

import javax.xml.transform.Source;

//Exercise 2 Lambda Expression
public class LambdaExample {

    public static void main(String[] args) {
        NumericOperator addition = (a, b) -> a + b; // arrow means become
        int sum = addition.operate(1, 1);
        System.out.println(sum);


        //Exercise 3

        NumericOperator maxTwoNumber = (a, b) -> Math.max(a, b); //a,b becomes maximum of a, b
       //int max = maxTwoNumber(1, 2); //store max number result



    }
}


//numeric operator  no = new numeric operator (){
//public int operate (int a, int b){
// return a+b
//int addition = addition.operante(1,1);
//sout (addition )
// }
//}
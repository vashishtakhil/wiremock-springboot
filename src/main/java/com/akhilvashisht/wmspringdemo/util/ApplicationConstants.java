package com.akhilvashisht.wmspringdemo.util;

public interface ApplicationConstants {
    interface Request{
        interface Headers{

        }
        interface Urls{
            String FOO = "/foo";
        }
    }
    interface Response{
        interface Status{
            Integer OK = 200;
        }
        interface Body{
            String SUCCESS_MESSAGE ="Hello World!";
        }
    }
}

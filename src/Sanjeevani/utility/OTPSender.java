/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevani.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

/**
 *
 * @author sharm
 */
public class OTPSender implements Sender {

    @Override
    public boolean send(String number, String data)throws Exception {
        
            Unirest.setTimeouts(0, 0);
            String mobNo=number;
            int otp=Integer.parseInt(data);
            String url = "https://2factor.in/API/V1/972e5e83-c602-11ed-81b6-0200cd936042/SMS/"+mobNo+"/"+otp+"/OTP1";
            System.out.println("OTP is:"+otp);
            GetRequest gr=Unirest.get(url);
            HttpResponse<String>response=gr.asString();
            String result=response.getBody();
            return result.contains("Success");
        }
    }
    
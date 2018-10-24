package com.pembe.contact.service;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class SmsSenderService {

    public static final String ACCOUNT_SID =
            "AC0e9ad9997e2269ac844df8adca93f455";
    public static final String AUTH_TOKEN =
            "188c3b63a52fea0e875487984cfc1a3e";



        public void sendSms (String message, String number){
// Find your Account Sid and Auth Token at twilio.com/console

            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

            Message send = Message
                    .creator(new PhoneNumber("+237671840646"), // to
                            new PhoneNumber("+18065135654"), // from
                            "Where's Wallace?")
                    .create();

            System.out.println(send.getSid());
        }





}

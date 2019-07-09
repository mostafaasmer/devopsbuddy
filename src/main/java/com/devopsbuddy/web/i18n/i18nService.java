package com.devopsbuddy.web.i18n;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class i18nService {

    @Autowired
    private MessageSource messageSource;

    //return msg for id and default local
    public String getmsg(String msgid ) {
        Locale local= LocaleContextHolder.getLocale();
        return getmsg(msgid,local);
    }

    //return msg for given id and specific local
    public String getmsg(String msgid,Locale local) {
        return messageSource.getMessage(msgid,null,local);
    }
}

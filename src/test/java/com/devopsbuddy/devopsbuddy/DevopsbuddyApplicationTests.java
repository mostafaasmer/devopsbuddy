package com.devopsbuddy.devopsbuddy;

import com.devopsbuddy.web.i18n.i18nService;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

    @Autowired
    i18nService i18nservice;

    @Test
    public void testmsgbylocal() throws Exception
    {
        String expected ="Bootstrap starter template";
        String msgid ="index.main.callout";
        String actual =i18nservice.getmsg(msgid);
        Assert.assertEquals("dont match",expected,actual);
    }
}

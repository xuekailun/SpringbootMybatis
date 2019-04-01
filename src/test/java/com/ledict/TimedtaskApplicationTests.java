package com.ledict;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ledict.entity.Calendar;
import com.ledict.service.ICalendarService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TimedtaskApplicationTests {

    @Autowired
    private ICalendarService iCalendarService;

    @Test
    public void contextLoads() {


        List<Calendar> calendars = iCalendarService.getAll();



        log.info("calendars :{}",JSON.toJSONString(calendars));
    }

}

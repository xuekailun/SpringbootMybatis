package com.ledict.service.impl;

import com.ledict.dao.CalendarDao;
import com.ledict.entity.Calendar;
import com.ledict.service.ICalendarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CalendarServiceImpl implements ICalendarService {

    private final CalendarDao calendarDao;

    @Autowired
    public CalendarServiceImpl(CalendarDao calendarDao) {
        this.calendarDao = calendarDao;
    }

    public List<Calendar> getAll(){
        return calendarDao.getAll();
    }
}

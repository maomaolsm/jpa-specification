package com.example.controller;

import com.example.controller.domain.OrderNo;
import com.example.persistence.OrderNoRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Created by maomao on 6/23/16.
 */
@RestController
@RequestMapping("/ordernos")
public class OrderNoController {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private OrderNoRepository orderNoRepository;

    //@Version测试
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void modify() {
        OrderNo orderNo = orderNoRepository.findOne(Long.parseLong(LocalDate.now().getYear() + String.format("%2d", LocalDate.now().getMonthValue()).replace(" ", "0") + ""));
        if(orderNo==null){
            orderNo=new OrderNo();
            orderNo.setId(Long.parseLong(LocalDate.now().getYear() + String.format("%2d", LocalDate.now().getMonthValue()).replace(" ", "0") + ""));
            orderNo.setCount(0);
        }else {
            orderNo.setCount(orderNo.getCount()+1);
        }
        orderNoRepository.saveAndFlush(orderNo);
    }
}

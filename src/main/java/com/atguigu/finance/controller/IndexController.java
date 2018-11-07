package com.atguigu.finance.controller;

import java.lang.invoke.VolatileCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.atguigu.finance.dao.ContractAttributeMapper;
import com.atguigu.finance.service.ContractAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.finance.bean.LoanContract;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class IndexController {

    @Autowired(required=true)
    ContractAttributeService  contractAttributeService;

    @RequestMapping("index")
    public String index(){

        return "index";
    }
@RequestMapping("toContract")
	public String toContract(HttpServletRequest request){
   List<String> list=contractAttributeService.getAll();
    HttpSession session = request.getSession();
    session.setAttribute("list",list);
        return "contract";
    }
}

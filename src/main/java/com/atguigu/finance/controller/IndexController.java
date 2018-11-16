package com.atguigu.finance.controller;

import java.lang.invoke.VolatileCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.alibaba.fastjson.JSON;
import com.atguigu.finance.bean.*;
import com.atguigu.finance.dao.ContractAttributeMapper;
import com.atguigu.finance.service.ContractAttributeService;
import com.atguigu.finance.service.RepaymentPlanService;
import com.atguigu.finance.service.impl.RepaymentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class IndexController {

    @Autowired(required = true)
    ContractAttributeService contractAttributeService;
   @Autowired
    RepaymentRecordService repaymentRecordService;
    @RequestMapping("index")
    public String index() {

        return "index";
    }

    @RequestMapping("toContract")
    public String toContract(HttpServletRequest request) {
        List<ContractAttribute> list = contractAttributeService.getAll();
        HttpSession session = request.getSession();
        session.setAttribute("list", list);
        for (ContractAttribute contractAttribute : list) {
            System.out.println(contractAttribute.getLoanContractNum());
        }

        System.out.print("--------------");
        return "contract";
    }

    @RequestMapping("toRepaymentRecord")
    public String toRepaymentRecord(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<ContractAttribute> lists = (List<ContractAttribute>) session.getAttribute("list");


        ContractnoVo longnum = contractAttributeService.getSingle(lists.get(0).getLoanContractNum());

        System.out.println("[-_-]" + longnum.toString());
        session.setAttribute("longnum", longnum);

        return "repaymentRecord";
    }

    @RequestMapping(value = "toSelect")
    @ResponseBody
    public String toSelect(@RequestParam("contractno") String contractno, HttpServletRequest request) throws Exception {
        System.out.println("*******" + contractno);
        ContractAttribute contractAttribute = new ContractAttribute();
        contractAttribute.setLoanContractNum(Integer.parseInt(contractno));
        ContractAttributeVo data = contractAttributeService.getData(contractAttribute);
        System.out.println("--------++++" + data.toString());
        HttpSession session = request.getSession();
        session.setAttribute("data", data);
        String datas = JSON.toJSONString(data);
        return datas;
    }

    @RequestMapping("toUpdateRepayment")
    public String toUpdateRepayment() {
        return "updateRepayment";
    }
//nplm_repayment_record` 表
    @ResponseBody
@RequestMapping("toGetResource")
public String  toGetResource(@RequestParam("loanContractNum") String loanContractNum,HttpServletRequest request) {

    RepaymentRecordVo repay =repaymentRecordService.getData(loanContractNum);
        HttpSession session = request.getSession();
        session.setAttribute("repay",repay);
        System.out.println("{-.-}"+repay.toString());
    String s = JSON.toJSONString(repay);
    return s;
}

}
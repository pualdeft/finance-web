<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.atguigu.finance.bean.ContractAttribute" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<title>合同列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/model.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/model_info.css" type="text/css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/smp/zTreeStyle.css">
<link rel="stylesheet"  href="${pageContext.request.contextPath}/static/plugins/easyUI/themes/default/easyui.css" type="text/css">    
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/easyUI/themes/icon.css" type="text/css">  

<script src="${pageContext.request.contextPath}/static/js/jquery-1.7.1.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/easytooltip.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.form.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/plugins/easyUI/jquery.easyui.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/easyUI/locale/easyui-lang-zh_CN.js"></script>


<style type="text/css">
.td_1{font-size:12px;}

</style>
<style type="text/css">
td {
 text-align: center;
 
} 
</style>
<script>

$(function(){
	var fromDate;
	
	$('#idNumber').validatebox({
		required: true,
	    validType: 'idcard'
	});

	//客户姓名和证件号验证
	$.extend($.fn.validatebox.defaults.rules, {   
	    idcard : {   
	        validator : function(value) { 
	            return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value); 
	        }, 
	        message : '证件号码格式不正确' 
		},
		checkDateTime: {
	        validator : function(value, param) {
	        	fromDate = $(param[0]).val();
	        	if (fromDate!=""){
	        		if (fromDate.replace(/-/g,"") > value.replace(/-/g,"")){
	        			return false;
	        		} else {
	        			return true;
	        		}
	        	} else {
	        		return true;
	        	}
	        }, 
	        message : '开始日期应小于结束日期' 
		}
	});	
	
	var sValue = $("#loanKind").val();
	$('#loanKindName').combobox({
		onBeforeLoad: function(param){
			if (sValue != ""){
				$('#loanKindName').combobox('select', [sValue]);
			}
		},
		onSelect: function(rec){
			$("#loanKind").val(rec.value);
		}
	});
}); 


//重置
function clearForm(){
	$('#clientName').val("");
	$('#idNumber').val("");
	$('#selectedOffice').datebox('setValue', '');
	$('#productsTypeName').datebox('setValue', '');
	$('#productsTypeName').combobox('select', "");
}
</script>

<script type="text/javascript">
$(document).ready(function(){
	$('table.datagrid-htable').find('.datagrid-cell').css("text-align", 'center');
	$('table.datagrid-btable').find('.datagrid-cell-c1-item_id23').css("text-align", 'right');
	$('table.datagrid-btable').find('.datagrid-cell-c1-item_id30').css("text-align", 'right');
	$('table.datagrid-btable').find('.datagrid-cell-c1-item_id34').css("text-align", 'right');
});
</script>
<script type="text/javascript">
$(document).ready(function(){
	$('table.datagrid-htable').find('.datagrid-cell').css("text-align", 'center');
	$('table.datagrid-btable').find('.datagrid-cell').css("text-align", 'center');
	$('table.datagrid-btable').find('.datagrid-cell-c1-item_id23').css("text-align", 'right');
	$('table.datagrid-btable').find('.datagrid-cell-c1-item_id27').css("text-align", 'right');
	$('table.datagrid-btable').find('.datagrid-cell-c1-item_id30').css("text-align", 'right');

	$('#dd').combotree('loadData', [{ id: 1, text: '贷款品种', children: [
	{ id: 11, text: '新薪贷' },
	{ id: 12, text: '学信通' },
	{ id: 13, text: '精英贷' },
	{ id: 14, text: '助学贷' },
	{ id: 15, text: '助业贷' },
	{ id: 16, text: '助业宜楼贷' },
	{ id: 17, text: '新薪宜楼贷' },
	{ id: 18, text: '学历贷' },
	{ id: 19, text: '宜商贷' },
	{ id: 20, text: '宜车贷' },
	{ id: 21, text: '小企业贷' },
	{ id: 22, text: '房贷' },
	{ id: 23, text: '慧聪（高级）' },
	{ id: 24, text: '慧聪（三年）' },
	{ id: 25, text: '慧聪（普通）' }
	] }]);	
	
});
</script>

<div>&nbsp;</div>
    		<form id="searchForm" method="post" action="/toSelect">
		    	<table style="height: auto; width: 100%;" >
		    		<tbody>
					<tr>
						<td width="10%" class="td_1">
		    				合同编号：
		    			</td>
		    			<td width="20%">
		    				<input  id="contractno" name="contractno" style="width:188px;" value="">
		    				<input type="hidden" id="pPage" name="pageSize" value=""> 
		    				<input type="hidden" id="pSize" name="pageSize" value=""> 
		    				<input type="hidden" id="sysId" name="sysId" value="11">
		    			</td>
						<td width="10%" class="td_1">
		    				客户姓名：
		    			</td>
		    			<td width="20%">
		    				<input  id="clientName" name="clientName" style="width:188px;" value="">
		    				<input type="hidden" id="pPage" name="pageSize" value=""> 
		    				<input type="hidden" id="pSize" name="pageSize" value=""> 
		    				<input type="hidden" id="sysId" name="sysId" value="11">
		    			</td>
						<td width="10%" class="td_1">
		    				证件号：
		    			</td>
		    			<td width="20%">
		    				<input  id="certificate" name="certificate" style="width:188px;" value="">
		    				<input type="hidden" id="pPage" name="pageSize" value=""> 
		    				<input type="hidden" id="pSize" name="pageSize" value=""> 
		    				<input type="hidden" id="sysId" name="sysId" value="11">
		    			</td>
						</tr>
						<tr>
						<td width="8%" class="td_1">贷款品种： </td>
							<td width="26%">
								<input type="hidden" id="selectedOffice" name="selectedOffice" value="172,58,11,15,9,104,195,165,193,53,33,1,54,260,11011192,47,113,6,273,22,57,134,129,271,127,100,197,85,28,301,62,175,155,101,223,250,1,222,200,249,204,135,163,159,272,123,42,95,23,144,20,75,32,207,224,142,120,3,11011279,11009482,137,203,270,25,6,151,181,116,247,72,262,184,110,66,186,138,167,130,221,12,269,189,274,21,152,251,88,114,76,201,202,31,178,26,98,69,241,230,106,162,265,43,107,68,65,121,206,99,73,141,191,63,17,196,78,133,157,148,231,239,299,176,160,131,70,161,154,51,111,168,214,71,11011325,11110829,96,248,41,118,109,153,124,194,303,102,268,11011192,94,64,29,60,36,97,6,240,147,24,145,90,87,238,132,94,74,192,3,302,11011279,112,188,243,185,39,55,16,187,267,23,103,177,190,139,128,275,115,237,261,146,136,44,217,166,182,173,149,228,122,150,59,10,263,67,93,183,44,46,14,125,170,40,205,301,50,23,300,212,174,126,77,276,229,79,164,156,13,158,35,89,86,172"> 
								<span class="searchbox" style="width:189px;"> 
								<input class="searchbox-text" type="text" id="selectedOfficeName" name="selectedOfficeName" style="width:169px;" value="宜信公司，新薪贷......" readonly="readonly" data-options="required:'true'">
								<span class="searchbox-button" onClick="deptree('open');"></span>
								</span>
							</td>	
						<td width="10%" class="td_1">城市地区：</td>
						<td width="20%">
		    				<input  id="urban" name="urban" style="width:188px;" value="">
		    				<input type="hidden" id="pPage" name="pageSize" value=""> 
		    				<input type="hidden" id="pSize" name="pageSize" value=""> 
		    				<input type="hidden" id="sysId" name="sysId" value="11">
		    			</td>
					<td width="10%" class="td_1">营业部：</td>
						<td width="20%">
		    				<input  id="business" name="business" style="width:188px;" value="">
		    				<input type="hidden" id="pPage" name="pageSize" value=""> 
		    				<input type="hidden" id="pSize" name="pageSize" value=""> 
		    				<input type="hidden" id="sysId" name="sysId" value="11">
		    			</td>
						</tr>
				<tr>
					<td width="10%" class="td_1">合同状态：</td>
						<td width="20%">
							<select class="easyui-combobox combobox-f combo-f" id="type" style="width: 195px; display: none;" editable="fales" name="type">
								<option value="0">请选择</option>
								<option value="1">合同废止</option>
								<option value="2">未放款</option>	
								<option value="3">还款中</option>	
								<option value="4">逾期</option>
								<option value="5">正常结清</option>	
								<option value="6">合同终止</option>	
								<option value="7">合同核销</option>
								<option value="8">减免结清</option>	
								<option value="9">特殊减免结清</option>
								<option value="10">提前结清</option>	
								<option value="11">放款退回结清</option>
							</select>		
						</td> 	
						<td width="10%" class="td_1">合同签订时间： </td>
						<td width="20%">  
							<input type="text" id="repaymentStart" style="width: 80px; display: none;" class="easyui-datetimebox" value="" comboname="repaymentStart">
							- 
							<input type="text" id="repaymentEnd" style="width: 80px; display: none;" class="easyui-datetimebox" value="" data-options="validType:'checkDateTime[\'#searchForm input[name=repaymentStart]\']'" comboname="repaymentEnd">
						</td>
						<td width="10%" class="td_1">放款时间： </td>
						<td width="20%">  
							<input type="text" id="repaymentStart" style="width: 80px; display: none;" class="easyui-datetimebox" value="" comboname="repaymentStart">
							- 
							<input type="text" id="repaymentEnd" style="width: 80px; display: none;" class="easyui-datetimebox" value="" data-options="validType:'checkDateTime[\'#searchForm input[name=repaymentStart]\']'" comboname="repaymentEnd">
						</td>
					</tr>
					<tr>
						<td width="10%" class="td_1">信托机构：</td>
						<td width="20%">
							<select class="easyui-combobox combobox-f combo-f" id="type" style="width: 195px; display: none;" editable="fales" name="type">
								<option value="0">请选择</option>
								<option value="1">中航信托</option>
								<option value="2">华澳华宜</option>	
								<option value="3">……</option>	
							</select>		
						</td> 
				   <td width="10%" class="td_1">信托产品系列：</td>
						<td width="20%">
							<select class="easyui-combobox combobox-f combo-f" id="type" style="width: 195px; display: none;" editable="fales" name="type">
								<option value="0">请选择</option>
								<option value="1">天宜</option>
								<option value="2">天驰</option>	
								<option value="3">天惠</option>	
								<option value="4">……</option>
							</select>		
						</td> 
				    <td width="10%" class="td_1">信托计划：</td>
						<td width="20%">
							<select class="easyui-combobox combobox-f combo-f" id="type" style="width: 195px; display: none;" editable="fales" name="type">
								<option value="0">请选择</option>
								<option value="1">1号</option>
								<option value="2">2号</option>	
								<option value="3">3号</option>	
								<option value="4">4号</option>
								<option value="5">5号</option>
								<option value="6">6号</option>	
								<option value="7">……</option>
							</select>
						</td> 
						</tr>
					<tr>
						 <td width="8%" class="td_1">业务模式： </td>
									<td width="26%">
										<select class="easyui-combobox combobox-f combo-f" id="ret_code_status" style="width: 190px; display: none;" editable="fales" comboname="productsTypeName">
								<option value="0">请选择</option>
								<option value="1">信托</option>
								<option value="2">转债权</option>	
								<option value="3">融资租赁</option>	
								<option value="4">火凤凰</option>	
								<option value="5">互联网</option>
							</select>
						</td>					 
					 <td width="8%" class="td_1">合同变更类型： </td>
									<td width="26%">
										<select class="easyui-combobox combobox-f combo-f" id="ret_code_status" style="width: 190px; display: none;" editable="fales" comboname="productsTypeName">
								<option value="0">请选择</option>
								<option value="1">转产品</option>
								<option value="2">展期</option>
								<option value="2">全部字段</option>
							</select>
						</td>	
				   </tr>
				

					<tr>
						 <td width="10%" class="td_1"></td>
		    			<td width="20%">
						 <td width="10%" class="td_1"></td>
		    			<td width="20%">
						 <td width="10%" class="td_1"></td>
		    			<td width="20%">
						
		               		<a href="javascript:void(0)" class="easyui-linkbutton l-btn" onClick="searchInfo();" group="" id="">查询</a>
		               		&nbsp;
		               		<a href="javascript:void(0)" class="easyui-linkbutton l-btn" onClick="clearForm()" group="" id="">重置</a>								
		               	</td>
					</br>
					</tr>
							
		    	</tbody>
				</table>
		    </form>
	<div>&nbsp;</div>
	<div class="panel datagrid" style="width: auto;">
	    <div class="panel-header" style="width: auto;"><div class="panel-title">合同列表</div><div class="panel-tool"></div></div> 
	<table id="tt" class="easyui-treegrid" style="width:auto;height:250px"   
         pagination="true"  >
       <thead>   
        <tr>   
				<th data-options="field:'item_id1',width:200">操作</th>	
				<th data-options="field:'item_id2',width:100">合同编号</th> 
				<th data-options="field:'item_id15',width:100">合同状态</th>

				<th data-options="field:'item_id3',width:100">客户姓名</th>
				<th data-options="field:'item_id4',width:120">证件类型</th>
				<th data-options="field:'item_id5',width:150">证件号</th>
				
				
				<th data-options="field:'item_id6',width:100">贷款品种</th>
				<th data-options="field:'item_id55',width:100">业务模式</th>
				<th data-options="field:'item_id7',width:100">信托机构</th>
				<th data-options="field:'item_id8',width:100">信托产品系列</th>
				<th data-options="field:'item_id9',width:100">信托计划</th>
				<th data-options="field:'item_id10',width:100">城市地区</th>
				
				<th data-options="field:'item_id11',width:100">营业部</th>
				<th data-options="field:'item_id12',width:100">是否加急</th>
				<th data-options="field:'item_id13',width:100">签约方式</th>
				<th data-options="field:'item_id14',width:150">合同签订时间</th>
				
				<th data-options="field:'item_id33',width:100">合同变更类型</th>
				<th data-options="field:'item_id34',width:100">合同变更金额</th>
				
				
				<th data-options="field:'item_id16',width:100">分期数</th>
				<!--th data-options="field:'item_id17',width:100">是否逾期</th>
				<th data-options="field:'item_id18',width:100">现存逾期天数</th-->
				<th data-options="field:'item_id19',width:100">是否循环贷</th>
				<th data-options="field:'item_id20',width:100">循环贷次数</th>
				
				<th data-options="field:'item_id24',width:100">还款起始日期</th>
				<th data-options="field:'item_id21',width:100">还款终止日期</th>
				<th data-options="field:'item_id22',width:110">合同结清日期</th>
				<th data-options="field:'item_id23',width:100">借款金额</th>
				<th data-options="field:'item_id25',width:100">还款银行</th>
				
				<th data-options="field:'item_id26',width:150">还款银行账号</th>
				<th data-options="field:'item_id27',width:100">前期费用总额</th>
				<th data-options="field:'item_id28',width:100">放款模式</th>
				<th data-options="field:'item_id29',width:150">放款时间</th>
				<th data-options="field:'item_id30',width:100">放款金额</th>
        </tr>   		
		
    </thead>

	<tbody>
	<c:forEach var="contract" items="${sessionScope.list}">
        <tr>  
			<td>
				<a href="toRepaymentRecord" onClick="window.open(this.href,    '_self',    'scrollbars=yes');return  false">查看还款情况</a>
				<a href="toUpdateRepayment" onClick="window.open(this.href,    '_self',    'scrollbars=yes');return  false">修改还款情况</a>
				</td>
			<td>${contract.loanContractNum}</td>
			<td>还款中</td>
			
			<td>谢青</td>
			<td>居民第二代身份证</td>
			<td>2222 2222 2222 2222</td>
			
			<td>房贷一抵反担保</td>
			<td>信托</td>
			<td>中航信托</td>
			<td>天惠</td>
			<td>4号</td>
			<td>北京</td>

			<td>北京东城营业部</td>
			<td>否</td>
			<td>电签</td>
			<td>2012-05-14 12:32:22</td>
			
			<td></td>
			<td></td>
			<td>48</td>
			<!--td>否</td>
			<td>0</td-->
			<td>是</td>
			<td>1</td>
			
			<td>2012-06-15</td>
			<td></td>
			<td></td>
			<td>¥20,000.00</td>
			<td>北京银行</td>

			<td>6228 8888 8888 8888 888</td>
			<td>¥2,000.00</td>
			<td>先收费后放款</td>
			<td>2012-05-15 12:32:22</td>
			<td>¥19,000.00</td>
        </tr>
	</c:forEach>
    </tbody>

</table>  
</body>
<
<script language="JavaScript">
    function searchInfo(){

        $("#searchForm").ajaxSubmit({

           datatype:"json",
            success:function(result){
                alert(result);
                if(result!=null){
                    alert(result);

                }else{
                    alert("处理请求失败!", {time:2000, icon:5, shift:6});
                }
            }

        });
    }


</script>
</html>
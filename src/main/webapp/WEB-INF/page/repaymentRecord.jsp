<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE9"
	content="ie=edge" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>smp</title>
<meta content="no-cache" http-equiv="Pragma">
<meta content="no-cache" http-equiv="Cache-Control">
<meta content="0" http-equiv="Expires">

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/model.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/model_info.css"
	type="text/css"></link>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/smp/zTreeStyle.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/plugins/easyUI/themes/default/easyui.css"
	type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/easyUI/themes/icon.css"
	type="text/css">

<script src="${pageContext.request.contextPath}/static/js/jquery-1.7.1.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/easytooltip.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.form.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/plugins/easyUI/jquery.easyui.min.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/plugins/easyUI/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/formValidatorRegex.js"></script>

</head>
<body>
	<title></title>

	<style type="text/css">
td {
	border: dotted 1px rgb(204, 204, 204);
	font-size: 12px;
}

input {
	font-size: 12px;
}

select {
	font-size: 12px;
}
</style>

	<style type="text/css">
.page_my {
	width: 69%;
	height: 120%;
	margin: 0;
	overflow-y: scroll;
}
</style>
	<script type="text/javascript">
	$(document).ready(
			function() {
				$('table.datagrid-htable').find('.datagrid-cell').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-row').css(
						"text-align", 'right');
				$('table.datagrid-btable').find('.datagrid-cell-c1-name1').css(
						"text-align", 'center');

				$('table.datagrid-btable').find('.datagrid-cell-c2-name1').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c2-name7').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c2-name3').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c2-name4').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c2-name5').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c2-name6').css(
						"text-align", 'center');

				$('table.datagrid-btable').find('.datagrid-cell-c3-name1').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c3-name2').css(
						"text-align", 'center');

				$('table.datagrid-btable').find('.datagrid-cell-c4-name1').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c4-name2').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c4-name3').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c4-name4').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c4-name5').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c4-name6').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c4-name7').css(
						"text-align", 'center');

				$('table.datagrid-btable').find('.datagrid-cell-c5-name1').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c5-name2').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c5-name3').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c5-name4').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c5-name5').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c5-name6').css(
						"text-align", 'center');
				$('table.datagrid-btable').find('.datagrid-cell-c5-name7').css(
						"text-align", 'center');
			});
</script>

	<table id="table_OperateBtn" border=0>
		<tbody>
			<tr>
				<td><span id="submit_right"> &nbsp; <a id="backButten"
						href="javascript:window.history.go(-1)"
						class="easyui-linkbutton l-btn" group="">返回</a>
				</span></td>
			</tr>
		</tbody>
	</table>
	<div class="easyui-tabs" style="width: auto; height: auto;">


		<div title="现行还款方案情况" style="padding: 10px;">

			<table id="table_" style="width: 100%;">
				<tr id="tr_cell">
					<td id="td_d2">合同编号：</td>
					<td id="td_i"><span id="typeName" class="repaymentScheme">${sessionScope.longnum.loanContractNum}</span></td>
					<td id="td_d2">客户姓名：</td>
					<td id="td_i"><span id="typeName" class="repaymentScheme">李香琴</span></td>
					<td id="td_d2">证件号：</td>
					<td id="td_i"><span id="typeName" class="repaymentScheme">2222
							2222 2222 2223</span></td>
					<td id="td_d2">还款银行：</td>
					<td id="td_i"><span id="typeName" class="repaymentScheme">中国农业银行</span></td>


				</tr>
				<tr id="tr_cell">
					<td id="td_d2">还款银行账号：</td>
					<td id="td_i"><span id="bankAccount" class="repaymentScheme">6228460320002783xxx</span></td>
					<td id="td_d2">借款金额：</td>
					<td id="td_i"><span id="amount" class="repaymentScheme">1,465,267.01</span></td>
					<td id="td_d2">放款金额：</td>
					<td id="td_i"><span id="amount" class="repaymentScheme">1,465,267.01</span></td>
					<td id="td_d2">放款时间：</td>
					<td id="td_i"><span id="startTime" class="repaymentScheme">2010-11-03
							13:10:00</span></td>


				</tr>
				<tr id="tr_cell">
					<td id="td_d2">还款起始日期：</td>
					<td id="td_i"><span id="startTime" class="repaymentScheme">2010-11-03</span></td>
					<td id="td_d2">还款终止日期：</td>
					<td id="td_i"><span id="endTime" class="repaymentScheme">2010-11-03</span></td>

					<td id="td_d2">合同状态：</td>
					<td id="td_i"><span id="contractLevel" class="repaymentScheme">还款中</span></td>
					<td id="td_d2">分期数：</td>
					<td id="td_i"><span id="amortisation" class="repaymentScheme">1</span></td>


				</tr>

				<tr id="tr_cell">
					<td id="td_d2">已还款期数：</td>
					<td id="td_i"><span id="periods" class="repaymentScheme">0</span></td>
					<td id="td_d2">现存逾期开始日期：</td>
					<td id="td_i"><span id="addTime" class="repaymentScheme">2010-11-03</span></td>
					<td id="td_d2">尚欠本金：</td>
					<td id="td_i"><span id="owePrincipal" class='proposalRequests'></span>1,000.00</td>
					<td id="td_d2">尚欠利息：</td>
					<td id="td_i"><span id="oweInterest" class='proposalRequests'></span>1,000.00</td>


				</tr>
				<tr id="tr_cell">
					<td id="td_d2">尚欠服务费：</td>
					<td id="td_i"><span id="oweFee" class='proposalRequests'></span>1,000.00</td>
					<td id="td_d2">尚欠罚息：</td>
					<td id="td_i"><span id="dealWithPunitive"
						class='proposalRequests'></span>1,000.00</td>
					<td id="td_d2">尚欠滞纳金:</td>
					<td id="td_i"><span id="dealWithOverdue"
						class='proposalRequests'></span>1,000.00</td>
					<td id="td_d2">尚欠违约金:</td>
					<td id="td_i"><span id="dealWithOverdue"
						class='proposalRequests'></span>1,000.00</td>


				</tr>
				<tr id="tr_cell">
					<td id="td_d2">尚欠变更手续费:</td>
					<td id="td_i"><span id="dealWithOverdue"
						class='proposalRequests'></span>1,000.00</td>
					<td id="td_d2">尚欠其他费用:</td>
					<td id="td_i"><span id="dealWithOverdue"
						class='proposalRequests'></span>1,000.00</td>
					<td id="td_d2">尚欠总额：</td>
					<td id="td_i"><span id="ye" class="repaymentScheme">1,687,307.50</span></td>
					<td id="td_d2">罚滞计算截止日：</td>
					<td id="td_i"><span id="overdueDays" class='proposalRequests'></span></td>

				</tr>
				<tr id="tr_cell">
					<td id="td_d2">借款余额：</td>
					<td id="td_i"><span id="ye" class="repaymentScheme">1,687,307.50</span></td>
					<td id="td_d2">预存金额：</td>
					<td id="td_i"><span id="frequency" class="repaymentScheme">1,307.50</span></td>
					<td id="td_d2">累计逾期次数：</td>
					<td id="td_i"><span id="frequency" class="repaymentScheme">1</span></td>
					<td id="td_d2">现存逾期期数：</td>
					<td id="td_i"><span></span></td>


				</tr>
				<tr id="tr_cell">
					<td id="td_d2">现存逾期天数：</td>
					<td id="td_i"><span id="overdueDays" class='proposalRequests'></span></td>
				</tr>
			</table>


			<table id="t1" class="easyui-datagrid"
				style="width: auto; height: 250px" dtoolbar="#toolbar"
				pagination="true" rownumbers="true">
				<thead>
					<tr>
						<th field="name1" width="100">还款日</th>
						<th field="name50" width="100">还款状态</th>
						<th field="name11" width="100">应收本金</th>
						<th field="name12" width="100">应收利息</th>
						<th field="name13" width="100">应收服务费</th>
						<th field="name14" width="100">应收罚息</th>
						<th field="name15" width="100">应收滞纳金</th>
						<th field="name16" width="100">应收违约金</th>
						<th field="name17" width="100">应收变更手续费</th>
						<th field="name28" width="100">应收其他费用</th>
						<th field="name18" width="100">应收总额</th>
						<!--th field="name19" width="100">还款状态</th-->

						<th field="name3" width="100">实收本金</th>
						<th field="name4" width="100">实收利息</th>
						<th field="name5" width="100">实收服务费</th>
						<th field="name6" width="100">实收罚息</th>
						<th field="name7" width="100">实收滞纳金</th>
						<th field="name8" width="100">实收违约金</th>
						<th field="name9" width="100">实收变更手续费</th>
						<th field="name27" width="100">实收其他费用</th>
						<th field="name10" width="100">实收总额</th>

						<th field="name20" width="100">减免罚息</th>
						<th field="name21" width="100">减免滞纳金</th>
						<th field="name22" width="100">减免违约金</th>
						<th field="name23" width="100">减免本金</th>
						<th field="name24" width="100">减免利息</th>
						<th field="name25" width="100">减免服务费</th>
						<th field="name29" width="100">减免其他费用</th>
						<th field="name26" width="100">减免总额</th>

						<th field="name2" width="100">当月欠款</th>
						<th field="name30" width="100">截止当月累计欠款</th>
						<th field="name31" width="100">累计实收款</th>


					</tr>

				</thead>
				<tbody>

					<tr>
						<td style="text-align: center;">2010-11-03</td>
						<td>还款中</td>
						<td>0.00</td>
						<td>513,195.82</td>
						<td>513,195.82</td>
						<td>7,307.50</td>

						<td>0.00</td>
						<td>300,000.00</td>
						<td>20,000.00</td>
						<td>0.00</td>
						<td>10,000.00</td>

						<td>0.00</td>
						<td>5.00</td>
						<td>687,307.50</td>
						<td>999,000.00</td>
						<td>100.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>300.00</td>
						<td>320,000.00</td>
					</tr>
					<tr>
						<td>2010-11-03</td>
						<td>还款中</td>
						<td>0.00</td>
						<td>13,195.82</td>
						<td>13,195.82</td>
						<td>307.50</td>
						<td>0.00</td>
						<td>30,000.00</td>
						<td>2,000.00</td>
						<td>0.00</td>
						<td>10,000.00</td>
						<td>0.00</td>
						<td>5.00</td>
						<td>67,307.50</td>
						<td>10,000.00</td>
						<td>100.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>300.00</td>
						<td>320,000.00</td>
					</tr>
					<tr>
						<td>2010-11-03</td>
						<td>还款中</td>
						<td>0.00</td>
						<td>1,195.82</td>
						<td>1,195.82</td>
						<td>7,307.50</td>
						<td>0.00</td>
						<td>220,000.00</td>
						<td>20,000.00</td>
						<td>0.00</td>
						<td>10,000.00</td>
						<td>0.00</td>
						<td>5.00</td>
						<td>687,307.50</td>
						<td>1,000.00</td>
						<td>100.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>300.00</td>
						<td>320,000.00</td>
					</tr>
				<tbody>
			</table>

		</div>

		<div title="还款明细" style="padding: 10px;" onclick="toGetResource(loanContractNum)">

			<table id="t2" class="easyui-datagrid"
				style="width: auot; height: auto" dtoolbar="#toolbar"
				pagination="true" rownumbers="true">
				<thead>
					<tr>

						<th field="name3" width="130">还款时间</th>

						<th field="name2" width="120">还款金额</th>
						<th field="name4" width="120">还款银行</th>
						<th field="name5" width="120">卡、折</th>
						<th field="name6" width="120">还款账号</th>
						<th field="name1" width="120">还款类型</th>
						<th field="name7" width="130">手工确认还款时间</th>
						<th field="name8" width="120">回款账户</th>

					</tr>
				</thead>
				<tbody>
					<tr>

						<td>2010-11-03 13:10:00</td>

						<td>150,000.00</td>
						<td>中国农业银行</td>
						<td>卡</td>
						<td>1234567890123456</td>
						<td>线上</td>
						<td></td>
						<td></td>
					</tr>
					<tr>

						<td></td>

						<td>150,000.00</td>
						<td>中国农业银行</td>
						<td>卡</td>
						<td>1234567890123456</td>
						<td>线下</td>
						<td>2010-12-14 13:10:00</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>


		<div title="分配明细" style="padding: 10px;">
			<table id="t6" class="easyui-datagrid"
				style="width: auto; height: auto" dtoolbar="#toolbar"
				pagination="true" rownumbers="true">
				<thead>
					<tr>
						<th field="name1" width="130">还款时间</th>
						<th field="name2" width="100">所属分期日</th>

						<th field="name11" width="100">应收本金</th>
						<th field="name12" width="100">应收利息</th>
						<th field="name13" width="100">应收服务费</th>
						<th field="name14" width="100">应收罚息</th>
						<th field="name15" width="100">应收滞纳金</th>
						<th field="name16" width="100">应收违约金</th>
						<th field="name17" width="100">应收变更手续费</th>
						<th field="name28" width="100">应收其他费用</th>
						<th field="name18" width="100">应收总额</th>

						<th field="name3" width="100">实收本金</th>
						<th field="name4" width="100">实收利息</th>
						<th field="name5" width="100">实收服务费</th>
						<th field="name6" width="100">实收罚息</th>
						<th field="name7" width="100">实收滞纳金</th>
						<th field="name8" width="100">实收违约金</th>
						<th field="name9" width="100">实收变更手续费</th>
						<th field="name27" width="100">实收其他费用</th>
						<th field="name10" width="100">实收总额</th>
						<!--th field="name19" width="100">还款状态</th-->

						<th field="name20" width="100">减免罚息</th>
						<th field="name21" width="100">减免滞纳金</th>
						<th field="name22" width="100">减免违约金</th>
						<th field="name23" width="100">减免本金</th>
						<th field="name24" width="100">减免利息</th>
						<th field="name25" width="100">减免服务费</th>
						<th field="name29" width="100">减免其他费用</th>
						<th field="name26" width="100">减免总额</th>


					</tr>

				</thead>

				<tbody>

					<tr>
						<td>2010-11-03 13:10:00</td>
						<td>2010-10-21</td>
						<td>100.00</td>
						<td>100.00</td>
						<td>100.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<!--td></td-->
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>300.00</td>

						<td>300.00</td>
						<td>300.00</td>
						<td>300.00</td>


					</tr>
					<tr>
						<td>2010-12-14 13:10:00</td>
						<td>2010-10-21</td>
						<td>110.00</td>
						<td>110.00</td>
						<td>100.00</td>

						<td>1.00</td>
						<td>0.00</td>
						<td>321.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<!--td></td-->
						<td>300.00</td>

						<td>0.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>0.00</td>
						<td>300.00</td>
						<td>300.00</td>

						<td>300.00</td>
						<td>300.00</td>
						<td>300.00</td>


					</tr>
				</tbody>
			</table>
		</div>

		<div title="逾期明细" style="padding: 10px;">

			<p id="p_">客户基本信息</p>
			<table id="table_" width="100%">
				<tbody>
					<tr id="tr_cell">

						<td id="td_d2">客户姓名：</td>
						<td id="td_i"><span id="clientName"
							class="reductionInformation2">客户196439</span></td>
						<td id="td_d2">性别：</td>
						<td id="td_i"><span id="gender" class="reductionInformation2">女</span></td>


					</tr>

					<tr id="tr_cell">
						<td id="td_d2">出生日期：</td>
						<td id="td_i"><span id="birthday"
							class="reductionInformation2"></span></td>
						<td id="td_d2">证件号：</td>
						<td id="td_i"><span id="idNumber"
							class="reductionInformation2">330327197706210745</span></td>

					</tr>

					<tr id="tr_cell">
						<td id="td_d2">证件类型：</td>
						<td id="td_i"><span id="clientId"
							class="reductionInformation2">第二代身份证</span></td>
						<td id="td_d2">证件有效期：</td>
						<td id="td_i"><span id="usefulLife"
							class="reductionInformation2">2026-06-21</span></td>
					</tr>

					<tr id="tr_cell">
						<td id="td_d2">户籍详细地址：</td>
						<td id="td_i" colspan="3"><span id="censusRegister"
							class="reductionInformation2">浙江省苍南县灵溪xxxxxxxx</span></td>
					</tr>


					<tr id="tr_cell">
						<td id="td_d2">婚姻状态：</td>
						<td id="td_i"><span id="marital"
							class="reductionInformation2">未婚</span></td>
						<td id="td_d2">有无子女：</td>
						<td id="td_i"><span id="family" class="reductionInformation2">有</span></td>
					</tr>
					<tr id="tr_cell">
						<td id="td_d2">房产情况：</td>
						<td id="td_i"><span id="house" class="reductionInformation2">无</span></td>
						<td id="td_d2">手机号码：</td>
						<td id="td_i"><span id="mobilePhone"
							class="reductionInformation2"></span></td>

					</tr>
					<tr id="tr_cell">

						<td id="td_d2">邮件编码：</td>
						<td id="td_i"><span id="zipCode"
							class="reductionInformation2"></span></td>
						<td id="td_d2">本市地址：</td>
						<td id="td_i"><span id="creditAmount"
							class="reductionInformation2">北京市朝阳区大望路...</span></td>
					</tr>

				</tbody>
			</table>
			<p id="p_">逾期记录</p>

			<table id="t3" class="easyui-datagrid"
				style="width: auto; height: auto" dtoolbar="#toolbar"
				pagination="true" rownumbers="true">
				<thead>
					<tr>
						<th field="name1" width="140">所属分期</th>
						<th field="name3" width="150">逾期状态</th>
						<th field="name4" width="140">逾期开始日期</th>
						<th field="name5" width="140">逾期截止日期</th>
					</tr>

				</thead>
				<tbody>

					<tr>
						<td>2010-11-03</td>
						<td>逾期</td>
						<td>2010-11-01</td>
						<td>2010-11-30</td>
					</tr>
				<tbody>
			</table>
			<p id="p_">逾期沟通记录</p>

			<table id="t3" class="easyui-datagrid"
				style="width: auto; height: auto" dtoolbar="#toolbar"
				pagination="true" rownumbers="true">
				<thead>
					<tr>

						<!--th><input type="checkbox"  id="cboxchecked" /></th-->

						<th field="name1" width="100">合同编号</th>
						<th field="name9" width="100">催收进度</th>
						<th field="name2" width="100">沟通时间</th>
						<th field="name5" width="100">沟通人</th>
						<th field="name4" width="100">联系人</th>
						<th field="name10" width="120">联系人与贷款人关系</th>
						<th field="name11" width="100">联系电话</th>
						<th field="name6" width="100">沟通等级</th>
						<th field="name3" width="400">沟通情况</th>
						<th field="name8" width="100">沟通结果</th>
						<th field="name7" width="100">下次沟通时间</th>

						<!--th field="name3" width="100">操作</th-->

					</tr>

				</thead>
				<tbody>
					<tr>
						<!--td><input type="checkbox"  id="cboxchecked" /></td-->
						<td>4563332</td>
						<td>电话催收</td>
						<td>2014-07-13</td>
						<td>admin</td>
						<td>张三</td>
						<td>朋友</td>
						<td>11111111</td>
						<td>低风险</td>
						<td>…………</td>
						<td>有效</td>
						<td>2014-07-15</td>


					</tr>
					<tr>

						<!--td><input type="checkbox"  id="cboxchecked" /></td-->
						<td>1235674</td>
						<td>电话催收</td>
						<td>2014-07-13</td>
						<td>admin1</td>
						<td>张三</td>
						<td>朋友</td>
						<td>11111111</td>
						<td>低风险</td>
						<td>…………</td>
						<td>有效</td>
						<td>2014-07-15</td>


					</tr>
					<tr>

						<!--td><input type="checkbox"  id="cboxchecked" /></td-->
						<td>1235674</td>
						<td>电话催收</td>
						<td>2014-07-13</td>
						<td>admin1</td>
						<td>张三</td>
						<td>朋友</td>
						<td>11111111</td>
						<td>低风险</td>
						<td>…………</td>
						<td>有效</td>
						<td>2014-07-15</td>


					</tr>
				<tbody>
			</table>

		</div>
		<!--div title="还款明细" style="padding:10px;">  

  	
    
    
    <table width="100%" id="table_">
      <tr height="25"  id="tr_cell">
    		<td id="td_d"  text-align="right">还款时间</td>
    		<td id="td_d" align="right">还款金额</td>
    		<td id="td_d" align="right">还款方式</td>
    		<td id="td_d" align="right">还款银行</td>
    		<td id="td_d" align="right">卡/折</td>
    		<td id="td_d" align="right">还款账号</td>
    		<td id="td_d" align="right">所属还款日</td>
    		<td id="td_d" width="15%" align="right">备注</td>
    		<td id="td_d" align="right">操作</td>
    	</tr>
    	    	<tr height="20px" align="center" id="tr_cell">
    		<td id="td_s2">2009-05-15 18:58:48</td>
    		<td id="td_s2" align="right">2,142.17</td>
    		<td id="td_s2">
    		  <select name="return_type_46384" id="return_type_46384">
      	  	<option value="">请选择</option>
      	  	<option label="其他" value="0">其他</option>
<option label="徽商银行" value="44">徽商银行</option>
<option label="恒丰银行" value="59">恒丰银行</option>
<option label="华夏银行" value="43">华夏银行</option>
<option label="杭州市商业银行" value="63">杭州市商业银行</option>
<option label="浙江泰隆商业银行" value="62">浙江泰隆商业银行</option>
<option label="山东省市农村信用社" value="61">山东省市农村信用社</option>
<option label="恒丰银行" value="42">恒丰银行</option>
<option label="农村合作银行" value="55">农村合作银行</option>
<option label="福建海峡银行" value="58">福建海峡银行</option>
<option label="农村信用合作社" value="57">农村信用合作社</option>
<option label="国家开发银行" value="41">国家开发银行</option>


      	  </select>	
    		</td>
    		<td id="td_s2"><input type="text" name="bank_name_46384" id="bank_name_46384" size="18" value="民生银行" /></td>
    		<td id="td_s2">
    		  <select name="bank_book_46384" id="bank_book_46384">
            <option value="">请选择</option>
            <option value="0">卡</option>
            <option value="1" selected="selected">存折</option>
          </select>
    		</td>
    		<td id="td_s2"><input type="text" name="bank_account_46384" id="bank_account_46384" size="18" value="12345678901234噢噢噢" /></td>
    		<td id="td_s2">2009-05-15</td>
    		<td id="td_s2"><input type="text" name="remark_46384" id="remark_46384" size="20" value="" />&nbsp;</td>
    		<td id="td_s2">
			
			<a href="javascript:;" onclick="updateReturn(46384);" class="special">修改</a>
            			<a href="javascript:;" id="delBut_0" onclick="deleteItem(46384,0,1793);" class="special" style="display:none;">删除</a>			</td>
    	</tr>
    	    	<tr height="20" align="center" id="item_1">
    		<td id="td_s2">2009-06-25 19:02:18</td>
    		<td id="td_s2" align="right">2,589.18</td>
    		<td id="td_s2">
    		  <select name="return_type_64818" id="return_type_64818">
      	  	<option value="">请选择</option>
      	  	<option label="其他" value="0">其他</option>
<option label="徽商银行" value="44">徽商银行</option>
<option label="恒丰银行" value="59">恒丰银行</option>
<option label="华夏银行" value="43">华夏银行</option>
<option label="杭州市商业银行" value="63">杭州市商业银行</option>
<option label="浙江泰隆商业银行" value="62">浙江泰隆商业银行</option>
<option label="山东省市农村信用社" value="61">山东省市农村信用社</option>
<option label="恒丰银行" value="42">恒丰银行</option>
<option label="农村合作银行" value="55">农村合作银行</option>
<option label="福建海峡银行" value="58">福建海峡银行</option>
<option label="农村信用合作社" value="57">农村信用合作社</option>
<option label="国家开发银行" value="41">国家开发银行</option>


      	  </select>	
    		</td>
    		<td id="td_s2"><input type="text" name="bank_name_64818" id="bank_name_64818" size="18" value="民生银行" /></td>
    		<td id="td_s2">
    		  <select name="bank_book_64818" id="bank_book_64818">
            <option value="">请选择</option>
            <option value="0" selected="selected">卡</option>
            <option value="1">存折</option>
          </select>
    		</td>
    		<td id="td_s2"><input type="text" name="bank_account_64818" id="bank_account_64818" size="18" value="1234567890123456" /></td>
    		<td id="td_s2">2009-06-15</td>
    		<td id="td_s2"><input type="text" name="remark_64818" id="remark_64818" size="20" value="" />&nbsp;</td>
    		<td id="td_s2">
			
			<a href="javascript:;" onclick="updateReturn(64818);" class="special">修改</a>
            			<a href="javascript:;" id="delBut_1" onclick="deleteItem(64818,1,1793);" class="special" style="display:none;">删除</a>			</td>
    	</tr>
    	    	<tr height="20" align="center" id="item_2">
    		<td id="td_s2">2009-07-15 13:51:04</td>
    		<td id="td_s2" align="right">2,142.17</td>
    		<td id="td_s2">
    		  <select name="return_type_46386" id="return_type_46386">
      	  	<option value="">请选择</option>
      	  	<option label="其他" value="0">其他</option>
<option label="徽商银行" value="44">徽商银行</option>
<option label="恒丰银行" value="59">恒丰银行</option>
<option label="华夏银行" value="43">华夏银行</option>
<option label="杭州市商业银行" value="63">杭州市商业银行</option>
<option label="浙江泰隆商业银行" value="62">浙江泰隆商业银行</option>
<option label="山东省市农村信用社" value="61">山东省市农村信用社</option>
<option label="恒丰银行" value="42">恒丰银行</option>
<option label="农村合作银行" value="55">农村合作银行</option>
<option label="福建海峡银行" value="58">福建海峡银行</option>
<option label="农村信用合作社" value="57">农村信用合作社</option>
<option label="国家开发银行" value="41">国家开发银行</option>


      	  </select>	
    		</td>
    		<td id="td_s2"><input type="text" name="bank_name_46386" id="bank_name_46386" size="18" value="民生银行dd" /></td>
    		<td id="td_s2">
    		  <select name="bank_book_46386" id="bank_book_46386">
            <option value="">请选择</option>
            <option value="0">卡</option>
            <option value="1" selected="selected">存折</option>
          </select>
    		</td>
    		<td id="td_s2"><input type="text" name="bank_account_46386" id="bank_account_46386" size="18" value="1234567890123456" /></td>
    		<td id="td_s2">2009-07-15</td>
    		<td id="td_s2"><input type="text" name="remark_46386" id="remark_46386" size="20" value="" />&nbsp;</td>
    		<td id="td_s2">
			
			<a href="javascript:;" onclick="updateReturn(46386);" class="special">修改</a>
            			<a href="javascript:;" id="delBut_2" onclick="deleteItem(46386,2,1793);" class="special" style="display:none;">删除</a>			</td>
    	</tr>
    	    	<tr height="20" align="center" id="item_3">
    		<td id="td_s2">2011-02-15 11:48:24</td>
    		<td id="td_s2" align="right">55.39</td>
    		<td id="td_s2">
    		  <select name="return_type_46387" id="return_type_46387">
      	  	<option value="">请选择</option>
      	  	<option label="其他" value="0">其他</option>
<option label="徽商银行" value="44">徽商银行</option>
<option label="恒丰银行" value="59">恒丰银行</option>
<option label="华夏银行" value="43">华夏银行</option>
<option label="杭州市商业银行" value="63">杭州市商业银行</option>
<option label="浙江泰隆商业银行" value="62">浙江泰隆商业银行</option>
<option label="山东省市农村信用社" value="61">山东省市农村信用社</option>
<option label="恒丰银行" value="42">恒丰银行</option>
<option label="农村合作银行" value="55">农村合作银行</option>
<option label="福建海峡银行" value="58">福建海峡银行</option>
<option label="农村信用合作社" value="57">农村信用合作社</option>
<option label="国家开发银行" value="41">国家开发银行</option>

      	  </select>	
    		</td>
    		<td id="td_s2"><input type="text" name="bank_name_46387" id="bank_name_46387" size="18" value="民生银行" /></td>
    		<td id="td_s2">
    		  <select name="bank_book_46387" id="bank_book_46387">
            <option value="">请选择</option>
            <option value="0">卡</option>
            <option value="1" selected="selected">存折</option>
          </select>
    		</td>
    		<td id="td_s2"><input type="text" name="bank_account_46387" id="bank_account_46387" size="18" value="1234567890123456" /></td>
    		<td id="td_s2">2009-08-15</td>
    		<td id="td_s2"><input type="text" name="remark_46387" id="remark_46387" size="20" value="" />&nbsp;</td>
    		<td id="td_s2">
			
			<a href="javascript:;" onclick="updateReturn(46387);" class="special">修改</a>
            			<a href="javascript:;" id="delBut_3" onclick="deleteItem(46387,3,1793);" class="special" >删除</a>			</td>
    	</tr>
    	    	<tr height="20" align="center" id="item_4">
    		<td id="td_s2">2014-07-16 19:20:00</td>
    		<td id="td_s2" align="right">-55.39</td>
    		<td id="td_s2">
    		  <select name="return_type_99829511" id="return_type_99829511">
      	  	<option value="">请选择</option>
      	  	<option label="其他" value="0">其他</option>
<option label="徽商银行" value="44">徽商银行</option>
<option label="恒丰银行" value="59">恒丰银行</option>
<option label="华夏银行" value="43">华夏银行</option>
<option label="杭州市商业银行" value="63">杭州市商业银行</option>
<option label="浙江泰隆商业银行" value="62">浙江泰隆商业银行</option>
<option label="山东省市农村信用社" value="61">山东省市农村信用社</option>
<option label="恒丰银行" value="42">恒丰银行</option>
<option label="农村合作银行" value="55">农村合作银行</option>
<option label="福建海峡银行" value="58">福建海峡银行</option>
<option label="农村信用合作社" value="57">农村信用合作社</option>
<option label="国家开发银行" value="41">国家开发银行</option>

      	  </select>	
    		</td>
    		<td id="td_s2"><input type="text" name="bank_name_99829511" id="bank_name_99829511" size="18" value="民生银行" /></td>
    		<td id="td_s2">
    		  <select name="bank_book_99829511" id="bank_book_99829511">
            <option value="">请选择</option>
            <option value="0" selected="selected">卡</option>
            <option value="1">存折</option>
          </select>
    		</td>
    		<td id="td_s2"><input type="text" name="bank_account_99829511" id="bank_account_99829511" size="18" value="1234567890123456" /></td>
    		<td id="td_s2">2009-08-15</td>
    		<td id="td_s2"><input type="text" name="remark_99829511" id="remark_99829511" size="20" value="" />&nbsp;</td>
    		<td id="td_s2">
			
			<a href="javascript:;" onclick="updateReturn(99829511);" class="special">修改</a>
            			<a href="javascript:;" id="delBut_4" onclick="deleteItem(99829511,4,1793);" class="special" style="display:none;">删除</a>			</td>
    	</tr>
    	    	<tr height="20" align="center" id="item_5">
    		<td id="td_s2">2014-07-16 19:23:09</td>
    		<td id="td_s2" align="right">-55.39</td>
    		<td id="td_s2">
    		  <select name="return_type_99829512" id="return_type_99829512">
      	  	<option value="">请选择</option>
      	  	<option label="其他" value="0">其他</option>
<option label="徽商银行" value="44">徽商银行</option>
<option label="恒丰银行" value="59">恒丰银行</option>
<option label="华夏银行" value="43">华夏银行</option>
<option label="杭州市商业银行" value="63">杭州市商业银行</option>
<option label="浙江泰隆商业银行" value="62">浙江泰隆商业银行</option>
<option label="山东省市农村信用社" value="61">山东省市农村信用社</option>
<option label="恒丰银行" value="42">恒丰银行</option>
<option label="农村合作银行" value="55">农村合作银行</option>
<option label="福建海峡银行" value="58">福建海峡银行</option>
<option label="农村信用合作社" value="57">农村信用合作社</option>
<option label="国家开发银行" value="41">国家开发银行</option>


      	  </select>	
    		</td>
    		<td id="td_s2"><input type="text" name="bank_name_99829512" id="bank_name_99829512" size="18" value="民生银行" /></td>
    		<td id="td_s2">
    		  <select name="bank_book_99829512" id="bank_book_99829512">
            <option value="">请选择</option>
            <option value="0" selected="selected">卡</option>
            <option value="1">存折</option>
          </select>
    		</td>
    		<td id="td_s2"><input type="text" name="bank_account_99829512" id="bank_account_99829512" size="18" value="1234567890123456" /></td>
    		<td id="td_s2">2009-08-15</td>
    		<td id="td_s2"><input type="text" name="remark_99829512" id="remark_99829512" size="20" value="" />&nbsp;</td>
    		<td id="td_s2">
			
			<a href="javascript:;" onclick="updateReturn(99829512);" class="special">修改</a>
            			<a href="javascript:;" id="delBut_5" onclick="deleteItem(99829512,5,1793);" class="special" style="display:none;">删除</a>			</td>
    	</tr>
    	    	<tr height="20" align="center" id="item_6">
    		<td id="td_s2">2014-07-17 14:33:05</td>
    		<td id="td_s2" align="right">-55.39</td>
    		<td id="td_s2">
    		  <select name="return_type_99829678" id="return_type_99829678">
      	  	<option value="">请选择</option>
      	  	<option label="其他" value="0">其他</option>
<option label="徽商银行" value="44">徽商银行</option>
<option label="恒丰银行" value="59">恒丰银行</option>
<option label="华夏银行" value="43">华夏银行</option>
<option label="杭州市商业银行" value="63">杭州市商业银行</option>
<option label="浙江泰隆商业银行" value="62">浙江泰隆商业银行</option>
<option label="山东省市农村信用社" value="61">山东省市农村信用社</option>
<option label="恒丰银行" value="42">恒丰银行</option>
<option label="农村合作银行" value="55">农村合作银行</option>
<option label="福建海峡银行" value="58">福建海峡银行</option>
<option label="农村信用合作社" value="57">农村信用合作社</option>
<option label="国家开发银行" value="41">国家开发银行</option>


      	  </select>	
    		</td>
    		<td id="td_s2"><input type="text" name="bank_name_99829678" id="bank_name_99829678" size="18" value="民生银行" /></td>
    		<td id="td_s2">
    		  <select name="bank_book_99829678" id="bank_book_99829678">
            <option value="">请选择</option>
            <option value="0">卡</option>
            <option value="1" selected="selected">存折</option>
          </select>
    		</td>
    		<td id="td_s2"><input type="text" name="bank_account_99829678" id="bank_account_99829678" size="18" value="1234567890123456" /></td>
    		<td id="td_s2">2009-08-15</td>
    		<td id="td_s2"><input type="text" name="remark_99829678" id="remark_99829678" size="20" value="" />&nbsp;</td>
    		<td id="td_s2">
			
			<a href="javascript:;" onclick="updateReturn(99829678);" class="special">修改</a>
            			<a href="javascript:;" id="delBut_6" onclick="deleteItem(99829678,6,1793);" class="special" style="display:none;">删除</a>			</td>
    	</tr>
    	    </table>
		</div-->


		<!--div title="修改还款情况" style="padding:10px;">  
				<table id="t6" class="easyui-datagrid" style="width:auto;height:auto"  dtoolbar="#toolbar" pagination="true" rownumbers="true" >   
				   <thead>   
						<tr>   
								<th field="name1" width="90"  align="center">还款日</th>			
								<th field="name2" width="90"  align="center">当月应收本金</th>   
								<th field="name3" width="90"   align="center">当月应收利息</th>				
								<th field="name4" width="90"  align="center">当月应收服务费</th>				
								<th field="name5" width="90">当月应收滞纳金</th>
								<th field="name6" width="90">当月应收罚息</th>
								<th field="name7" width="90">当月应收违约金</th>
								<th field="name8" width="140">当月应收滞纳金罚息合计</th>
								<th field="name9" width="90">当月应收款合计</th>
                              
								    <th field="name10" width="90">当月实收本金</th>
                                <th field="name11" width="90">当月实收利息</th>
								    <th field="name12" width="90">当月实收服务费</th>
                                <th field="name13" width="90">当月实收滞纳金</th>
                                <th field="name14" width="90">当月实收罚息</th>
								    <th field="name15" width="90">当月实收违约金</th>
                                <th field="name16" width="90">当月实收合计</th>
								
								<th field="name17" width="90">当月减免本金</th>
                            <th field="name18" width="90">当月减免利息</th>
								<th field="name19" width="90">当月减免服务费</th>
                            <th field="name20" width="90">当月减免滞纳金</th>
                            <th field="name21" width="90">当月减免罚息</th>
								<th field="name22" width="90">当月减免违约金</th>
                            <th field="name23" width="90">当月减免合计</th>   
								
                                <th field="name24" width="80">当月欠款</th>
                                <th field="name25" width="100">截止当月累计欠款</th>
                                <th field="name26" width="100">累计实收款</th>
								
						</tr>   		
						
					</thead> 
 
					<tbody>
						
						<tr> 
							<td><input  id="idNumber" name="idNumber" style="vertical-align:middle" value="2010-11-03"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="1,666.67"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="432.00"></td>
						    <td><input id="idNumber" name="idNumber" style="vertical-align:middle" value="360.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="45.00"></td>
							
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="3.15"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="3.15"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,461.82"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="360.00"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="1,666.67"></td>
							
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="432.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="3.15"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,461.82"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,461.82"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="3.15"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="3.15"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,461.82"></td>
							
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="360.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="1,666.67"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="432.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="3.15"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,461.82"></td>
							
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,461.82"></td>
								
						</tr>  
						<tr> 
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2010-11-03"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="1,666.67"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="432.00"></td>
						    <td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="360.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,458.67"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="360.00"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="1,666.67"></td>
							
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="432.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,458.67"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="4,920.49"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="1,666.67"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="432.00"></td>
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="2,458.67"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="0.00"></td>
							
								<td><input id="idNumber" name="idNumber"  style="vertical-align:middle" value="4,920.49"></td>
								
						</tr>  
					</tbody>
					</table>  
					<table id="table_OperateBtn" border=0>
	                <tbody><tr>
	                    <td>
	                    	<span id="submit_right">
		                    	<a id="submit" href="#" class="easyui-linkbutton l-btn" onClick="commitDeratePayment();" group="">保存</a>
		                        &nbsp;
								<a id="submit" href="#" class="easyui-linkbutton l-btn" onClick="commitDeratePayment();" group="">重置</a>
								&nbsp;
		                        <a id="backButten" href="javascript:window.history.go(-1)" class="easyui-linkbutton l-btn" group="" >返回</a>
	                        </span>
	                    </td>	                    
	                </tr>
	            </tbody>
				</table>

			<p id="p_"></p>
                                	<table id="table_"  width="100%">
                                        <tbody>
										
										
						   <tr  id="tr_cell">
								<td id="td_d"  style="width:8% ">预计还款时间： </td>
								<td width="75%">  
									<input type="text" id="repaymentStart" style="width: 160px; display: none;" class="easyui-datetimebox" value="" comboname="repaymentStart">
					
									<a href="javascript:compute(45861,1793);" id="special">计算一次性提前还款金额：</a>
								</td>		
						  

									
								</td>		
						  </tr>
                      
										
                  </tbody></table>
				
		</div-->
	</div>
	<div>&nbsp;</div>
	<p>

		<script language="JavaScript" >
			function toGetResource(loanContractNum) {
                $.ajax({
                    type: "POST",
                    url: "${APP_PATH}/controller/toGetResource",
                    data: loanContractNum,

                    success: function () {
                        alert("成功");

                    }
                });

			}


		</script>

</body>

</body>
</html>
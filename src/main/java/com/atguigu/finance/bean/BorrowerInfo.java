package com.atguigu.finance.bean;

import java.util.Date;

/**
 * 描述:nplm_borrower_info表的实体类
 * @version
 * @author:  zhangzhanbao
 * @创建时间: 2018-09-17
 */
public class BorrowerInfo {
    /**
     * 客户编号
     */
    private Integer id;

    /**
     * 进件客户编号
     */
    private Integer applyClientId;

    /**
     * ECIF客户号
     */
    private Integer ecifId;

    /**
     * 客户姓名
     */
    private String clientName;

    /**
     * 发短信移动电话
     */
    private String mobile;

    /**
     * 曾用名
     */
    private String oldName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 民族
     */
    private String nation;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 婚姻状况
     */
    private String marital;

    /**
     * 有无子女 1为没有，2为有
     */
    private Integer haveChildren;

    /**
     * 子女数量
     */
    private Integer childrenCount;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 户籍所在省
     */
    private String hProvince;

    /**
     * 户籍所在市
     */
    private String hCity;

    /**
     * 户籍所在地
     */
    private String hDress;

    /**
     * 证件类型
     */
    private String identityType;

    /**
     * 证件号码
     */
    private String identityNum;

    /**
     * 证件有效期限
     */
    private String identityValidDate;

    /**
     * 有无车产 Y:有  N:无
     */
    private String haveCar;

    /**
     * 房产情况
     */
    private String houseExplain;

    /**
     * 居住情况
     */
    private String resideExplain;

    /**
     * 居住年限
     */
    private String resideYear;

    /**
     * 学历
     */
    private String degree;

    /**
     * 学位
     */
    private String diploma;

    /**
     * 年收入
     */
    private Integer yearIncome;

    /**
     * 行业
     */
    private String industry;

    /**
     * 职业
     */
    private String job;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 单位性质
     */
    private String companyType;

    /**
     * 所在部门
     */
    private String department;

    /**
     * 职位
     */
    private String position;

    /**
     * 该单位工作时间
     */
    private Integer workTime;

    /**
     * 该单位工作时间单位
     */
    private String workTimeUnit;

    /**
     * 客户所在地域
     */
    private String clientArea;

    /**
     * 客户类型
     */
    private String clientType;

    /**
     * 家庭地址_国家
     */
    private String fNation;

    /**
     * 家庭地址_省州
     */
    private String fProvince;

    /**
     * 家庭地址_城市
     */
    private String fCity;

    /**
     * 家庭地址_区县
     */
    private String fArea;

    /**
     * 家庭地址_街道单元
     */
    private String fStreet;

    /**
     * 家庭地址_邮政编码
     */
    private String fZipcode;

    /**
     * 公司地址_国家
     */
    private String cNation;

    /**
     * 公司地址_省州
     */
    private String cProvince;

    /**
     * 公司地址_城市
     */
    private String cCity;

    /**
     * 公司地址_区县
     */
    private String cArea;

    /**
     * 公司地址_街道单元
     */
    private String cStreet;

    /**
     * 公司地址_邮政编码
     */
    private String cZipcode;

    /**
     * 移动电话1
     */
    private String mobile1;

    /**
     * 移动电话2
     */
    private String mobile2;

    /**
     * 移动电话3
     */
    private String mobile3;

    /**
     * 家庭电话1 
     */
    private String fTel1;

    /**
     * 家庭电话2
     */
    private String fTel2;

    /**
     * 家庭电话3
     */
    private String fTel3;

    /**
     * 公司电话1
     */
    private String cTel1;

    /**
     * 公司电话2
     */
    private String cTel2;

    /**
     * 公司电话3
     */
    private String cTel3;

    /**
     * 电子邮箱1
     */
    private String email1;

    /**
     * 电子邮箱2
     */
    private String email2;

    /**
     * 电子邮箱3
     */
    private String email3;

    /**
     * 信用卡额度
     */
    private Integer creditAmount;

    /**
     * 是否拥有社保基金 Y：有  N：无
     */
    private String sociallSecurity;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 末次修改者
     */
    private String updater;

    /**
     * 末次修改时间
     */
    private Date updateTime;

    /**
     * 修改类型
     */
    private String updateType;

    /**
     * 客户编号
     * @return id 客户编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 客户编号
     * @param id 客户编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 进件客户编号
     * @return APPLY_CLIENT_ID 进件客户编号
     */
    public Integer getApplyClientId() {
        return applyClientId;
    }

    /**
     * 进件客户编号
     * @param applyClientId 进件客户编号
     */
    public void setApplyClientId(Integer applyClientId) {
        this.applyClientId = applyClientId;
    }

    /**
     * ECIF客户号
     * @return ECIF_ID ECIF客户号
     */
    public Integer getEcifId() {
        return ecifId;
    }

    /**
     * ECIF客户号
     * @param ecifId ECIF客户号
     */
    public void setEcifId(Integer ecifId) {
        this.ecifId = ecifId;
    }

    /**
     * 客户姓名
     * @return CLIENT_NAME 客户姓名
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * 客户姓名
     * @param clientName 客户姓名
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * 发短信移动电话
     * @return MOBILE 发短信移动电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 发短信移动电话
     * @param mobile 发短信移动电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 曾用名
     * @return OLD_NAME 曾用名
     */
    public String getOldName() {
        return oldName;
    }

    /**
     * 曾用名
     * @param oldName 曾用名
     */
    public void setOldName(String oldName) {
        this.oldName = oldName == null ? null : oldName.trim();
    }

    /**
     * 性别
     * @return SEX 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 民族
     * @return NATION 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 民族
     * @param nation 民族
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * 出生日期
     * @return BIRTHDAY 出生日期
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 出生日期
     * @param birthday 出生日期
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 婚姻状况
     * @return MARITAL 婚姻状况
     */
    public String getMarital() {
        return marital;
    }

    /**
     * 婚姻状况
     * @param marital 婚姻状况
     */
    public void setMarital(String marital) {
        this.marital = marital == null ? null : marital.trim();
    }

    /**
     * 有无子女 1为没有，2为有
     * @return HAVE_CHILDREN 有无子女 1为没有，2为有
     */
    public Integer getHaveChildren() {
        return haveChildren;
    }

    /**
     * 有无子女 1为没有，2为有
     * @param haveChildren 有无子女 1为没有，2为有
     */
    public void setHaveChildren(Integer haveChildren) {
        this.haveChildren = haveChildren;
    }

    /**
     * 子女数量
     * @return CHILDREN_COUNT 子女数量
     */
    public Integer getChildrenCount() {
        return childrenCount;
    }

    /**
     * 子女数量
     * @param childrenCount 子女数量
     */
    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }

    /**
     * 国籍
     * @return NATIONALITY 国籍
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 国籍
     * @param nationality 国籍
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    /**
     * 户籍所在省
     * @return H_PROVINCE 户籍所在省
     */
    public String gethProvince() {
        return hProvince;
    }

    /**
     * 户籍所在省
     * @param hProvince 户籍所在省
     */
    public void sethProvince(String hProvince) {
        this.hProvince = hProvince == null ? null : hProvince.trim();
    }

    /**
     * 户籍所在市
     * @return H_CITY 户籍所在市
     */
    public String gethCity() {
        return hCity;
    }

    /**
     * 户籍所在市
     * @param hCity 户籍所在市
     */
    public void sethCity(String hCity) {
        this.hCity = hCity == null ? null : hCity.trim();
    }

    /**
     * 户籍所在地
     * @return H_DRESS 户籍所在地
     */
    public String gethDress() {
        return hDress;
    }

    /**
     * 户籍所在地
     * @param hDress 户籍所在地
     */
    public void sethDress(String hDress) {
        this.hDress = hDress == null ? null : hDress.trim();
    }

    /**
     * 证件类型
     * @return IDENTITY_TYPE 证件类型
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * 证件类型
     * @param identityType 证件类型
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType == null ? null : identityType.trim();
    }

    /**
     * 证件号码
     * @return IDENTITY_NUM 证件号码
     */
    public String getIdentityNum() {
        return identityNum;
    }

    /**
     * 证件号码
     * @param identityNum 证件号码
     */
    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    /**
     * 证件有效期限
     * @return IDENTITY_VALID_DATE 证件有效期限
     */
    public String getIdentityValidDate() {
        return identityValidDate;
    }

    /**
     * 证件有效期限
     * @param identityValidDate 证件有效期限
     */
    public void setIdentityValidDate(String identityValidDate) {
        this.identityValidDate = identityValidDate == null ? null : identityValidDate.trim();
    }

    /**
     * 有无车产 Y:有  N:无
     * @return HAVE_CAR 有无车产 Y:有  N:无
     */
    public String getHaveCar() {
        return haveCar;
    }

    /**
     * 有无车产 Y:有  N:无
     * @param haveCar 有无车产 Y:有  N:无
     */
    public void setHaveCar(String haveCar) {
        this.haveCar = haveCar == null ? null : haveCar.trim();
    }

    /**
     * 房产情况
     * @return HOUSE_EXPLAIN 房产情况
     */
    public String getHouseExplain() {
        return houseExplain;
    }

    /**
     * 房产情况
     * @param houseExplain 房产情况
     */
    public void setHouseExplain(String houseExplain) {
        this.houseExplain = houseExplain == null ? null : houseExplain.trim();
    }

    /**
     * 居住情况
     * @return RESIDE_EXPLAIN 居住情况
     */
    public String getResideExplain() {
        return resideExplain;
    }

    /**
     * 居住情况
     * @param resideExplain 居住情况
     */
    public void setResideExplain(String resideExplain) {
        this.resideExplain = resideExplain == null ? null : resideExplain.trim();
    }

    /**
     * 居住年限
     * @return RESIDE_YEAR 居住年限
     */
    public String getResideYear() {
        return resideYear;
    }

    /**
     * 居住年限
     * @param resideYear 居住年限
     */
    public void setResideYear(String resideYear) {
        this.resideYear = resideYear == null ? null : resideYear.trim();
    }

    /**
     * 学历
     * @return DEGREE 学历
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 学历
     * @param degree 学历
     */
    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    /**
     * 学位
     * @return DIPLOMA 学位
     */
    public String getDiploma() {
        return diploma;
    }

    /**
     * 学位
     * @param diploma 学位
     */
    public void setDiploma(String diploma) {
        this.diploma = diploma == null ? null : diploma.trim();
    }

    /**
     * 年收入
     * @return YEAR_INCOME 年收入
     */
    public Integer getYearIncome() {
        return yearIncome;
    }

    /**
     * 年收入
     * @param yearIncome 年收入
     */
    public void setYearIncome(Integer yearIncome) {
        this.yearIncome = yearIncome;
    }

    /**
     * 行业
     * @return INDUSTRY 行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 行业
     * @param industry 行业
     */
    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    /**
     * 职业
     * @return JOB 职业
     */
    public String getJob() {
        return job;
    }

    /**
     * 职业
     * @param job 职业
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * 公司名称
     * @return COMPANY 公司名称
     */
    public String getCompany() {
        return company;
    }

    /**
     * 公司名称
     * @param company 公司名称
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 单位性质
     * @return COMPANY_TYPE 单位性质
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 单位性质
     * @param companyType 单位性质
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    /**
     * 所在部门
     * @return DEPARTMENT 所在部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 所在部门
     * @param department 所在部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 职位
     * @return POSITION 职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 职位
     * @param position 职位
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 该单位工作时间
     * @return WORK_TIME 该单位工作时间
     */
    public Integer getWorkTime() {
        return workTime;
    }

    /**
     * 该单位工作时间
     * @param workTime 该单位工作时间
     */
    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    /**
     * 该单位工作时间单位
     * @return WORK_TIME_UNIT 该单位工作时间单位
     */
    public String getWorkTimeUnit() {
        return workTimeUnit;
    }

    /**
     * 该单位工作时间单位
     * @param workTimeUnit 该单位工作时间单位
     */
    public void setWorkTimeUnit(String workTimeUnit) {
        this.workTimeUnit = workTimeUnit == null ? null : workTimeUnit.trim();
    }

    /**
     * 客户所在地域
     * @return CLIENT_AREA 客户所在地域
     */
    public String getClientArea() {
        return clientArea;
    }

    /**
     * 客户所在地域
     * @param clientArea 客户所在地域
     */
    public void setClientArea(String clientArea) {
        this.clientArea = clientArea == null ? null : clientArea.trim();
    }

    /**
     * 客户类型
     * @return CLIENT_TYPE 客户类型
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * 客户类型
     * @param clientType 客户类型
     */
    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    /**
     * 家庭地址_国家
     * @return F_NATION 家庭地址_国家
     */
    public String getfNation() {
        return fNation;
    }

    /**
     * 家庭地址_国家
     * @param fNation 家庭地址_国家
     */
    public void setfNation(String fNation) {
        this.fNation = fNation == null ? null : fNation.trim();
    }

    /**
     * 家庭地址_省州
     * @return F_PROVINCE 家庭地址_省州
     */
    public String getfProvince() {
        return fProvince;
    }

    /**
     * 家庭地址_省州
     * @param fProvince 家庭地址_省州
     */
    public void setfProvince(String fProvince) {
        this.fProvince = fProvince == null ? null : fProvince.trim();
    }

    /**
     * 家庭地址_城市
     * @return F_CITY 家庭地址_城市
     */
    public String getfCity() {
        return fCity;
    }

    /**
     * 家庭地址_城市
     * @param fCity 家庭地址_城市
     */
    public void setfCity(String fCity) {
        this.fCity = fCity == null ? null : fCity.trim();
    }

    /**
     * 家庭地址_区县
     * @return F_AREA 家庭地址_区县
     */
    public String getfArea() {
        return fArea;
    }

    /**
     * 家庭地址_区县
     * @param fArea 家庭地址_区县
     */
    public void setfArea(String fArea) {
        this.fArea = fArea == null ? null : fArea.trim();
    }

    /**
     * 家庭地址_街道单元
     * @return F_STREET 家庭地址_街道单元
     */
    public String getfStreet() {
        return fStreet;
    }

    /**
     * 家庭地址_街道单元
     * @param fStreet 家庭地址_街道单元
     */
    public void setfStreet(String fStreet) {
        this.fStreet = fStreet == null ? null : fStreet.trim();
    }

    /**
     * 家庭地址_邮政编码
     * @return F_ZIPCODE 家庭地址_邮政编码
     */
    public String getfZipcode() {
        return fZipcode;
    }

    /**
     * 家庭地址_邮政编码
     * @param fZipcode 家庭地址_邮政编码
     */
    public void setfZipcode(String fZipcode) {
        this.fZipcode = fZipcode == null ? null : fZipcode.trim();
    }

    /**
     * 公司地址_国家
     * @return C_NATION 公司地址_国家
     */
    public String getcNation() {
        return cNation;
    }

    /**
     * 公司地址_国家
     * @param cNation 公司地址_国家
     */
    public void setcNation(String cNation) {
        this.cNation = cNation == null ? null : cNation.trim();
    }

    /**
     * 公司地址_省州
     * @return C_PROVINCE 公司地址_省州
     */
    public String getcProvince() {
        return cProvince;
    }

    /**
     * 公司地址_省州
     * @param cProvince 公司地址_省州
     */
    public void setcProvince(String cProvince) {
        this.cProvince = cProvince == null ? null : cProvince.trim();
    }

    /**
     * 公司地址_城市
     * @return C_CITY 公司地址_城市
     */
    public String getcCity() {
        return cCity;
    }

    /**
     * 公司地址_城市
     * @param cCity 公司地址_城市
     */
    public void setcCity(String cCity) {
        this.cCity = cCity == null ? null : cCity.trim();
    }

    /**
     * 公司地址_区县
     * @return C_AREA 公司地址_区县
     */
    public String getcArea() {
        return cArea;
    }

    /**
     * 公司地址_区县
     * @param cArea 公司地址_区县
     */
    public void setcArea(String cArea) {
        this.cArea = cArea == null ? null : cArea.trim();
    }

    /**
     * 公司地址_街道单元
     * @return C_STREET 公司地址_街道单元
     */
    public String getcStreet() {
        return cStreet;
    }

    /**
     * 公司地址_街道单元
     * @param cStreet 公司地址_街道单元
     */
    public void setcStreet(String cStreet) {
        this.cStreet = cStreet == null ? null : cStreet.trim();
    }

    /**
     * 公司地址_邮政编码
     * @return C_ZIPCODE 公司地址_邮政编码
     */
    public String getcZipcode() {
        return cZipcode;
    }

    /**
     * 公司地址_邮政编码
     * @param cZipcode 公司地址_邮政编码
     */
    public void setcZipcode(String cZipcode) {
        this.cZipcode = cZipcode == null ? null : cZipcode.trim();
    }

    /**
     * 移动电话1
     * @return MOBILE1 移动电话1
     */
    public String getMobile1() {
        return mobile1;
    }

    /**
     * 移动电话1
     * @param mobile1 移动电话1
     */
    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1 == null ? null : mobile1.trim();
    }

    /**
     * 移动电话2
     * @return MOBILE2 移动电话2
     */
    public String getMobile2() {
        return mobile2;
    }

    /**
     * 移动电话2
     * @param mobile2 移动电话2
     */
    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2 == null ? null : mobile2.trim();
    }

    /**
     * 移动电话3
     * @return MOBILE3 移动电话3
     */
    public String getMobile3() {
        return mobile3;
    }

    /**
     * 移动电话3
     * @param mobile3 移动电话3
     */
    public void setMobile3(String mobile3) {
        this.mobile3 = mobile3 == null ? null : mobile3.trim();
    }

    /**
     * 家庭电话1 
     * @return F_TEL1 家庭电话1 
     */
    public String getfTel1() {
        return fTel1;
    }

    /**
     * 家庭电话1 
     * @param fTel1 家庭电话1 
     */
    public void setfTel1(String fTel1) {
        this.fTel1 = fTel1 == null ? null : fTel1.trim();
    }

    /**
     * 家庭电话2
     * @return F_TEL2 家庭电话2
     */
    public String getfTel2() {
        return fTel2;
    }

    /**
     * 家庭电话2
     * @param fTel2 家庭电话2
     */
    public void setfTel2(String fTel2) {
        this.fTel2 = fTel2 == null ? null : fTel2.trim();
    }

    /**
     * 家庭电话3
     * @return F_TEL3 家庭电话3
     */
    public String getfTel3() {
        return fTel3;
    }

    /**
     * 家庭电话3
     * @param fTel3 家庭电话3
     */
    public void setfTel3(String fTel3) {
        this.fTel3 = fTel3 == null ? null : fTel3.trim();
    }

    /**
     * 公司电话1
     * @return C_TEL1 公司电话1
     */
    public String getcTel1() {
        return cTel1;
    }

    /**
     * 公司电话1
     * @param cTel1 公司电话1
     */
    public void setcTel1(String cTel1) {
        this.cTel1 = cTel1 == null ? null : cTel1.trim();
    }

    /**
     * 公司电话2
     * @return C_TEL2 公司电话2
     */
    public String getcTel2() {
        return cTel2;
    }

    /**
     * 公司电话2
     * @param cTel2 公司电话2
     */
    public void setcTel2(String cTel2) {
        this.cTel2 = cTel2 == null ? null : cTel2.trim();
    }

    /**
     * 公司电话3
     * @return C_TEL3 公司电话3
     */
    public String getcTel3() {
        return cTel3;
    }

    /**
     * 公司电话3
     * @param cTel3 公司电话3
     */
    public void setcTel3(String cTel3) {
        this.cTel3 = cTel3 == null ? null : cTel3.trim();
    }

    /**
     * 电子邮箱1
     * @return EMAIL1 电子邮箱1
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * 电子邮箱1
     * @param email1 电子邮箱1
     */
    public void setEmail1(String email1) {
        this.email1 = email1 == null ? null : email1.trim();
    }

    /**
     * 电子邮箱2
     * @return EMAIL2 电子邮箱2
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * 电子邮箱2
     * @param email2 电子邮箱2
     */
    public void setEmail2(String email2) {
        this.email2 = email2 == null ? null : email2.trim();
    }

    /**
     * 电子邮箱3
     * @return EMAIL3 电子邮箱3
     */
    public String getEmail3() {
        return email3;
    }

    /**
     * 电子邮箱3
     * @param email3 电子邮箱3
     */
    public void setEmail3(String email3) {
        this.email3 = email3 == null ? null : email3.trim();
    }

    /**
     * 信用卡额度
     * @return CREDIT_AMOUNT 信用卡额度
     */
    public Integer getCreditAmount() {
        return creditAmount;
    }

    /**
     * 信用卡额度
     * @param creditAmount 信用卡额度
     */
    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 是否拥有社保基金 Y：有  N：无
     * @return SOCIALl_SECURITY 是否拥有社保基金 Y：有  N：无
     */
    public String getSociallSecurity() {
        return sociallSecurity;
    }

    /**
     * 是否拥有社保基金 Y：有  N：无
     * @param sociallSecurity 是否拥有社保基金 Y：有  N：无
     */
    public void setSociallSecurity(String sociallSecurity) {
        this.sociallSecurity = sociallSecurity == null ? null : sociallSecurity.trim();
    }

    /**
     * 创建者
     * @return CREATOR 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建者
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 末次修改者
     * @return UPDATER 末次修改者
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 末次修改者
     * @param updater 末次修改者
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * 末次修改时间
     * @return UPDATE_TIME 末次修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 末次修改时间
     * @param updateTime 末次修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 修改类型
     * @return UPDATE_TYPE 修改类型
     */
    public String getUpdateType() {
        return updateType;
    }

    /**
     * 修改类型
     * @param updateType 修改类型
     */
    public void setUpdateType(String updateType) {
        this.updateType = updateType == null ? null : updateType.trim();
    }
}
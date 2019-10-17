package com.fxkj.ssc.enums;

public enum ContractEnum {
    FINAL_PAGE_NUMBER(1,"当前页"),
    FINAL_PAGE_SIZE(10,"每页显示数量"),
    CONTRACT_CONFIRMED(0,"契约已确认,将立即生效"),
    CONTRACT_STATUS_ERROR(-1,"契约确认状态错误"),
    CONTRACT_REFUSED(0,"契约被拒绝"),
    CONTRACT_REFUSE_MESSAGE_CONTENT(1,"变更的契约已经被下级拒绝，你可以重新发起契约变更"),
    CONTRACT_REFUSE_MESSAGE_TITLE(2,"契约已经被拒绝"),
    CONTRACT_CONFIRME_EXCEPTION(-1,"契约确认异常"),
    REVOKED_CONTRACT_CONFIRMED(0,"撤销契约请求已被确认，将立即生效"),
    REVOKED_CONTRACT_TITLE(0,"契约撤销请求"),
    REVOKED_CONTRACT_CONTENT(0,"上级撤销契约请求，若同意撤销契约，将不再有分红，除非上级重新发起契约申请"),
    REVOKEING_CONTRACT(0,"契约撤销中，等待下级确认"),
    REVOKED_CONTRACT_FAILD(-1,"撤销契约失败"),
    REVOKED_CONTRACT_EXCEPTION(-1,"撤销契约异常"),
    CONTRACT_UNCONFIRMED(0,"下级有契约变更没有确认，不能撤销"),
    REVOKED_CONTRACT_UNCONFIRMED_SUCCESS(0,"撤销未确认契约成功"),
    DAILY_WAGES_FINAL_AMOUNT(0,"日工资不满足发放条件默认金额为0"),
    DAILY_WAGES_UNSUNINGCONDITION_STATUS(0,"不满足日工资发放条件"),
    DAILY_WAGES_SUNINGCONDITION_STATUS(1,"满足日工资发放条件"),
    DAILY_WAGES_UNDISTRIBUTE_STATUS(0,"日工资未发放"),
    DAILY_WAGES_DISTRIBUTE_STATUS(1,"日工资已发放"),
    CONTRACT_BONUS_BALANCE_CHANGE_TYPE(22,"契约分红"),
    CONTRACT_DAILYWAGES_BALANCE_CHANGE_TYPE(21,"契约日工资"),
    DAY_BONUS_BALANCE_CHANGE_TYPE(19,"日分红"),
    PLATFORM_BONUS_BALANCE_CHANGE_TYPE(23,"平台分红"),
    DAILYWAGES_BALANCE_CHANGE_TYPE(20,"日工资"),
    ;
    private int    code;
    private String desc;

    private ContractEnum(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}

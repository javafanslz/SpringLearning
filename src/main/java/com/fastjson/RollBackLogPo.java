package com.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <dl>
 * <dt>RollBackLogPo</dt>
 * <dd>Description:回滚日志po</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/27</dd>
 * </dl>
 *
 * @author lizhu
 */
public class RollBackLogPo {

    /**企业名称*/
    @JSONField(name = "entId")
    private String entId;
    /**回滚任务Id*/
    @JSONField(name="taskId")
    private String taskId;
    /**回滚日期*/
    @JSONField(name = "date")
    private String date;
    /**执行时间*/
    @JSONField(name = "operate_date")
    private String operateDate;
    /**备份时长*/
    @JSONField(name ="backup_time")
    private long backUpTime;
    /**删除时长*/
    @JSONField(name ="delete_time")
    private long deleteTime;
    /**重发时长*/
    @JSONField(name ="orig_time")
    private long origTime;
    /**当前状态*/
    @JSONField(name ="state")
    private String state;
    /**备注信息*/
    @JSONField(name = "remark")
    private String remark;
    /**查询开始时间*/
    private String startTime;
    /**查询结束时间*/
    private String endTime;
    /**分页*/
    private int skipRows;
    /**分页*/
    private int limitRows;

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public long getBackUpTime() {
        return backUpTime;
    }

    public void setBackUpTime(long backUpTime) {
        this.backUpTime = backUpTime;
    }

    public long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public long getOrigTime() {
        return origTime;
    }

    public void setOrigTime(long origTime) {
        this.origTime = origTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSkipRows() {
        return skipRows;
    }

    public void setSkipRows(int skipRows) {
        this.skipRows = skipRows;
    }

    public int getLimitRows() {
        return limitRows;
    }

    public void setLimitRows(int limitRows) {
        this.limitRows = limitRows;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "RollBackLogPo{" +
                "entId='" + entId + '\'' +
                ", taskId='" + taskId + '\'' +
                ", date='" + date + '\'' +
                ", operateDate='" + operateDate + '\'' +
                ", backUpTime=" + backUpTime +
                ", deleteTime=" + deleteTime +
                ", origTime=" + origTime +
                ", state='" + state + '\'' +
                ", remark='" + remark + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", skipRows=" + skipRows +
                ", limitRows=" + limitRows +
                '}';
    }
}

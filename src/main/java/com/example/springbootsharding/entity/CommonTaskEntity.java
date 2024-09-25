package com.example.springbootsharding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;

import java.util.Date;

/**
 * @author: yinchao
 * @ClassName: CommonTaskEntity
 * @Description:
 * @team wuhan operational dev.
 * @date: 2024/9/25 10:42
 */
@TableName("tmk_crm_common_task")
public class CommonTaskEntity {

    @TableId(value = "id", type = IdType.AUTO)
    protected Long id;
    protected String taskNumber;
    protected String assignUserNumber;
    protected Integer taskStatus;
    protected Integer changeMobile;
    protected String newMobile;
    protected Long tagId;
    protected String remark;
    protected Date nextFollowTime;
    protected Long totalProcessDuration;
    protected Long totalCallDuration;
    protected Long taskPackageId;
    protected String recordUrl;
    protected Date clueCreateTime;
    protected Date assignTime;
    protected Date createTime;
    protected Date updateTime;
    protected String mobile;
    protected String mobileEncrypted;
    protected String mobileMask;
    protected String mobileHash;
    /**
     * 用户Id
     */
    protected Long userId;
    /**
     * 反馈时间
     */
    protected Date feedbackTime;

    protected Integer markCount;
    protected Integer callCount;
    protected Integer notConnectedCount;
    @Version
    protected Integer version;
    /**
     * tagValue(非表字段)
     */
    @TableField(exist = false)
    protected String tagValue;
    @TableField(value = "scene_id")
    protected String sceneId;
    /**
     * 非表字段，用于统计不同状态的任务数量
     */
    @TableField(exist = false)
    protected Integer taskCount;

    protected Integer remainEditCount;

    /**
     * 有效通话时长
     */
    protected Long effectiveCallDuration;
    /**
     * 归属地
     */
    private String ownerShip;

    /**
     * 统计通话总时长
     */
    @TableField(exist = false)
    private Long totalCallDurationSum;

    /**
     * 分配类型
     */
    private Integer assignType;

    /**
     * 线索池id
     */
    @TableField(exist = false)
    private Long cluePoolId;
    /**
     * 预测式外呼任务id
     */
    protected Long predictTaskId;
    /**
     * 通话状态
     */
    protected Integer callStatus;
    /**
     * 0-人工任务 1-预测式外呼任务
     */
    protected Integer processType;
    protected String checkUserNumber;
    protected String checkRemark;
    protected Integer checkStatus;
    protected Date checkTime;

    protected Integer encryptType;

    /**
     * 最近一个标记的扩展字段
     */
    @TableField(exist = false)
    protected String externalDataStr;

    protected Integer rankValue;

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckUserNumber() {
        return checkUserNumber;
    }

    public void setCheckUserNumber(String checkUserNumber) {
        this.checkUserNumber = checkUserNumber;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public Integer getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(Integer callStatus) {
        this.callStatus = callStatus;
    }

    public Long getPredictTaskId() {
        return predictTaskId;
    }

    public void setPredictTaskId(Long predictTaskId) {
        this.predictTaskId = predictTaskId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getAssignUserNumber() {
        return assignUserNumber;
    }

    public void setAssignUserNumber(String assignUserNumber) {
        this.assignUserNumber = assignUserNumber;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getChangeMobile() {
        return changeMobile;
    }

    public void setChangeMobile(Integer changeMobile) {
        this.changeMobile = changeMobile;
    }

    public String getNewMobile() {
        return newMobile;
    }

    public void setNewMobile(String newMobile) {
        this.newMobile = newMobile;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getNextFollowTime() {
        return nextFollowTime;
    }

    public void setNextFollowTime(Date nextFollowTime) {
        this.nextFollowTime = nextFollowTime;
    }

    public Long getTotalProcessDuration() {
        return totalProcessDuration;
    }

    public void setTotalProcessDuration(Long totalProcessDuration) {
        this.totalProcessDuration = totalProcessDuration;
    }

    public Long getTotalCallDuration() {
        return totalCallDuration;
    }

    public void setTotalCallDuration(Long totalCallDuration) {
        this.totalCallDuration = totalCallDuration;
    }

    public Long getTaskPackageId() {
        return taskPackageId;
    }

    public void setTaskPackageId(Long taskPackageId) {
        this.taskPackageId = taskPackageId;
    }

    public String getRecordUrl() {
        return recordUrl;
    }

    public void setRecordUrl(String recordUrl) {
        this.recordUrl = recordUrl;
    }

    public Date getClueCreateTime() {
        return clueCreateTime;
    }

    public void setClueCreateTime(Date clueCreateTime) {
        this.clueCreateTime = clueCreateTime;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public Integer getMarkCount() {
        return markCount;
    }

    public void setMarkCount(Integer markCount) {
        this.markCount = markCount;
    }

    public Integer getCallCount() {
        return callCount;
    }

    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    public Integer getNotConnectedCount() {
        return notConnectedCount;
    }

    public void setNotConnectedCount(Integer notConnectedCount) {
        this.notConnectedCount = notConnectedCount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public Integer getRemainEditCount() {
        return remainEditCount;
    }

    public void setRemainEditCount(Integer remainEditCount) {
        this.remainEditCount = remainEditCount;
    }

    public Long getEffectiveCallDuration() {
        return effectiveCallDuration;
    }

    public void setEffectiveCallDuration(Long effectiveCallDuration) {
        this.effectiveCallDuration = effectiveCallDuration;
    }

    public String getOwnerShip() {
        return ownerShip;
    }

    public void setOwnerShip(String ownerShip) {
        this.ownerShip = ownerShip;
    }

    public Long getTotalCallDurationSum() {
        return totalCallDurationSum;
    }

    public void setTotalCallDurationSum(Long totalCallDurationSum) {
        this.totalCallDurationSum = totalCallDurationSum;
    }

    public Integer getAssignType() {
        return assignType;
    }

    public void setAssignType(Integer assignType) {
        this.assignType = assignType;
    }

    public Long getCluePoolId() {
        return cluePoolId;
    }

    public void setCluePoolId(Long cluePoolId) {
        this.cluePoolId = cluePoolId;
    }

    public String getMobileEncrypted() {
        return mobileEncrypted;
    }

    public void setMobileEncrypted(String mobileEncrypted) {
        this.mobileEncrypted = mobileEncrypted;
    }

    public String getMobileMask() {
        return mobileMask;
    }

    public void setMobileMask(String mobileMask) {
        this.mobileMask = mobileMask;
    }

    public String getMobileHash() {
        return mobileHash;
    }

    public void setMobileHash(String mobileHash) {
        this.mobileHash = mobileHash;
    }

    public Integer getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
    }

    public String getExternalDataStr() {
        return externalDataStr;
    }

    public void setExternalDataStr(String externalDataStr) {
        this.externalDataStr = externalDataStr;
    }

    public Integer getRankValue() {
        return rankValue;
    }

    public void setRankValue(final Integer rankValue) {
        this.rankValue = rankValue;
    }

    public void setDefaultCallDurationSum() {
        this.totalCallDurationSum = this.totalCallDurationSum == null ? 0L : this.totalCallDurationSum;
    }
}

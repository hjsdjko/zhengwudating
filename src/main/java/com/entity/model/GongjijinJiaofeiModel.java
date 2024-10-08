package com.entity.model;

import com.entity.GongjijinJiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公积金缴费
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongjijinJiaofeiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 公积金缴费编号
     */
    private String gongjijinJiaofeiUuidNumber;


    /**
     * 公积金缴费金额
     */
    private Double gongjijinJiaofeiJine;


    /**
     * 所属月份
     */
    private String yuefenMonth;


    /**
     * 缴费时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：公积金缴费编号
	 */
    public String getGongjijinJiaofeiUuidNumber() {
        return gongjijinJiaofeiUuidNumber;
    }


    /**
	 * 设置：公积金缴费编号
	 */
    public void setGongjijinJiaofeiUuidNumber(String gongjijinJiaofeiUuidNumber) {
        this.gongjijinJiaofeiUuidNumber = gongjijinJiaofeiUuidNumber;
    }
    /**
	 * 获取：公积金缴费金额
	 */
    public Double getGongjijinJiaofeiJine() {
        return gongjijinJiaofeiJine;
    }


    /**
	 * 设置：公积金缴费金额
	 */
    public void setGongjijinJiaofeiJine(Double gongjijinJiaofeiJine) {
        this.gongjijinJiaofeiJine = gongjijinJiaofeiJine;
    }
    /**
	 * 获取：所属月份
	 */
    public String getYuefenMonth() {
        return yuefenMonth;
    }


    /**
	 * 设置：所属月份
	 */
    public void setYuefenMonth(String yuefenMonth) {
        this.yuefenMonth = yuefenMonth;
    }
    /**
	 * 获取：缴费时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：缴费时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

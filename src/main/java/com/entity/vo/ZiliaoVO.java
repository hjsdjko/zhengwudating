package com.entity.vo;

import com.entity.ZiliaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 资料
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ziliao")
public class ZiliaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 资料编号
     */

    @TableField(value = "ziliao_uuid_number")
    private String ziliaoUuidNumber;


    /**
     * 资料名称
     */

    @TableField(value = "ziliao_name")
    private String ziliaoName;


    /**
     * 资料配图
     */

    @TableField(value = "ziliao_photo")
    private String ziliaoPhoto;


    /**
     * 资料类型
     */

    @TableField(value = "ziliao_types")
    private Integer ziliaoTypes;


    /**
     * 资料文件
     */

    @TableField(value = "ziliao_file")
    private String ziliaoFile;


    /**
     * 资料介绍
     */

    @TableField(value = "ziliao_content")
    private String ziliaoContent;


    /**
     * 资料录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：资料编号
	 */
    public String getZiliaoUuidNumber() {
        return ziliaoUuidNumber;
    }


    /**
	 * 获取：资料编号
	 */

    public void setZiliaoUuidNumber(String ziliaoUuidNumber) {
        this.ziliaoUuidNumber = ziliaoUuidNumber;
    }
    /**
	 * 设置：资料名称
	 */
    public String getZiliaoName() {
        return ziliaoName;
    }


    /**
	 * 获取：资料名称
	 */

    public void setZiliaoName(String ziliaoName) {
        this.ziliaoName = ziliaoName;
    }
    /**
	 * 设置：资料配图
	 */
    public String getZiliaoPhoto() {
        return ziliaoPhoto;
    }


    /**
	 * 获取：资料配图
	 */

    public void setZiliaoPhoto(String ziliaoPhoto) {
        this.ziliaoPhoto = ziliaoPhoto;
    }
    /**
	 * 设置：资料类型
	 */
    public Integer getZiliaoTypes() {
        return ziliaoTypes;
    }


    /**
	 * 获取：资料类型
	 */

    public void setZiliaoTypes(Integer ziliaoTypes) {
        this.ziliaoTypes = ziliaoTypes;
    }
    /**
	 * 设置：资料文件
	 */
    public String getZiliaoFile() {
        return ziliaoFile;
    }


    /**
	 * 获取：资料文件
	 */

    public void setZiliaoFile(String ziliaoFile) {
        this.ziliaoFile = ziliaoFile;
    }
    /**
	 * 设置：资料介绍
	 */
    public String getZiliaoContent() {
        return ziliaoContent;
    }


    /**
	 * 获取：资料介绍
	 */

    public void setZiliaoContent(String ziliaoContent) {
        this.ziliaoContent = ziliaoContent;
    }
    /**
	 * 设置：资料录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：资料录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

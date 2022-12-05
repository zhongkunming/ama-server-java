package cn.ama.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统序列号表
 */
@Data
@TableName(value = "sys_sequence")
public class SysSequence implements Serializable {
    /**
     * 序列号名称
     */
    @TableId(value = "sequence_name", type = IdType.INPUT)
    private String sequenceName;

    /**
     * 序列当前
     */
    @TableField(value = "current_val")
    private Long currentVal;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_SEQUENCE_NAME = "sequence_name";

    public static final String COL_CURRENT_VAL = "current_val";

    public static final String COL_CREATE_TIME = "create_time";
}
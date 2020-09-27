package site.waconde.gaussDBLearn.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author side.wang
 * @description 所有实体的共有信息
 * @date 2020-09-23
 */
@Data
@ToString
public class BaseInfo implements Serializable {
    private String creator;
    private String modifier;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date modifyTime;
    private Boolean deleted = false;
}

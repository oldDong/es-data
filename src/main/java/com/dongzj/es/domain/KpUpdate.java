package com.dongzj.es.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/8
 * Time: 14:01
 */
@Data
@Document(indexName = "crm_opr_kp_update", type = "crm_opr_kp_update")
public class KpUpdate {

    /**
     * 使用ES自动生成的id
     * GUID: 20个字符，URL安全，base64编码
     */
    @Id
    private String id;

    /**
     * 用户ID
     */
    private Long uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 企业ID
     */
    private Long orgid;

    /**
     * 企业名称
     */
    private String orgname;

    /**
     * 地区
     */
    private String city;

    /**
     * 类型
     * 私企、政府、国企、银行 ...
     */
    private String type;

    /**
     * 一级行业
     */
    private String firstclass;

    /**
     * 二级行业
     */
    private String secondclass;

    /**
     * 规模
     * 100-500人
     * 500-1000人
     * ...
     */
    private Integer usercount;

    /**
     * 活跃
     */
    private Integer account;

    /**
     * 激活总人数
     */
    private Integer uvcount;

    /**
     * 激活
     */
    private Float uvrate;

    /**
     * 是否设置签到
     */
    private String qdset;

    /**
     * 签到设置人数
     */
    private Integer qdusercount;

    /**
     * 职位
     */
    private String depttitles;

    /**
     * 上个月登录次数
     */
    private Integer lastuv;

    /**
     * 标签
     */
    private String tags;
}

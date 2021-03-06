package com.google.model.msg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @Author YC
 * @create 2020/3/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Music {

    // 消息标题
    @XmlElement(name = "Title")
    private String title;

    // 消息描述
    @XmlElement(name = "Description")
    private String description;

    // 音乐链接
    @XmlElement(name = "MusicURL")
    private String musicURL;

    // 高质量音乐链接，WIFI环境优先使用该链接播放音乐
    @XmlElement(name = "HQMusicUrl")
    private String hQMusicUrl;

    // 缩略图的媒体id
    @XmlElement(name = "ThumbMediaId")
    private String thumbMediaId;
}

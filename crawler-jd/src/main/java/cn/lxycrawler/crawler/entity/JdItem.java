package cn.lxycrawler.crawler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 京东商品表(JdItem)实体类
 *
 * @author makejava
 * @since 2020-02-14 21:09:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JdItem implements Serializable {
    private static final long serialVersionUID = -41827931978978651L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 商品集合id
     */
    private Long spu;
    /**
     * 商品最小品类单元id
     */
    private Long sku;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品价格
     */
    private Double price;
    /**
     * 商品图片
     */
    private String pic;
    /**
     * 商品详情地址
     */
    private String url;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpu() {
        return spu;
    }

    public void setSpu(Long spu) {
        this.spu = spu;
    }

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}
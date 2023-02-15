package com.wms.entity;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author lhj
 * @since 2022-12-16
 */
@Data
public class RecordRes extends  Record{

    private String username;
    private String adminname;
    private String goodsname;
    private String storagename;
    private String goodstypename;
}

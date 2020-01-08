/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: BasDeliveryStandardDao
 * Author:   TSYH
 * Date:     2020-01-06 19:18
 * Description:
 * History:
 * <author>     <time>       <version>     <desc>
 * 作者姓名    修改时间     版本号       描述
 */
package com.hongqi.springboot.dao;

import com.hongqi.springboot.model.BasDeliveryStandard;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author TSYH
 * @create 2020-01-06
 * @since 1.0.0
 */
@Repository
public interface BasDeliveryStandardDao {

    /**
     * 查询所有收派标准
     * @return
     */
    List<BasDeliveryStandard> findStandards();

    /**
     * 修改是否作废标签
     */
    void updateInvalidateSign(BasDeliveryStandard basDeliveryStandard);

    /**
     * 作废
     * @param ids
     */
    void updateInvalidateSign(@Param("ids") List ids);

    /**
     * 根据id查询收派标准
     */
    BasDeliveryStandard queryById(@Param("id") Integer id);

    /**
     * 修改用户
     */
    void updateStandards(BasDeliveryStandard basDeliveryStandard);
}
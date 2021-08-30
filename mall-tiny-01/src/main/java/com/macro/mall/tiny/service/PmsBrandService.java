package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author likewei
 * @date 2021年08月26日 11:35
 */
public interface PmsBrandService {
    /**
     * 查询所有品牌信息
     * @return List<PmsBrand>
     */
    List<PmsBrand> listAllBrand();
    /**
     * 创建新的品牌信息
     * @param brand 品牌详细信息
     * @return int
     */
    int createBrand(PmsBrand brand);
    /**
     * 更新品牌信息
     * @param id 品牌ID
     * @param brand 品牌详细信息
     * @return int
     */
    int updateBrand(Long id, PmsBrand brand);
    /**
     * 删除品牌信息
     * @param id 品牌ID
     * @return int
     */
    int deleteBrand(Long id);
    /**
     * 查询所有品牌信息（分页功能）
     * @param pageNum pageNum
     * @param pageSize  pageSize
     * @return  List<PmsBrand>
     */
    List<PmsBrand> listBrand(int pageNum, int pageSize);
    /**
     * 获取品牌信息详细信息
     * @param id ID
     * @return PmsBrand
     */
    PmsBrand getBrand(Long id);
}

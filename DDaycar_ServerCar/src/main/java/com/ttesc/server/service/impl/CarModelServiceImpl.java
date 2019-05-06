package com.ttesc.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ttesc.entity.car.Carmodel;
import com.ttesc.server.dao.CarModelDao;
import com.ttesc.server.service.CarModelService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Feri
 * @since 2019-05-06
 */
@Service
public class CarModelServiceImpl extends ServiceImpl<CarModelDao, Carmodel> implements CarModelService {

}

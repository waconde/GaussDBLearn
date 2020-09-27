package site.waconde.springTest.service.impl;

import site.waconde.springTest.entity.SideTest;
import site.waconde.springTest.mapper.SideTestMapper;
import site.waconde.springTest.service.ISideTestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author side.wang
 * @since 2020-09-23
 */
@Service
public class SideTestServiceImpl extends ServiceImpl<SideTestMapper, SideTest> implements ISideTestService {

}

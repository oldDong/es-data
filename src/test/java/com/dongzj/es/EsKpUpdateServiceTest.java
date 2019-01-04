package com.dongzj.es;

import com.dongzj.es.domain.KpUpdate;
import com.dongzj.es.service.EsKpUpdateService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/8
 * Time: 15:03
 */
public class EsKpUpdateServiceTest extends EsApplicationTests {

    @Autowired
    private EsKpUpdateService service;

    @Test
    public void testGetKpUpdate() {
        Long orgid = 5717608611L;
        Long uid = 12133200L;
        KpUpdate kpUpdate = service.getKpUpdate(orgid, uid);
        System.out.println(kpUpdate);
    }
}

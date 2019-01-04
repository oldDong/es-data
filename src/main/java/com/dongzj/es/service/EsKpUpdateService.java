package com.dongzj.es.service;

import com.dongzj.es.domain.KpUpdate;
import com.dongzj.es.repository.KpUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/8
 * Time: 15:00
 */
@Service
public class EsKpUpdateService {

    @Autowired
    private KpUpdateRepository kpUpdateRepository;

    /**
     * 根据企业ID和用户ID查询对象
     *
     * @param orgid
     * @param uid
     * @return
     */
    public KpUpdate getKpUpdate(Long orgid, Long uid) {
        List<KpUpdate> kpUpdateList = kpUpdateRepository.findKpUpdatesByOrgidAndUid(orgid, uid);
        if (kpUpdateList.isEmpty()) {
            return null;
        } else {
            return kpUpdateList.get(0);
        }
    }
}

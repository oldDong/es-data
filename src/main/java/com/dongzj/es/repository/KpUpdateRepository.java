package com.dongzj.es.repository;

import com.dongzj.es.domain.KpUpdate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/11/8
 * Time: 14:03
 */
public interface KpUpdateRepository extends ElasticsearchRepository<KpUpdate, String> {

    List<KpUpdate> findKpUpdatesByOrgidAndUid(Long orgid, Long uid);


}

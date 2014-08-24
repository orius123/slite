package com.hp.score.engine.data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: froelica
 * Date: 4/29/13
 * Time: 10:05 AM
 */
public interface IdentityGenerator {

    Long next();

    List<Long> bulk(int bulkSize);
}
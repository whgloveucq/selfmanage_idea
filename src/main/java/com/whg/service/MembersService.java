package com.whg.service;

import com.whg.entity.Members;

/**
 * Created by whg at 18-9-9
 * Included in selfmanage_idea
 * Go ahead ,do what you say and say what you do .
 **/
public interface MembersService {
    public Members selectByPrimaryKey(String id);
}

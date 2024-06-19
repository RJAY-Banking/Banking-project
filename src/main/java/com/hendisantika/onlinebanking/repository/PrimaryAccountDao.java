package com.hendisantika.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.hendisantika.onlinebanking.entity.PrimaryAccount;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/08/18
 * Time: 06.04
 * To change this template use File | Settings | File Templates.
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
    
  
}
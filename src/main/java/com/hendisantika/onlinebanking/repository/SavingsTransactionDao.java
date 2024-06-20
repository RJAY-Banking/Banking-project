package com.hendisantika.onlinebanking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hendisantika.onlinebanking.entity.SavingsTransaction;

/**
 * Created by IntelliJ IDEA. Project : online-banking User: hendisantika Email:
 * hendisantika@gmail.com Telegram : @hendisantika34 Date: 08/08/18 Time: 06.08
 * To change this template use File | Settings | File Templates.
 */
public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

	List<SavingsTransaction> findAll();

}
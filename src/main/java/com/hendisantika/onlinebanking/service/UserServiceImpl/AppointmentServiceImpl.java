package com.hendisantika.onlinebanking.service.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hendisantika.onlinebanking.entity.Appointment;
import com.hendisantika.onlinebanking.entity.User;
import com.hendisantika.onlinebanking.repository.AppointmentDao;
import com.hendisantika.onlinebanking.service.AppointmentService;

import lombok.RequiredArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/08/18
 * Time: 04.38
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentDao appointmentDao;
    



    public Appointment createAppointment(Appointment appointment) {
        return appointmentDao.save(appointment);
    }

    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }

    public Appointment findAppointment(Long id) {
        return appointmentDao.findById(id).get();
    }

    public void confirmAppointment(Long id) {
        Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
    }

	@Override
	public List<Appointment> findByUser(User user) {
		   return appointmentDao.findByUser(user);
	}


}

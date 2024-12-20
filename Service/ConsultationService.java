package com.example.teleconsultationbackend.Service;

import com.example.teleconsultationbackend.DTO.ConsultationDetails;
import com.example.teleconsultationbackend.DTO.DateWiseConsultations;
import com.example.teleconsultationbackend.DTO.MonthWiseConsultation;
import com.example.teleconsultationbackend.Entity.Consultation;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ConsultationService {
    public int total_consultation();
    List<DateWiseConsultations> totalDateWiseConsultations();
    List<MonthWiseConsultation> totalMonthWiseConsultations(Long doctorId);

    Long totalConsultationByDoctor(Long doctorId);
    List<ConsultationDetails> totalConsultationByDep(Long depId, Long hospitalId);


    Long totalConsultationByPatient(Long patientId);


    void addConsultationStatusWaitinghelper(Long patientId, Long depId);

    void setStatusToAcceptedHelper(Long doctorId, Long patientId);

    String getRepeatStatusHelper(Long patientId, Long doctorId);
}
